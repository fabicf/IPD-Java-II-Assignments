
public interface ISendInfo {

	boolean validateMessage(User sender, User receiver, String body);
	
	void sendMesssage(Message message);
	
	
//	boolean validateMessage(EmailUser sender, EmailUser receiver, String body);
//
//	void sendMesssage(Message message);
}
