package com.indiya.musician.dao;

import com.indiya.musician.model.MusicianDto;
import com.indiya.musician.model.MusicianMemberDto;

public interface MusicianMemberDao {

/*	
   ��� ����� ���
   �ۼ� ��¥
*/	
	int registerMember(MusicianMemberDto musicianMemberDto);
	String writeDate(MusicianDto musicianDto);
	
}
