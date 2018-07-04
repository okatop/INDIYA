package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianCommentWriteAction implements Action {

	private static MusicianCommentWriteAction musicianCommentWriteAction;

	static {
		musicianCommentWriteAction = new MusicianCommentWriteAction();
	}

	private MusicianCommentWriteAction() {
	}

	public static MusicianCommentWriteAction getMusicianCommentWriteAction() {
		return musicianCommentWriteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
