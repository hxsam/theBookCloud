package com.thebookcloud.objects;

import java.util.Set;

public class User {

	private int userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailAddress;
	private String passwordHash;
	private Set<Preference> preferences;
	private Set<Queue> queues;
	
	
	public User() {
	}
	
	public User(int userId, String firstName, String middleName,
			String lastName, String emailAddress, String passwordHash,
			Set<Preference> preferences, Set<Queue> queues) {
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.passwordHash = passwordHash;
		this.preferences = preferences;
		this.queues = queues;
	}
	
	public User(String firstName, String middleName,
			String lastName, String emailAddress, String passwordHash,
			Set<Preference> preferences, Set<Queue> queues) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.passwordHash = passwordHash;
		this.preferences = preferences;
		this.queues = queues;
	}

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
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
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPasswordHash() {
		return passwordHash;
	}
	
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Set<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(Set<Preference> preferences) {
		this.preferences = preferences;
	}

	public Set<Queue> getQueues() {
		return queues;
	}

	public void setQueues(Set<Queue> queues) {
		this.queues = queues;
	}
	
	public String toString(){
		String returnStr = "userId: "+userId+"\n";
		returnStr+="firstName: "+firstName+"\n";
		returnStr+="lastName: "+lastName;
		return returnStr;
	}
	
}
