import java.io.BufferedWriter;
import java.io.FileWriter;

public class SendEmail implements ISendInfo {

	@Override
	public boolean validateMessage(User sender, User receiver, String body) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		EmailUser senderEmailUser = (EmailUser) sender;
		EmailUser receiverEmailUser = (EmailUser) receiver;

		if (!senderEmailUser.getEmailAddress().matches((regex))
				|| !senderEmailUser.getEmailAddress().matches((regex))) {
			return false;
		}

		if (body == null || body.contains("^") || body.contains("*") || body.contains("!")) {
			throw new IllegalArgumentException("Please enter a body for your email");
		}

		return true;
	}

	@Override
	public void sendMesssage(Message message) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resource/email.txt"))) {
			writer.write(message.toString());
		} catch (Exception e) {
		}

	}

}
