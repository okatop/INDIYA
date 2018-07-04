package com.indiya.musician.dao;


import com.indiya.musician.model.MusicianCommentDto;

public interface MusicianCommentDao {

/*	
	코멘트 등록
	코멘트 수정
	코멘트 삭제
*/	
	
	int writeComment(MusicianCommentDto musicianCommentDto);
	void modifyComment(MusicianCommentDto musicianCommentDto);
	void deleteComment(MusicianCommentDto musicianCommentDto);

}
