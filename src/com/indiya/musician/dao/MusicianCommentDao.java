package com.indiya.musician.dao;


import com.indiya.musician.model.MusicianCommentDto;

public interface MusicianCommentDao {

/*	
	�ڸ�Ʈ ���
	�ڸ�Ʈ ����
	�ڸ�Ʈ ����
*/	
	
	int writeComment(MusicianCommentDto musicianCommentDto);
	void modifyComment(MusicianCommentDto musicianCommentDto);
	void deleteComment(MusicianCommentDto musicianCommentDto);

}
