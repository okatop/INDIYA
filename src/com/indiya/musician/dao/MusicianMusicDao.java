package com.indiya.musician.dao;


import com.indiya.musician.model.MusicianMusicDto;

public interface MusicianMusicDao {

/*	
  	���� ���
  	���� ����
  	���� ����
*/	
	
	int writeMusic(MusicianMusicDto musicianMusicDto);
	void modifyMusic(MusicianMusicDto musicianMusicDto);
	void deleteMusic(MusicianMusicDto musicianMusicDto);
}
