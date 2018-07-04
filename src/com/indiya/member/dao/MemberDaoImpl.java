package com.indiya.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.indiya.member.model.MemberDto;
import com.indiya.member.model.MusicianChangeDto;
import com.indiya.member.model.ZipDto;
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
	public List<ZipDto> zipSearch(String dong) {
		List<ZipDto> list = new ArrayList<ZipDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn=DBConnection.makeConnection();
			String sql = "";
			sql += "select zipcode, sido || ' ' || gugun || ' ' || doro as address \n";
			sql += "from zipcode \n";
			sql += "where doro like '%'||?||'%'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dong);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ZipDto zipDto = new ZipDto();
				zipDto.setZipcode(rs.getString("zipcode"));
				zipDto.setAddress(rs.getString("address"));
				
				list.add(zipDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		return list;
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
			sql += "	into bmember (name, id, pass, email1, email2, zipNo, roadAddrpart1, addrDetail, tel1, tel2, tel3, sex, find_pass, find_pass_check) \n";
			sql += "	values (?, member_seq.nextval, ?, ?, ?, ?, ?,?,?,?,?,?,?,?) \n";
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
			pstmt.setInt(++idx, memberDto.getTel1());
			pstmt.setInt(++idx, memberDto.getTel2());
			pstmt.setInt(++idx, memberDto.getTel3());
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
			pstmt.setInt(++idx, memberDto.getTel1());
			pstmt.setInt(++idx, memberDto.getTel2());
			pstmt.setInt(++idx, memberDto.getTel3());
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
}