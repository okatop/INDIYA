package com.indiya.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Map;

import com.indiya.member.model.MemberDto;
import com.indiya.member.model.MypicDto;
import com.indiya.musician.model.MusicianDto;
import com.indiya.util.DBClose;
import com.indiya.util.DBConnection;

public class MemberDaoImpl implements MemberDao {

	private static MemberDao memberDao;
	
	static {
		memberDao = new MemberDaoImpl();
	}
	
	private MemberDaoImpl() {}
	
	public static MemberDao getMemberDao() {
		return memberDao;
	}
	
	@Override
	public int idCheck(String id) {
		int cnt = 1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn=DBConnection.makeConnection();
			String sql = "";
			sql += "select count(id) cnt \n";
			sql += "from member \n";
			sql += "where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt(1);
		} catch (SQLException e) {
			cnt=1;
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		
		return cnt;
	}


	@Override
	public int registerMember(MemberDto memberDto) {
		int cnt= 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.makeConnection();
			String sql = "";
			sql += "insert \n";
			sql += "	into member (name, id, pass, email1, email2, zipNo, roadAddrpart1, addrDetail, tel1, tel2, tel3,join_date, sex, find_pass, find_pass_check) \n";
			sql += "	values (?, ?, ?, ?, ?, ?, ?,?,?,?,?,sysdate,?,?,?) \n";
			pstmt = conn.prepareStatement(sql);
			int idx = 0;
			pstmt.setString(++idx, memberDto.getName());
			pstmt.setString(++idx, memberDto.getId());
			pstmt.setString(++idx, memberDto.getPass());
			pstmt.setString(++idx, memberDto.getEmail1());
			pstmt.setString(++idx, memberDto.getEmail2());
			pstmt.setString(++idx, memberDto.getZipNo());
			pstmt.setString(++idx, memberDto.getRoadAddrpart1());
			pstmt.setString(++idx, memberDto.getAddrDetail());
			pstmt.setString(++idx, memberDto.getTel1());
			pstmt.setString(++idx, memberDto.getTel2());
			pstmt.setString(++idx, memberDto.getTel3());
			pstmt.setString(++idx, memberDto.getSex());
			pstmt.setString(++idx, memberDto.getFind_pass());
			pstmt.setString(++idx, memberDto.getFind_pass_check());
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public MemberDto getMember(String id) {
		return null;
	}

	@Override
	public int modifyMember(MemberDto memberDto) {
		int cnt= 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.makeConnection();
			String sql = "";
			sql += "update member m \n";
			sql += "	set(m.id, m.name, m.pass, m.email1, m.email2, m.zipNo, m.roadAddrpart1, m.addrDetail, m.tel1, m,tel2, \r\n" + 
					"m.tel3, m.sex, m.find_pass, m.find_pass_check) \n";
			sql += "= (select b.id, b.name, b.pass, b.email1, b.emial2, \r\n" + 
					"b.zipNo, b.roadAddrpart1, b.addrDetail, b.tel1, b.tel2, b.tel3, b.sex, b.find_pass, b.find_pass_check \r\n" + 
					"from member b where m.id = b.id); \n";

			pstmt = conn.prepareStatement(sql);
			int idx = 0;
			pstmt.setString(++idx, memberDto.getName());
			pstmt.setString(++idx, memberDto.getId());
			pstmt.setString(++idx, memberDto.getPass());
			pstmt.setString(++idx, memberDto.getEmail1());
			pstmt.setString(++idx, memberDto.getEmail2());
			pstmt.setString(++idx, memberDto.getZipNo());
			pstmt.setString(++idx, memberDto.getRoadAddrpart1());
			pstmt.setString(++idx, memberDto.getAddrDetail());
			pstmt.setString(++idx, memberDto.getTel1());
			pstmt.setString(++idx, memberDto.getTel2());
			pstmt.setString(++idx, memberDto.getTel3());
			pstmt.setString(++idx, memberDto.getSex());
			pstmt.setString(++idx, memberDto.getFind_pass());
			pstmt.setString(++idx, memberDto.getFind_pass_check());
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public void deleteMember(String id) {
	}

	@Override
	public MemberDto login(Map<String, String> map) {
		MemberDto memberDto =null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.makeConnection();
			String sql = "";
			sql += "select id, name \n";
			sql += "from member \n";
			sql += "where id = ? and pass = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, map.get("userid"));
			pstmt.setString(2, map.get("userpass"));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				memberDto = new MemberDto();
				memberDto.setId(rs.getString("id"));
				memberDto.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt, rs);
		}
		return memberDto;
	}

	@Override
	public int uploadFile(MypicDto mypicDto) {
		Connection conn = null;
    	PreparedStatement pstmt = null;
    	int cnt =0;
    	MypicDto dto = null;
    	
    	try {
    		conn = DBConnection.makeConnection();
        	StringBuffer sql = new StringBuffer();
        	sql.append("insert into fileboard(num, filename) \n");
        	sql.append("	values(filenum_seq.nextval, ?) \n");
        	
			pstmt = conn.prepareStatement(sql.toString());
			int idx = 0;
			pstmt.setString(++idx, dto.getFileName());
			cnt=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
          return cnt;
    }

	@Override
	public MypicDto selectOne(int num) {
		Connection conn = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	MypicDto dto =null;
    	
    	try {
    		conn=DBConnection.makeConnection();
        	StringBuffer sql = new StringBuffer();
        	sql.append("select * \n");
        	sql.append("from Memberpicture \n");
        	sql.append("where num =? \n");
        	pstmt = conn.prepareStatement(sql.toString());
        	pstmt.setInt(1, num);
        	rs = pstmt.executeQuery();
        	
			while(rs.next()) {
			dto.setNum(rs.getInt("num"));
			dto.setFileName(rs.getString("filename"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt, rs);
		}
		return dto;
	}

	@Override
	public int changeMusician(MusicianDto musician) {
		int cnt= 0;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	     
	    try {
	        conn = DBConnection.makeConnection();
	        conn.setAutoCommit(false);
	        String sql = "update member set musician_flag = 'Y' where id = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, musician.getMusician_id());
	        pstmt.executeUpdate();
	        pstmt.close();
	     
	        sql = "insert into musician(musician_id, musician_name, musician_info, genre, area, pic) \n";
	        sql += " values(?, ?, ?, ?, ?, ?)";
	        System.out.println(sql);
	        pstmt = conn.prepareStatement(sql);
	        int idx = 0;
	 
	        pstmt.setString(++idx, musician.getMusician_id());
	        pstmt.setString(++idx, musician.getMusician_name());
	        pstmt.setString(++idx, musician.getMusician_info());
	        pstmt.setString(++idx, musician.getGenre());
	        pstmt.setString(++idx, musician.getArea());
	        pstmt.setString(++idx, musician.getPic());
	        cnt = pstmt.executeUpdate();
	        conn.commit();
	    } catch (SQLException e) {
	        cnt = 0;
	        e.printStackTrace();
	        try {
	            conn.rollback();
	        } catch (SQLException e1) {
	            e1.printStackTrace();
	        }
	    }
	    return cnt;
	}
}
