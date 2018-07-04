package com.indiya.musician.dao;

import com.indiya.musician.model.MusicianDto;
import com.indiya.musician.model.MusicianMemberDto;

public class MusicianMemberDaoImpl implements MusicianMemberDao{

	private static MusicianMemberDaoImpl musicianMemberDaoImpl;
	
	static {
		musicianMemberDaoImpl = new MusicianMemberDaoImpl();
	}
	
	private MusicianMemberDaoImpl() {
		
	}

	public static MusicianMemberDaoImpl getMusicianMemberDaoImpl() {
		return musicianMemberDaoImpl;
	}

	@Override
	public int registerMember(MusicianMemberDto musicianMemberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String writeDate(MusicianDto musicianDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
