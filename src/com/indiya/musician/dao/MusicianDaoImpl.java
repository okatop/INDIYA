package com.indiya.musician.dao;

import com.indiya.musician.model.MusicianDto;

public class MusicianDaoImpl implements MusicianDao{

	private static MusicianDaoImpl musicianDaoImpl;
	
	static {
		musicianDaoImpl = new MusicianDaoImpl();
	}
	
	private MusicianDaoImpl() {
		
	}

	public static MusicianDaoImpl getMusicianDaoImpl() {
		return musicianDaoImpl;
	}


	@Override
	public int takeListenerCount(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeListenerCount(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int takeListenerGrade(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeListenerGrade(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyMusicianName(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyMusicianInfo(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPic(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
