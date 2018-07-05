package com.indiya.funding.service;

import java.util.List;

import com.indiya.funding.model.FundingDto;
import com.indiya.funding.model.FundingRewardDto;

public interface FundingService {
	//TODO map에 검색 조건(이름 등), 정렬(진행, 대기, 종료), reward리스트
	List<FundingDto> getFundingList(int pg, String key, String word);		//리스트
	List<FundingRewardDto> getFundingRewardList(int no);			//리워드리스트
	
	FundingDto viewFundingDetail(int no);							//상세
	
	void changeStatusFunding(int no, String status);				//승인, 만료, map(status, no)
	
	int writeFunding(FundingDto fundingDto);						//신청
	int writeFundingReward(List<FundingRewardDto> list);			//리워드
	void modifyFunding(FundingDto fundingDto);						//수정
	void deleteFunding(int no);										//삭제
	
	void backingFunding(int no, String member_id, int amount);		//후원 , map(no, id, amount)
}
