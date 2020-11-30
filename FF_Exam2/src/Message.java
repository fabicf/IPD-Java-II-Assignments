
public class Message {
	private User receiver;
	private User sender;
	private String body;
	
	public Message(User receiver, User sender, String body) {
		super();
		this.receiver = receiver;
		this.sender = sender;
		body = body;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
	
}
