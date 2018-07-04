package com.indiya.musician.model;



public class MusicianShowMovieDto extends MusicianDto {

	private String show_title;
	private String show_place;
	private String show_date;
	private String show_movie_url;
	private String visited;
	private String write_date;
	
	public String getShow_title() {
		return show_title;
	}

	public void setShow_title(String show_title) {
		this.show_title = show_title;
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

	public String getShow_movie_url() {
		return show_movie_url;
	}

	public void setShow_movie_url(String show_movie_url) {
		this.show_movie_url = show_movie_url;
	}

	public String getVisited() {
		return visited;
	}

	public void setVisited(String visited) {
		this.visited = visited;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	
	@Override
	public String toString() {
		return "MusicianShowMovieDto [show_title=" + show_title + ", show_place=" + show_place + ", show_date=" + show_date + ", show_movie_url=" + show_movie_url + 
				", visited=" + visited + ", write_date=" + write_date + "]";
	}
}
