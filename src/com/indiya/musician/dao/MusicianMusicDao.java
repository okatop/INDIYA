package com.indiya.musician.dao;


import com.indiya.musician.model.MusicianMusicDto;

public interface MusicianMusicDao {

/*	
  	擠學 蛔煙
  	擠學 熱薑
  	擠學 餉薯
*/	
	
	int writeMusic(MusicianMusicDto musicianMusicDto);
	void modifyMusic(MusicianMusicDto musicianMusicDto);
	void deleteMusic(MusicianMusicDto musicianMusicDto);
}
