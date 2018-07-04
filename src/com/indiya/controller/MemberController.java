package com.indiya.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.indiya.member.factory.MemberActionFactory;
import com.indiya.member.model.MemberDto;
import com.indiya.member.model.ZipDto;
import com.indiya.member.service.MemberService;
import com.indiya.member.service.MemberServiceImpl;
import com.indiya.util.PageMove;

@WebServlet("/user")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = "/Mainpage/main.jsp";
		String act = request.getParameter("act");
		System.out.println("act ==== " + act);
		
		if("MemberModify".equals(act)) {
			path = MemberActionFactory.getMemberModifyAction().execute(request, response);
			PageMove.redirect(request, response, path);
		} else if("Memberlogin".equals(act)) {
			
			PageMove.redirect(request, response, "/login/login.jsp");
		} else if("idsearch".equals(act)) {
			path = MemberActionFactory.getMemberIdSearchAction().execute(request, response);
			PageMove.forward(request, response, path);
		
		} else if("idcheck".equals(act)) {
			path = MemberActionFactory.getMemberIdCheckAction().execute(request, response);
			PageMove.forward(request, response, path);
		} else if("register".equals(act)) {
			
		} else if("mchange".equals(act)) {
			path = MemberActionFactory.getMusicianChangeAction().execute(request, response);
			PageMove.forward(request, response, path);
		}
	}
/*
			int cnt =0;
			if(cnt != 0) {//성공.
				request.setAttribute("userInfo", memberDto);
			
				PageMove.forward(request, response, "/join/registerok.jsp");
			} else {
				PageMove.redirect(request, response, "/join/registerfail.jsp");
			}
			
		} else if("login".equals(act)) {
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			
			MemberDto memberDto = memberService.login(id, pass);
			if(memberDto != null) {
				
				/////////////////////////// Cookie /////////////////////////////
				if("saveok".equals(request.getParameter("idsave"))) {
					System.out.println("아이디 저장한다.");
					Cookie cookie = new Cookie("loginid", id);
					cookie.setPath(root);
					cookie.setMaxAge(60*60*24*365*10);
					
					response.addCookie(cookie);
				} else {
					Cookie cookie[] = request.getCookies();
					if(cookie != null) {
						int len = cookie.length;
						for(int i=0;i<len;i++) {
							if("loginid".equals(cookie[i].getName())) {
								cookie[i].setMaxAge(0);
								cookie[i].setPath(root);
								
								response.addCookie(cookie[i]);
								break;
							}
						}
					}
				}
				////////////////////////////////////////////////////////////////
				
				///////////////////////// session //////////////////////////////
				
				HttpSession session = request.getSession();
				session.setAttribute("userInfo", memberDto);
				
				////////////////////////////////////////////////////////////////
//				request.setAttribute("userInfo", memberDto);
				
				PageMove.redirect(request, response, "/login/loginok.jsp");
			} else {
				PageMove.redirect(request, response, "/login/loginfail.jsp");
			}
		} else if("logout".equals(act)) {
			HttpSession session = request.getSession();
//			session.setAttribute("userInfo", null);
			session.removeAttribute("userInfo");
//			session.invalidate();
			PageMove.redirect(request, response, "/index.jsp");
		} else if("mvmaillist".equals(act)) {
			List<String> mail = new ArrayList<String>();
			mail.add("동주1가 보낸 메일.");
			mail.add("동주2가 보낸 메일.");
			mail.add("동주3가 보낸 메일.");
			mail.add("동주4가 보낸 메일.");
			mail.add("동주5가 보낸 메일.");
			mail.add("동주6가 보낸 메일.");
			
			request.setAttribute("maillist", mail);
			PageMove.forward(request, response, "/mail/list.jsp");
		} else {
			PageMove.redirect(request, response, "/index.jsp");
		}
	}
*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}

