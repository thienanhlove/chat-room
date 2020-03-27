package edu.udacity.java.nano.chat;

import java.util.Date;

/**
 * WebSocket message model
 */
public class Message {
    // TODO: add message model.
	private String content;
    private String sender;
    private Date received;

	public Message() {
		
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Date getReceived() {
		return received;
	}

	public void setReceived(Date received) {
		this.received = received;
	}
	
}
