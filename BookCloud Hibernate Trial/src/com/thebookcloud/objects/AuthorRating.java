package com.thebookcloud.objects;

import java.io.Serializable;

public class AuthorRating implements Serializable {
	
	private int authorId;
	private int userId;
	private int rating;
	private String review;
	
	public AuthorRating() {
	}

	public AuthorRating(int authorId, int userId, int rating, String review) {
		this.authorId = authorId;
		this.userId = userId;
		this.rating = rating;
		this.review = review;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
