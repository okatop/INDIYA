package com.indiya.musician.model;

import com.indiya.member.model.MemberDto;

public class MusicianMemberDto extends MemberDto {

	private String id;
	private String musician_id;
	private String position;
	private String write_date;


	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getMusician_id() {
		return musician_id;
	}



	public void setMusician_id(String musician_id) {
		this.musician_id = musician_id;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public String getWrite_date() {
		return write_date;
	}



	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}


	@Override
	public String toString() {
		return "MusicianMemberDto [id=" + id + 
				", musician_id=" + musician_id + 
				", position=" + position + 
				", write_date=" + write_date + "]";
	}
}
