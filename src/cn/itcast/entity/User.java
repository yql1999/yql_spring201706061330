package cn.itcast.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer uid;
	private String username;
	private String address;
	
	public User() {
		super();
	}
	
	public User(Integer uid, String username, String address) {
		this.uid = uid;
		this.username = username;
		this.address = address;
	}
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
