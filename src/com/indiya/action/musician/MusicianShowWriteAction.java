package com.indiya.action.musician;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indiya.action.Action;

public class MusicianShowWriteAction implements Action {

	private static MusicianShowWriteAction musicianShowWriteAction;

	static {
		musicianShowWriteAction = new MusicianShowWriteAction();
	}

	private MusicianShowWriteAction() {
	}

	public static MusicianShowWriteAction getMusicianShowWriteAction() {
		return musicianShowWriteAction;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}

}
