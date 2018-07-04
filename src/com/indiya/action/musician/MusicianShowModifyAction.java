package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianShowModifyAction implements Action {

	private static MusicianShowModifyAction musicianShowModifyAction;

	static {
		musicianShowModifyAction = new MusicianShowModifyAction();
	}

	private MusicianShowModifyAction() {
	}

	public static MusicianShowModifyAction getMusicianShowModifyAction() {
		return musicianShowModifyAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
