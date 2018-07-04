package com.indiya.musician.dao;



public interface MusicianShowDao {

/*	
 	공연정보등록(공연타이틀 장르 장소 날짜 시간 실내외여부 공연소개글 공연사진 위도경도 작성시간)
 	공연정보수정(공연타이틀 장르 장소 날짜 시간 실내외여부 공연소개글 공연사진 위도경도 작성시간)
 	공연정보삭제(공연타이틀 장르 장소 날짜 시간 실내외여부 공연소개글 공연사진 위도경도 작성시간)
*/	
	int writeMusicianShow(MusicianShowDao musicianShowDao);
	void modifyMusicianShow(MusicianShowDao musicianShowDao);
	void deleteMusicianShow(MusicianShowDao musicianShowDao);
}
