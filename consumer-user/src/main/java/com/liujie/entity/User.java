package com.liujie.entity;

import java.io.Serializable;

public class User implements Serializable {

	private String userid;
	private String username;
	private String userpwd;
	private String createTime;
	private Integer inSchool;
	private Integer sex;
	private String hobby;


	public User() {
	}

	public User(String userid, String username, String userpwd, String createTime, Integer inSchool, Integer sex, String hobby) {
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.createTime = createTime;
		this.inSchool = inSchool;
		this.sex = sex;
		this.hobby = hobby;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getInSchool() {
		return inSchool;
	}

	public void setInSchool(Integer inSchool) {
		this.inSchool = inSchool;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "User{" +
				"userid='" + userid + '\'' +
				", username='" + username + '\'' +
				", userpwd='" + userpwd + '\'' +
				", createTime='" + createTime + '\'' +
				", inSchool=" + inSchool +
				", sex=" + sex +
				", hobby='" + hobby + '\'' +
				'}';
	}
}
