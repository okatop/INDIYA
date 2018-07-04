package com.indiya.musician.dao;


import com.indiya.musician.model.MusicianDto;

public interface MusicianDao {

/*	
  	������� - ������ ������ ����
  	�빮�������� - ������ ������ ����
  	�Ұ��ۼ��� - ������ ������ ����
  	�������� ���
  	�������� ����
  	���������
  	����������
  	�����ֱ�(?) - ����� ����?
*/	
	void modifyMusicianName(MusicianDto musicianDto);
	void modifyMusicianInfo(MusicianDto musicianDto);
	void modifyPic(MusicianDto musicianDto);
	int takeListenerCount(MusicianDto musicianDto);
	void writeListenerCount(MusicianDto musicianDto);
	int takeListenerGrade(MusicianDto musicianDto);
	void writeListenerGrade(MusicianDto musicianDto);	

}
