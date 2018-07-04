package com.indiya.musician.model;



public class MusicianMusicDto extends MusicianDto {

	private String music_title;
	private String music_src;

	public String getMusic_title() {
		return music_title;
	}

	public void setMusic_title(String music_title) {
		this.music_title = music_title;
	}

	public String getMusic_src() {
		return music_src;
	}

	public void setMusic_src(String music_src) {
		this.music_src = music_src;
	}

	@Override
	public String toString() {
		return "MusicianMusicDto [music_title=" + music_title + 
				", music_src=" + music_src + "]";
	}
}
