import java.io.BufferedWriter;
import java.io.FileWriter;

public class SendSms implements ISendInfo {

	@Override
	public boolean validateMessage(User sender, User receiver, String body) {
		String regex = "^[0-9]{10}$";
		SmsUser senderSmsUser = (SmsUser) sender;
		SmsUser receiverSmsUser = (SmsUser) receiver;

		if (!senderSmsUser.getPhoneNumber().matches((regex)) || !senderSmsUser.getPhoneNumber().matches((regex))) {
			return false;
		}

		if (body.length() > 160 || body.contains("&") || body.contains("#") || body.contains("@")) {
			throw new IllegalArgumentException(
					"Please enter a body for your sms less than 160 characteres with no &, # or @");
		}

		return true;
	}

	@Override
	public void sendMesssage(Message message) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resource/sms.txt"))) {
			writer.write(message.toString());
		} catch (Exception e) {

		}

	}

}
