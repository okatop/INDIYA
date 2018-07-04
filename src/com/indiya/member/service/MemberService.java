package com.indiya.member.service;

import java.util.List;

import com.indiya.member.model.MemberDto;
import com.indiya.member.model.MusicianChangeDto;
import com.indiya.member.model.MypicDto;

public interface MemberService {

	int idCheck(String id);
	
	int registerMember(MemberDto memberDto);
	MemberDto getMember(String id);
	int modifyMember(MemberDto memberDto);
	void deleteMember(String id);
	int uploadFile(MypicDto mypicDto);
	MypicDto selectOne(int num);
	
	MemberDto login(String id, String pass);
}
