package com.indiya.musician.model;



public class MusicianShowDto extends MusicianDto {

	private String show_title;
	private String music_genre;/*¹ÂÁö¼Ç? °ø¿¬?*/
	private String show_place;
	private String show_date;	
	private String show_time;	
	private String in_outdoors;
	private String show_info;
	private String show_pic;
	private String latitude;
	private String longtitude;
	private String show_write_date;	
	
	
	public String getShow_title() {
		return show_title;
	}

	public void setShow_title(String show_title) {
		this.show_title = show_title;
	}

	public String getMusic_genre() {
		return music_genre;
	}

	public void setMusic_genre(String music_genre) {
		this.music_genre = music_genre;
	}

	public String getShow_place() {
		return show_place;
	}

	public void setShow_place(String show_place) {
		this.show_place = show_place;
	}

	public String getShow_date() {
		return show_date;
	}

	public void setShow_date(String show_date) {
		this.show_date = show_date;
	}

	public String getShow_time() {
		return show_time;
	}

	public void setShow_time(String show_time) {
		this.show_time = show_time;
	}

	public String getIn_outdoors() {
		return in_outdoors;
	}

	public void setIn_outdoors(String in_outdoors) {
		this.in_outdoors = in_outdoors;
	}

	public String getShow_info() {
		return show_info;
	}

	public void setShow_info(String show_info) {
		this.show_info = show_info;
	}

	public String getShow_pic() {
		return show_pic;
	}

	public void setShow_pic(String show_pic) {
		this.show_pic = show_pic;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public String getShow_write_date() {
		return show_write_date;
	}

	public void setShow_write_date(String show_write_date) {
		this.show_write_date = show_write_date;
	}

	@Override
	public String toString() {
		return "MusicianShowDto [show_title=" + show_title + 
				", music_genre=" + music_genre + 
				", show_place=" + show_place + 
				", show_date=" + show_date + 
				", show_time=" + show_time + 
				", in_outdoors=" + in_outdoors + 
				", show_info=" + show_info + 
				", show_pic=" + show_pic + 
				", latitude=" + latitude +
				", longtitude=" + longtitude + 
				", show_write_date=" + show_write_date +  "]";
	}
}
