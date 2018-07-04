package com.indiya.musician.service;

import java.util.List;

import com.indiya.musician.model.MusicianCommentDto;
import com.indiya.musician.model.MusicianMusicDto;
import com.indiya.musician.model.MusicianShowDto;
import com.indiya.musician.model.MusicianShowMovieDto;

public interface MusicianService {
	
	//	공연등록
	//	공연수정
	//	공연삭제
	int makeShow(MusicianShowDto musicianShowDto);	
	void modifyShow(MusicianShowDto musicianShowDto);
	void deleteShow(int seq);
	
	//	동영상올리기
	//	동영상내리기
	//	동영상수정
	int writeShowMovie(MusicianShowMovieDto musicianShowMovieDto);	
	void modifyShowMovie(MusicianShowMovieDto musicianShowMovieDto);
	void deleteShowMovie(int seq);	
	
	//	댓글올리기
	//	댓글내리기
	//	댓글수정
	int writeComment(MusicianCommentDto musicianCommentDto);	
	void modifyComment(MusicianCommentDto musicianCommentDto);
	void deleteComment(int seq);	

	//	음악 올리기
	//	음악 내리기
	//	음악 수정
	int writeMusic(MusicianMusicDto musicianMusicDto);	
	void modifyMusic(MusicianMusicDto musicianMusicDto);
	void deleteMusic(int seq);	
}
