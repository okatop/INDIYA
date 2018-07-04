package com.indiya.musician.dao;

public class MusicianShowDaoImpl implements MusicianShowDao{

	private static MusicianShowDaoImpl musicianShowDaoImpl;
	
	static {
		musicianShowDaoImpl = new MusicianShowDaoImpl();
	}
	
	private MusicianShowDaoImpl() {
		
	}

	public static MusicianShowDaoImpl getMusicianShowDaoImpl() {
		return musicianShowDaoImpl;
	}

	@Override
	public int writeMusicianShow(MusicianShowDao musicianShowDao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyMusicianShow(MusicianShowDao musicianShowDao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMusicianShow(MusicianShowDao musicianShowDao) {
		// TODO Auto-generated method stub
		
	}
	
}
