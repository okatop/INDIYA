package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianMusicDeleteAction implements Action {

	private static MusicianMusicDeleteAction musicianMusicDeleteAction;

	static {
		musicianMusicDeleteAction = new MusicianMusicDeleteAction();
	}

	private MusicianMusicDeleteAction() {
	}

	public static MusicianMusicDeleteAction getMusicianMusicDeleteAction() {
		return musicianMusicDeleteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
