package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianShowDeleteAction implements Action {

	private static MusicianShowDeleteAction musicianShowDeleteAction;

	static {
		musicianShowDeleteAction = new MusicianShowDeleteAction();
	}

	private MusicianShowDeleteAction() {
	}

	public static MusicianShowDeleteAction getMusicianShowDeleteAction() {
		return musicianShowDeleteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
