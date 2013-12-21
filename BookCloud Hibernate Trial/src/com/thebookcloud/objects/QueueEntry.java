package com.thebookcloud.objects;

public class QueueEntry {
	
	private int queueEntryId;
	private Queue queue;
	private int bookId;
	private int orderPlacement;
	
	public QueueEntry() {
	}
	
	public QueueEntry(int queueEntryId, Queue queue, int bookId,
			int orderPlacement) {
		this.queueEntryId = queueEntryId;
		this.queue = queue;
		this.bookId = bookId;
		this.orderPlacement = orderPlacement;
	}
	
	public QueueEntry(Queue queue, int bookId,
			int orderPlacement) {
		this.queue = queue;
		this.bookId = bookId;
		this.orderPlacement = orderPlacement;
	}
	
	public int getQueueEntryId() {
		return queueEntryId;
	}
	
	public void setQueueEntryId(int queueEntryId) {
		this.queueEntryId = queueEntryId;
	}
	
	public Queue getQueue() {
		return queue;
	}
	
	public void setQueue(Queue queue) {
		this.queue = queue;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getOrderPlacement() {
		return orderPlacement;
	}
	
	public void setOrderPlacement(int orderPlacement) {
		this.orderPlacement = orderPlacement;
	}

}
