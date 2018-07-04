package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianCommentDeleteAction implements Action {

	private static MusicianCommentDeleteAction musicianCommentDeleteAction;

	static {
		musicianCommentDeleteAction = new MusicianCommentDeleteAction();
	}

	private MusicianCommentDeleteAction() {
	}

	public static MusicianCommentDeleteAction getMusicianCommentDeleteAction() {
		return musicianCommentDeleteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
