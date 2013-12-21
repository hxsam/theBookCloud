package com.thebookcloud.objects;

public class Bookmark {
	
	private int bookmarkId;
	private int userId;
	private int bookId;
	private int chapterId;
	private String firstLineOfPage;
	
	public Bookmark() {
	}
	
	public Bookmark(int bookmarkId, int userId, int bookId, int chapterId,
			String firstLineOfPage) {
		this.bookmarkId = bookmarkId;
		this.userId = userId;
		this.bookId = bookId;
		this.chapterId = chapterId;
		this.firstLineOfPage = firstLineOfPage;
	}
	
	public Bookmark(int userId, int bookId, int chapterId,
			String firstLineOfPage) {
		this.userId = userId;
		this.bookId = bookId;
		this.chapterId = chapterId;
		this.firstLineOfPage = firstLineOfPage;
	}

	public int getBookmarkId() {
		return bookmarkId;
	}

	public void setBookmarkId(int bookmarkId) {
		this.bookmarkId = bookmarkId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getFirstLineOfPage() {
		return firstLineOfPage;
	}

	public void setFirstLineOfPage(String firstLineOfPage) {
		this.firstLineOfPage = firstLineOfPage;
	}

}
