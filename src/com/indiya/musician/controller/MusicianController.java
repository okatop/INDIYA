package com.indiya.musician.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;
import com.indiya.factory.MusicianFactory;
import com.indiya.util.Encoder;
import com.indiya.util.PageMove;
import com.indiya.util.ParameterCheck;



@WebServlet("/MusicianController")
public class MusicianController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String act = request.getParameter("act");
		String musician_flag = request.getParameter("flag");
		int number = Integer.parseInt(request.getParameter("number"));
		
		int bcode = ParameterCheck.nanToZero(request.getParameter("bcode"));
		int pg = ParameterCheck.nanToOne(request.getParameter("pg"));
		String key = ParameterCheck.nullToBlank(request.getParameter("key"));
		String word = ParameterCheck.nullToBlank(request.getParameter("word"));
		String queryString = "bcode=" + bcode + "&pg=" + pg + "&key=" + key + "&word=" + Encoder.urlUtf(word);
		System.out.println(queryString);

		
		String path = "/Bandpage/bandpage.jsp";
		if(musician_flag == null) {
			System.out.println("¥ÁΩ≈¿∫ π¬¡ˆº«¿Ã æ∆¥’¥œ¥Ÿ.");
			PageMove.redirect(request, response, path);
			
		} else {	
			if("score".equals(act)) {
				System.out.println(number);
				path = "../index.html";
				PageMove.redirect(request, response, path);
			} else if("".equals(act)) {
				path = "/æÓµÚ∞°/∫‰∆‰¿Ã¡ˆ" + queryString;
				PageMove.redirect(request, response, path);
			} else if("memberwrite".equals(act)) {
				path = MusicianFactory.getMusicianMemberWriteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("membermodify".equals(act)) {
				path = MusicianFactory.getMusicianMusicModifyAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("memberdelete".equals(act)) {
				path = MusicianFactory.getMusicianMusicDeleteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("showmoviewrite".equals(act)) {
				path = MusicianFactory.getMusicianShowMovieWriteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("showmoviemodify".equals(act)) {
				path = MusicianFactory.getMusicianShowMovieModifyAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("showmoviedelete".equals(act)) {
				path = MusicianFactory.getMusicianShowMovieDeleteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("commentwrite".equals(act)) {
				path = MusicianFactory.getMusicianCommentWriteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("commentmodify".equals(act)) {
				path = MusicianFactory.getMusicianCommentModifyAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("commentdelete".equals(act)) {
				path = MusicianFactory.getMusicianCommentDeleteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("musicwrite".equals(act)) {
				path = MusicianFactory.getMusicianMusicWriteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("musicmodify".equals(act)) {
				path = MusicianFactory.getMusicianMusicModifyAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			} else if("musicdelete".equals(act)) {
				path = MusicianFactory.getMusicianMusicDeleteAction().execute(request, response);
				path += queryString;
				PageMove.redirect(request, response, path);
			}
		}
	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
