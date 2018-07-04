package com.indiya.member.model;

public class MemberDto {

	private String id;
	private String name;
	private String pass;
	private String email1;
	private String email2;
	private String zipNo;
	private String roadAddrpart1;
	private String addrDetail;
	private String tel1;
	private String tel2;
	private String tel3;
	private String join_date;
	private String sex;
	private String find_pass;
	private String find_pass_check;
	
	public String getJoin_date() {
		return join_date;
	}
	public String getSex() {
		return sex;
	}
	public String getFind_pass() {
		return find_pass;
	}
	public String getFind_pass_check() {
		return find_pass_check;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setFind_pass(String find_pass) {
		this.find_pass = find_pass;
	}
	public void setFind_pass_check(String find_pass_check) {
		this.find_pass_check = find_pass_check;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public String getZipNo() {
		return zipNo;
	}
	public String getRoadAddrpart1() {
		return roadAddrpart1;
	}
	public String getAddrDetail() {
		return addrDetail;
	}
	public void setZipNo(String zipNo) {
		this.zipNo = zipNo;
	}
	public void setRoadAddrpart1(String roadAddrpart1) {
		this.roadAddrpart1 = roadAddrpart1;
	}
	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}
	
	
}
