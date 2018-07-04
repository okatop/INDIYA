package com.indiya.member.service;

import java.util.List;

import com.indiya.member.model.MemberDto;
import com.indiya.member.model.MusicianChangeDto;
import com.indiya.member.model.ZipDto;

public interface MemberService {

	int idCheck(String id);
	List<ZipDto> zipSearch(String dong);
	int registerMember(MemberDto memberDto);
	MemberDto getMember(String id);
	int modifyMember(MemberDto memberDto);
	void deleteMember(String id);
	
	
	MemberDto login(String id, String pass);
}
