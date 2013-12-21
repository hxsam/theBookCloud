package com.thebookcloud.objects;

public class Chapter {
	
	private int chapterId;
	private int bookId;
	private int chapterNumber;
	private String title;
	private String text;
	
	public Chapter() {
	}
	
	public Chapter(int chapterId, int bookId, int chapterNumber, String title,
			String text) {
		this.chapterId = chapterId;
		this.bookId = bookId;
		this.chapterNumber = chapterNumber;
		this.title = title;
		this.text = text;
	}
	
	public Chapter(int bookId, int chapterNumber, String title,
			String text) {
		this.bookId = bookId;
		this.chapterNumber = chapterNumber;
		this.title = title;
		this.text = text;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
