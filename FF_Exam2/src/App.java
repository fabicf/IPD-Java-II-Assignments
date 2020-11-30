import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/*
 Fabiola Faria
 Answers
 Please note that I added a Rectangle class to test the theoretic questions.
 
 1. C
 ps. "the finally block is executed even if an unexpected exception occurs" ref: oracle docs
 
 2. C
 ps. see main method to test and Rectangle Class
 
 3. E (is not true)
 Ps. I tested in Rectangle Class: a. true; b. true; c. true; d. true; e. false
 
 4. D
 
 */

public class App {

	public static void main(String[] args) {

		// Theoretic questions test
		Rectangle r1 = new Rectangle();
		r1.setColor(Color.blue);
		Rectangle r2 = r1;
		r2.setColor(Color.red);

		System.out.println("r1 color is:" + r1.color);
		System.out.println("r2 color is:" + r2.color);

		// Question 5

		// List of Messages
		List<Message> listOfMessages = new ArrayList<Message>();

		// EmailMessage instance
		EmailMessage email1 = new EmailMessage(
				new EmailUser("Judy", "Foster", new Address("Main Street", 1), "a.b@g.com"),
				new EmailUser("Betty", "Beans", new Address("Second Street", 2), "v.r@g.com"), "This is one email");

		// smsMessageInstance
		SmsMessage smsMessage = new SmsMessage(new SmsUser("Judy", "Foster", new Address("Main Street", 1), "122123"),
				new SmsUser("Bety", "Beans", new Address("Second Street", 2), "1232313"), "This is one sms");

		SendEmail se1 = new SendEmail();
		SendSms ss1 = new SendSms();

		listOfMessages.add(email1);
		listOfMessages.add(smsMessage);

		for (int i = 0; i < listOfMessages.size(); i++) {

			if (listOfMessages.get(i) instanceof EmailMessage) {
				EmailMessage m1 = (EmailMessage) listOfMessages.get(i);
				if (se1.validateMessage(m1.getSender(), m1.getReceiver(), m1.getBody())) {
					se1.sendMesssage(m1);

				}
			}
			if (listOfMessages.get(i) instanceof SmsMessage) {
				SmsMessage m1 = (SmsMessage) listOfMessages.get(i);
				if (ss1.validateMessage(m1.getSender(), m1.getReceiver(), m1.getBody())) {
					ss1.sendMesssage(m1);

				}
			}

		}

	}

}
