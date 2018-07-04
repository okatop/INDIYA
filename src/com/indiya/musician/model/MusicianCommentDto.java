package com.indiya.musician.model;



public class MusicianCommentDto extends MusicianDto {

	private String contents;
	private String write_date;
	private String member_id;


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getWrite_date() {
		return write_date;
	}


	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}


	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	@Override
	public String toString() {
		return "MusicianCommentDto [contents=" + contents + 
				", write_date=" + write_date +
				", member_id=" + member_id + "]";
	}
}
