package com.thebookcloud.objects;

import java.util.Set;

public class Queue {
	
	private int queueId;
	private User user;
	private String name;
	private Set<QueueEntry> queueEntries;
	
	public Queue() {
	}
	
	public Queue(int queueId, User user, String name,
			Set<QueueEntry> queueEntries) {
		this.queueId = queueId;
		this.user = user;
		this.name = name;
		this.queueEntries = queueEntries;
	}
	
	public Queue(User user, String name,
			Set<QueueEntry> queueEntries) {
		this.user = user;
		this.name = name;
		this.queueEntries = queueEntries;
	}

	public int getQueueId() {
		return queueId;
	}
	
	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Set<QueueEntry> getQueueEntries() {
		return queueEntries;
	}

	public void setQueueEntries(Set<QueueEntry> queueEntries) {
		this.queueEntries = queueEntries;
	}

}
