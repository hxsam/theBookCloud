package com.thebookcloud.objects;

public class Preference {
	
	private int preferenceId;
	private int preferenceType;
	private User user;
	private String value;
	
	public Preference() {
	}
	
	public Preference(int preferenceId, int preferenceType, User user,
			String value) {
		this.preferenceId = preferenceId;
		this.preferenceType = preferenceType;
		this.user = user;
		this.value = value;
	}
	
	public Preference(int preferenceType, User user,
			String value) {
		this.preferenceType = preferenceType;
		this.user = user;
		this.value = value;
	}
	
	public int getPreferenceId() {
		return preferenceId;
	}
	
	public void setPreferenceId(int preferenceId) {
		this.preferenceId = preferenceId;
	}
	
	public int getPreferenceType() {
		return preferenceType;
	}
	
	public void setPreferenceType(int preferenceType) {
		this.preferenceType = preferenceType;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

}
