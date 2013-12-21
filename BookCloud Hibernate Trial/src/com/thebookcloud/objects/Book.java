package com.thebookcloud.objects;

import java.util.Set;

public class Book {
	
	private int bookId;
	private String isbn;
	private String title;
	private String year;
	private String picturePath;
	private int category;
	private int bookType;	
	private Set<Author> authors;	
	private Set<BookRating> bookRatings;
	private Set<Flag> flags;
	
	public Book() {
	}

	public Book(int bookId, String isbn, String title, String year,
			int bookType, Set<Author> authors, Set<BookRating> bookRatings,
			Set<Flag> flags) {
		this.bookId = bookId;
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.bookType = bookType;
		this.authors = authors;
		this.bookRatings = bookRatings;
		this.flags = flags;
	}

	public Book(String isbn, String title, String year,
			int bookType, Set<Author> authors, Set<BookRating> bookRatings,
			Set<Flag> flags) {
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.bookType = bookType;
		this.authors = authors;
		this.bookRatings = bookRatings;
		this.flags = flags;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public int getBookType() {
		return bookType;
	}

	public void setBookType(int bookType) {
		this.bookType = bookType;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Set<BookRating> getBookRatings() {
		return bookRatings;
	}

	public void setBookRatings(Set<BookRating> bookRatings) {
		this.bookRatings = bookRatings;
	}

	public Set<Flag> getFlags() {
		return flags;
	}

	public void setFlags(Set<Flag> flags) {
		this.flags = flags;
	}
	
}
