package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianMemberDeleteAction implements Action {

	private static MusicianMemberDeleteAction musicianMemberDeleteAction;

	static {
		musicianMemberDeleteAction = new MusicianMemberDeleteAction();
	}

	private MusicianMemberDeleteAction() {
	}

	public static MusicianMemberDeleteAction getMusicianMemberDeleteAction() {
		return musicianMemberDeleteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
