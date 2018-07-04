package com.indiya.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.indiya.member.dao.MemberDao;
import com.indiya.member.dao.MemberDaoImpl;
import com.indiya.member.model.MemberDto;
import com.indiya.member.model.MusicianChangeDto;
import com.indiya.member.model.ZipDto;

public class MemberServiceImpl implements MemberService{

private static MemberService memberService;

static {
	memberService = new MemberServiceImpl();
}

private MemberServiceImpl() {}

public static MemberService getMemberService() {
	return memberService;
}

@Override
public int idCheck(String id) {
	return MemberDaoImpl.getMemberDao().idCheck(id);
}

@Override
public List<ZipDto> zipSearch(String dong) {
	return MemberDaoImpl.getMemberDao().zipSearch(dong);
}

@Override
public int registerMember(MemberDto memberDto) {
	return MemberDaoImpl.getMemberDao().registerMember(memberDto);
}

@Override
public MemberDto getMember(String id) {
	return MemberDaoImpl.getMemberDao().getMember(id);
}

@Override
public int modifyMember(MemberDto memberDto) {
	return MemberDaoImpl.getMemberDao().modifyMember(memberDto);
}

@Override
public void deleteMember(String id) {
}

@Override
public MemberDto login(String id, String pass) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("userid", id);
	map.put("userpass", pass);
	return MemberDaoImpl.getMemberDao().login(map);
	}

}
