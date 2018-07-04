package com.indiya.musician.dto;

import com.indiya.member.model.MemberDto;

public class MusicianDto extends MemberDto {

	private String musician_name;
	private String genre;
	private String area;
	private String joindate;
	private String picture;
	
	public String getBand_name() {
		return musician_name;
	}
	public void setBand_name(String band_name) {
		this.musician_name = band_name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	@Override
	public String toString() {
		return "MusicianDto [band_name=" + ", genre=" + genre + ", inst=" + ", area=" + area
				+ ", joindate=" + joindate + ", picture=" + picture + "]";
	}
}
