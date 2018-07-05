package com.indiya.funding.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.factory.FundingActionFactory;
import com.indiya.util.Encoder;
import com.indiya.util.KitriConstance;
import com.indiya.util.PageMove;
import com.indiya.util.ParameterCheck;

@WebServlet("/funding")
public class FundingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String act = request.getParameter("act");
		int pg = ParameterCheck.naNToZero(request.getParameter("pg"));
		String key = ParameterCheck.nullToBlank(request.getParameter("key"));
		String word = ParameterCheck.nullToBlank(request.getParameter("word"));
		//String queryString = "pg=" + pg + "&key=" + key + "&word=" + Encoder.urlUtf(word);
		
		String queryString = "pg=" + pg + "&key=" + key + "&word=" + Encoder.urlUtf(word) + "&userinfo=" + request.getParameter("userinfo");
		
		String path = "/funding/index.jsp";
		System.out.println(queryString);
		if("mvwrite".equals(act)){
			path = "/funding/write.jsp?" + queryString;
			PageMove.redirect(request, response, path);
		}else if("writefunding".equals(act)) {
			System.out.println("print in FundingController writefunding");
			path = FundingActionFactory.getFundingWriteAction().execute(request, response);
			path += queryString;
			PageMove.redirect(request, response, path);
		}else if("listfunding".equals(act)) {
			path = FundingActionFactory.getFundingListAction().execute(request, response);
			path += queryString;
			PageMove.forward(request, response, path);
		}else if("viewfunding".equals(act)) {
			path = FundingActionFactory.getFundingViewAction().execute(request, response);
			path += queryString;
			PageMove.forward(request, response, path);
		}else if("".equals(act)) {
			
		}else if("".equals(act)) {
			
		}else if("".equals(act)) {
						
		}else if("".equals(act)) {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding(KitriConstance.ENCODE);	
		doGet(request, response);
	}

}
