package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianShowMovieDeleteAction implements Action {

	private static MusicianShowMovieDeleteAction musicianShowMovieDeleteAction;

	static {
		musicianShowMovieDeleteAction = new MusicianShowMovieDeleteAction();
	}

	private MusicianShowMovieDeleteAction() {
	}

	public static MusicianShowMovieDeleteAction getMusicianShowMovieDeleteAction() {
		return musicianShowMovieDeleteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
