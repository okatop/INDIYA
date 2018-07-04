package com.indiya.musician.dao;


import com.indiya.musician.model.MusicianDto;

public interface MusicianDao {

/*	
  	밴드명수정 - 수정이 삭제겸 생성
  	대문사진수정 - 수정이 삭제겸 생성
  	소개글수정 - 수정이 삭제겸 생성
  	총평점수 얻기
  	총평점수 수정
  	총평점얻기
  	총평점수정
  	평점주기(?) - 멤버가 할일?
*/	
	void modifyMusicianName(MusicianDto musicianDto);
	void modifyMusicianInfo(MusicianDto musicianDto);
	void modifyPic(MusicianDto musicianDto);
	int takeListenerCount(MusicianDto musicianDto);
	void writeListenerCount(MusicianDto musicianDto);
	int takeListenerGrade(MusicianDto musicianDto);
	void writeListenerGrade(MusicianDto musicianDto);	

}
