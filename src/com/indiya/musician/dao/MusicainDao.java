package com.indiya.musician.dao;

import com.indiya.member.model.MemberDto;


public interface MusicainDao {

	int registerMember(MemberDto memberDto);
	int nameCheck(String band_name);
	MemberDto getMember(String id);
}
