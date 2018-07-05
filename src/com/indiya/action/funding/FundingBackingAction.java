package com.indiya.action.funding;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.indiya.action.Action;
import com.indiya.funding.service.FundingServiceImpl;
import com.indiya.member.model.MemberDto;
import com.indiya.util.ParameterCheck;

public class FundingBackingAction implements Action {

	private static FundingBackingAction fundingBackingAction;

	static {
		fundingBackingAction = new FundingBackingAction();
	}

	private FundingBackingAction() {
	}

	public static FundingBackingAction getFundingBackingAction() {
		return fundingBackingAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "/funding?act=listfunding&";
		HttpSession session = request.getSession();
		 MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		 if(memberDto != null) {
			 int no = ParameterCheck.naNToZero(request.getParameter("seq"));
			 String member_id = memberDto.getId();
			 int amount = ParameterCheck.naNToZero(request.getParameter("amount"));
			 
			 FundingServiceImpl.getFundingService().backingFunding(no, member_id, amount);
			 path = "/funding?act=listfunding&";
		 }else {
			path = "/funding?act=listfunding&";
		 }
		return path;
	}

}
