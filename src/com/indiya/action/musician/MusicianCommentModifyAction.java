package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianCommentModifyAction implements Action {

	private static MusicianCommentModifyAction musicianCommentModifyAction;

	static {
		musicianCommentModifyAction = new MusicianCommentModifyAction();
	}

	private MusicianCommentModifyAction() {
	}

	public static MusicianCommentModifyAction getMusicianCommentModifyAction() {
		return musicianCommentModifyAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
