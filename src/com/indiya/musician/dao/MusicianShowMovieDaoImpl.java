package com.indiya.musician.dao;

public class MusicianShowMovieDaoImpl implements MusicianShowMovieDao{

	private static MusicianShowMovieDaoImpl musicianShowMovieDaoImpl;
	
	static {
		musicianShowMovieDaoImpl = new MusicianShowMovieDaoImpl();
	}
	
	private MusicianShowMovieDaoImpl() {
		
	}

	public static MusicianShowMovieDaoImpl getMusicianShowMovieDaoImpl() {
		return musicianShowMovieDaoImpl;
	}

	@Override
	public int writeMusicianShowMovie(MusicianShowMovieDao musicianShowMovieDao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyMusicianShowMovie(MusicianShowMovieDao musicianShowMovieDao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMusicianShowMovie(MusicianShowMovieDao musicianShowMovieDao) {
		// TODO Auto-generated method stub
		
	}
	
}
