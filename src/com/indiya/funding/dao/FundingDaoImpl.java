package com.indiya.funding.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.indiya.funding.model.FundingDto;
import com.indiya.funding.model.FundingRewardDto;
import com.indiya.util.DBClose;
import com.indiya.util.DBConnection;

public class FundingDaoImpl implements FundingDao {

	private static FundingDao fundingDao;
	
	static {
		fundingDao = new FundingDaoImpl();
	}
	
	private FundingDaoImpl() {}
	
	public static FundingDao getFundingDao() {
		return fundingDao;
	}

	
	@Override
	public int getNextSeq() {
		int seq = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.makeConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select funding_seq.nextval seq \n");
			sql.append("from dual");
			
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			rs.next();
			seq = rs.getInt("seq");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt, rs);
		}
		return seq;
	}
	
	@Override
	public List<FundingDto> getFundingList(Map<String, String> map) {
		List<FundingDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.makeConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select f.no, f.musician_id, f.category, f.goal, f.open, f.close, f.pic, f.title, f.contents, f.write_date, \n");
			sql.append("s.amount, s.status \n");
			sql.append("from funding f, funding_status s \n");
			sql.append("where f.no = s.no \n");
			//sql.append("order by close desc");
			//TODO map占쏙옙 占싯삼옙 占쏙옙占쏙옙(占싱몌옙 占쏙옙), 占쏙옙占쏙옙(占쏙옙占쏙옙, 占쏙옙占�, 占쏙옙占쏙옙)
			
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				FundingDto fundingDto = new FundingDto();
				fundingDto.setNo(rs.getInt("no"));
				fundingDto.setMusician_id(rs.getString("musician_id"));
				fundingDto.setCategory(rs.getString("category"));
				fundingDto.setGoal(rs.getInt("goal"));
				fundingDto.setOpen(rs.getString("open"));
				fundingDto.setClose(rs.getString("close"));
				fundingDto.setPic(rs.getString("pic"));
				fundingDto.setTitle(rs.getString("title"));
				fundingDto.setContents(rs.getString("contents"));
				fundingDto.setWrite_date(rs.getString("write_date"));
				fundingDto.setAmount(rs.getInt("amount"));
				fundingDto.setStatus(rs.getString("status"));
				list.add(fundingDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		return list;
	}
	
	@Override
	public List<FundingRewardDto> getFundingRewardList(int no) {
		List<FundingRewardDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.makeConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select r.no, r.amount, r.pic, r.title, r.contents \n");
			sql.append("from funding f, funding_reward r \n");
			sql.append("where r.no = f.no \n");
			sql.append("and f.no = ? \n");
			sql.append("order by amount asc");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				FundingRewardDto rewardDto = new FundingRewardDto();
				rewardDto.setNo(rs.getInt("no"));
				rewardDto.setAmount(rs.getInt("amount"));
				rewardDto.setPic(rs.getString("pic"));
				rewardDto.setTitle(rs.getString("title"));
				rewardDto.setContents(rs.getString("contents"));
				
				list.add(rewardDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		return list;
	}

	@Override
	public FundingDto viewFundingDetail(int no) {
		FundingDto fundingDto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.makeConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select f.no, f.musician_id, f.category, f.goal, f.open, f.close, f.pic, f.title, f.contents, f.write_date, \n");
			sql.append("s.amount, s.status \n");
			sql.append("from funding f, funding_status s \n");
			sql.append("where f.no = s.no \n");
			sql.append("and f.no = ? \n");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			rs.next();
			fundingDto = new FundingDto();
			fundingDto.setNo(rs.getInt("no"));
			fundingDto.setMusician_id(rs.getString("musician_id"));
			fundingDto.setCategory(rs.getString("category"));
			fundingDto.setGoal(rs.getInt("goal"));
			fundingDto.setOpen(rs.getString("open"));
			fundingDto.setClose(rs.getString("close"));
			fundingDto.setPic(rs.getString("pic"));
			fundingDto.setTitle(rs.getString("title"));
			fundingDto.setContents(rs.getString("contents"));
			fundingDto.setWrite_date(rs.getString("write_date"));
			fundingDto.setAmount(rs.getInt("amount"));
			fundingDto.setStatus(rs.getString("status"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		return fundingDto;
	}

	@Override
	public void changeStatusFunding(Map<String, String> map) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.makeConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("update funding_status \n");
			sql.append("set status = ? \n");
			sql.append("where no = ?");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, map.get("status"));
			pstmt.setString(2, map.get("no"));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
	}

	@Override
	public int writeFunding(FundingDto fundingDto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			conn = DBConnection.makeConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert all \n");
			sql.append("	into funding (no, musician_id, category, goal, open, close, pic, title, contents, write_date) \n");
			sql.append("	values (?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate) \n");
			
			//TODO insert funding_reward
			sql.append("	into funding_status (no, amount, status) \n");
			sql.append("	values (?, 0, 'W') \n");
			
			sql.append("select * from dual");
			pstmt = conn.prepareStatement(sql.toString());
			int idx = 0;
			pstmt.setInt(++idx, fundingDto.getNo());
			pstmt.setString(++idx, fundingDto.getMusician_id());
			pstmt.setString(++idx, fundingDto.getCategory());
			pstmt.setInt(++idx, fundingDto.getGoal());
			pstmt.setString(++idx, fundingDto.getOpen());
			pstmt.setString(++idx, fundingDto.getClose());
			pstmt.setString(++idx, fundingDto.getPic());
			pstmt.setString(++idx, fundingDto.getTitle());
			pstmt.setString(++idx, fundingDto.getContents());
			
			pstmt.setInt(++idx, fundingDto.getNo());
			
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		return cnt;
	}

//	TODO insert all
	@Override
	public int writeFundingReward(FundingRewardDto rewardDto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			conn = DBConnection.makeConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert	into funding_reward (no, amount, pic, title, contents) \n");
			sql.append("values (?, ?, ?, ?, ?) \n");
			
			pstmt = conn.prepareStatement(sql.toString());
			int idx = 0;
			pstmt.setInt(++idx, rewardDto.getNo());
			pstmt.setInt(++idx, rewardDto.getAmount());
			pstmt.setString(++idx, rewardDto.getPic());
			pstmt.setString(++idx, rewardDto.getTitle());
			pstmt.setString(++idx, rewardDto.getContents());
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		return cnt;
	}


	@Override
	public void modifyFunding(FundingDto fundingDto) {
		
	}

	@Override
	public void deleteFunding(int no) {
		
	}

	@Override
	public void backingFunding(Map<String, String> map) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.makeConnection();
			conn.setAutoCommit(false);
			StringBuffer sql = new StringBuffer();
			sql.append("update funding_status \n");
			sql.append("set amount = amount + ? \n");
			sql.append("where no = ?");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, map.get("amount"));
			pstmt.setString(2, map.get("no"));
			pstmt.executeUpdate();
			pstmt.close();
			sql.setLength(0);
			
			sql.append("insert into backer (no, member_id, amount) \n");
			sql.append("values (?, ?, ?) \n");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, map.get("no"));
			pstmt.setString(2, map.get("member_id"));
			pstmt.setString(3, map.get("amount"));
			pstmt.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
	}
}
