package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianShowMovieModifyAction implements Action {

	private static MusicianShowMovieModifyAction musicianShowMovieModifyAction;

	static {
		musicianShowMovieModifyAction = new MusicianShowMovieModifyAction();
	}

	private MusicianShowMovieModifyAction() {
	}

	public static MusicianShowMovieModifyAction getMusicianShowMovieModifyAction() {
		return musicianShowMovieModifyAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
