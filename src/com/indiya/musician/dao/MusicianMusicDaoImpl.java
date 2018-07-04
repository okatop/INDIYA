package com.indiya.musician.dao;

import com.indiya.musician.model.MusicianMusicDto;

public class MusicianMusicDaoImpl implements MusicianMusicDao{

	private static MusicianMusicDaoImpl musicianMusicDaoImpl;
	
	static {
		musicianMusicDaoImpl = new MusicianMusicDaoImpl();
	}
	
	private MusicianMusicDaoImpl() {
		
	}

	public static MusicianMusicDaoImpl getMusicianMusicDaoImpl() {
		return musicianMusicDaoImpl;
	}

	@Override
	public int writeMusic(MusicianMusicDto musicianMusicDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyMusic(MusicianMusicDto musicianMusicDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMusic(MusicianMusicDto musicianMusicDto) {
		// TODO Auto-generated method stub
		
	}
	
}
