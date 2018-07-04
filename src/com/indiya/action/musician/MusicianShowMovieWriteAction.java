package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianShowMovieWriteAction implements Action {

	private static MusicianShowMovieWriteAction musicianShowMovieWriteAction;

	static {
		musicianShowMovieWriteAction = new MusicianShowMovieWriteAction();
	}

	private MusicianShowMovieWriteAction() {
	}

	public static MusicianShowMovieWriteAction getMusicianShowMovieWriteAction() {
		return musicianShowMovieWriteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
