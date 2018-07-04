package com.indiya.musician.dao;

import com.indiya.musician.model.MusicianCommentDto;

public class MusicianCommentDaoImpl implements MusicianCommentDao{

	private static MusicianCommentDaoImpl musicianCommentDaoImpl;
	
	static {
		musicianCommentDaoImpl = new MusicianCommentDaoImpl();
	}
	
	private MusicianCommentDaoImpl() {
		
	}

	public static MusicianCommentDaoImpl getMusicianCommentDaoImpl() {
		return musicianCommentDaoImpl;
	}

	@Override
	public int writeComment(MusicianCommentDto musicianCommentDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyComment(MusicianCommentDto musicianCommentDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteComment(MusicianCommentDto musicianCommentDto) {
		// TODO Auto-generated method stub

	}
	
}
