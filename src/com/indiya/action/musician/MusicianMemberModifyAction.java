package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianMemberModifyAction implements Action {

	private static MusicianMemberModifyAction musicianMemberModifyAction;

	static {
		musicianMemberModifyAction = new MusicianMemberModifyAction();
	}

	private MusicianMemberModifyAction() {
	}

	public static MusicianMemberModifyAction getMusicianMemberModifyAction() {
		return musicianMemberModifyAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
