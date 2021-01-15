package com.Edgeserver.server.models;


public class Comment {

	int Id;
	String comment;
	String userName;
	
	public Comment() {

	}

	public Comment(int Id, String comment, String userName) {
		super();
		this.Id = Id;
		this.comment = comment;
		this.userName = userName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	
}
