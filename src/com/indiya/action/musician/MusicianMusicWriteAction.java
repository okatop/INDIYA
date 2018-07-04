package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianMusicWriteAction implements Action {

	private static MusicianMusicWriteAction musicianMusicWriteAction;

	static {
		musicianMusicWriteAction = new MusicianMusicWriteAction();
	}

	private MusicianMusicWriteAction() {
	}

	public static MusicianMusicWriteAction getMusicianMusicWriteAction() {
		return musicianMusicWriteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
