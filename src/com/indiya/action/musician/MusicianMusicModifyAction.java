package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianMusicModifyAction implements Action {

	private static MusicianMusicModifyAction musicianMusicModifyAction;

	static {
		musicianMusicModifyAction = new MusicianMusicModifyAction();
	}

	private MusicianMusicModifyAction() {
	}

	public static MusicianMusicModifyAction getMusicianMusicModifyAction() {
		return musicianMusicModifyAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
