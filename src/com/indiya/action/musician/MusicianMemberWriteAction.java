package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianMemberWriteAction implements Action {

	private static MusicianMemberWriteAction musicianMemberWriteAction;

	static {
		musicianMemberWriteAction = new MusicianMemberWriteAction();
	}

	private MusicianMemberWriteAction() {
	}

	public static MusicianMemberWriteAction getMusicianMemberWriteAction() {
		return musicianMemberWriteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
