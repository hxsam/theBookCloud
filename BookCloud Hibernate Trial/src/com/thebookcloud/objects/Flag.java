package com.thebookcloud.objects;

import java.io.Serializable;

public class Flag implements Serializable{
	
	public int bookId;
	public int userId;
	public int flagType;
	public String explanation;
	
	public Flag() {
	}

	public Flag(int bookId, int userId, int flagType, String explanation) {
		this.bookId = bookId;
		this.userId = userId;
		this.flagType = flagType;
		this.explanation = explanation;
	}
	
	public Flag(int userId, int flagType, String explanation) {
		this.userId = userId;
		this.flagType = flagType;
		this.explanation = explanation;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlagType() {
		return flagType;
	}

	public void setFlagType(int flagType) {
		this.flagType = flagType;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String review) {
		this.explanation = review;
	}

}
