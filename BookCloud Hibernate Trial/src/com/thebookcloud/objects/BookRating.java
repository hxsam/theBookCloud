package com.thebookcloud.objects;

import java.io.Serializable;

public class BookRating implements Serializable{
	
	private int bookId;
	private int userId;
	private int rating;
	private String review;
	
	public BookRating() {
	}

	public BookRating(int bookId, int userId, int rating, String review) {
		this.bookId = bookId;
		this.userId = userId;
		this.rating = rating;
		this.review = review;
	}
	
	public BookRating(int userId, int rating, String review) {
		this.userId = userId;
		this.rating = rating;
		this.review = review;
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
