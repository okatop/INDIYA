package com.indiya.musician.service;

import java.util.List;

import com.indiya.musician.model.MusicianCommentDto;
import com.indiya.musician.model.MusicianMusicDto;
import com.indiya.musician.model.MusicianShowDto;
import com.indiya.musician.model.MusicianShowMovieDto;

public interface MusicianService {
	
	//	�������
	//	��������
	//	��������
	int makeShow(MusicianShowDto musicianShowDto);	
	void modifyShow(MusicianShowDto musicianShowDto);
	void deleteShow(int seq);
	
	//	������ø���
	//	�����󳻸���
	//	���������
	int writeShowMovie(MusicianShowMovieDto musicianShowMovieDto);	
	void modifyShowMovie(MusicianShowMovieDto musicianShowMovieDto);
	void deleteShowMovie(int seq);	
	
	//	��ۿø���
	//	��۳�����
	//	��ۼ���
	int writeComment(MusicianCommentDto musicianCommentDto);	
	void modifyComment(MusicianCommentDto musicianCommentDto);
	void deleteComment(int seq);	

	//	���� �ø���
	//	���� ������
	//	���� ����
	int writeMusic(MusicianMusicDto musicianMusicDto);	
	void modifyMusic(MusicianMusicDto musicianMusicDto);
	void deleteMusic(int seq);	
}
