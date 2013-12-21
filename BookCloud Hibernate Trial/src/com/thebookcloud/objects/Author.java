package com.thebookcloud.objects;

import java.util.Set;

public class Author {

	private int authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Set<AuthorRating> authorRatings;
	
	public Author() {
	}

	public Author(int authorId, String firstName, String middleName,
			String lastName, Set<AuthorRating> authorRatings) {
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.authorRatings = authorRatings;
	}
	
	public Author(String firstName, String middleName,
			String lastName, Set<AuthorRating> authorRatings) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.authorRatings = authorRatings;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Set<AuthorRating> getAuthorRatings() {
		return authorRatings;
	}

	public void setAuthorRatings(Set<AuthorRating> authorRatings) {
		this.authorRatings = authorRatings;
	}
	
}
