package com.indiya.musician.dao;

import com.indiya.musician.model.MusicianDto;
import com.indiya.musician.model.MusicianMemberDto;

public interface MusicianMemberDao {

/*	
   밴드 멤버로 등록
   작성 날짜
*/	
	int registerMember(MusicianMemberDto musicianMemberDto);
	String writeDate(MusicianDto musicianDto);
	
}
