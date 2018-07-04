package com.indiya.action.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.indiya.action.Action;
import com.indiya.member.model.MemberDto;

public class MemberIdSearchAction implements Action{

	private static MemberIdSearchAction memberIdSearchAction;
	
	static {
		memberIdSearchAction = new MemberIdSearchAction();
	}
	
	private MemberIdSearchAction() {}
	
	public static MemberIdSearchAction getMemberIdSearchAction() {
		return memberIdSearchAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("액션 1차 관문");
		String path = "/Mypage/mypagemodify.jsp";
		HttpSession session = request.getSession(); 
		MemberDto dto = (MemberDto) session.getAttribute("userInfo");
		String id = request.getParameter("id");
		if(dto != null) {
			dto.setId(request.getParameter("id"));
			System.out.println("여기까진 온거냐");
		}
		return path;
	}
	
}
