package com.indiya.funding.dao;

import java.util.List;
import java.util.Map;

import com.indiya.funding.model.FundingDto;
import com.indiya.funding.model.FundingRewardDto;

public interface FundingDao {
	int getNextSeq();												//다음 글 번호
	List<FundingDto> getFundingList(Map<String, String> map);		//리스트
	List<FundingRewardDto> getFundingRewardList(int no);			//리워드리스트
	FundingDto viewFundingDetail(int no);							//상세
	
	void changeStatusFunding(Map<String, String> map);				//승인, 만료, map(status, no)
	
	int writeFunding(FundingDto fundingDto);						//신청
	int writeFundingReward(FundingRewardDto fundingRewardDto);		//리워드
	void modifyFunding(FundingDto fundingDto);						//수정
	void deleteFunding(int no);										//삭제
	
	void backingFunding(Map<String, String> map);					//후원 , map(no, id, amount)
}
