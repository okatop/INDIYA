package com.indiya.action.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.indiya.action.Action;
import com.indiya.member.model.MemberDto;
import com.indiya.member.service.MemberServiceImpl;

public class MemberLoginAction  implements Action {

	private static MemberLoginAction memberLoginAction;
	
	static {
		memberLoginAction = new MemberLoginAction();
	}
	
	private MemberLoginAction() {}
	
	public static MemberLoginAction getMemberLoginAction() {
		return memberLoginAction;
	}
	
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("액션 도착");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String path = "Mainpage/main.jsp";
		MemberDto memberDto = MemberServiceImpl.getMemberService().login(id, pass);
		HttpSession session = request.getSession();
		session.setAttribute("userInfo", memberDto);
		if(memberDto != null) {
			path = "Mainpage/main.jsp";
			System.out.println("액션 if 문 도착");
			if("saveok".equals(request.getParameter("idsave"))) {
				System.out.println("아이디 저장한다.");
				Cookie cookie = new Cookie("loginid", id);
				cookie.setPath(request.getContextPath());
				cookie.setMaxAge(60*60*24*365*10);
				
				response.addCookie(cookie);
			} else {
				Cookie cookie[] = request.getCookies();
				if(cookie != null) {
					int len = cookie.length;
					for(int i=0;i<len;i++) {
						if("loginid".equals(cookie[i].getName())) {
							cookie[i].setMaxAge(0);
							cookie[i].setPath(request.getContextPath());
							
							response.addCookie(cookie[i]);
							break;
						}
					}
				}
			}
			
		} else {
			path = "Mainpage/main.jsp";
		}
		return path;
	}

}
