import java.awt.Color;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class spamalot {
	static final String FAKE_USERNAME = "hihi14591@gmail.com";
static final String FAKE_PASSWORD = "Aidan4473";

	
	
public static void main(String[] args) {
	spamalot spam=new spamalot();
	spam.sendSpam("liam.tan8@gmail.com", "stalking u", "stalked");
	spam.ui();
}
private boolean sendSpam(String recipient, String subject, String content) {

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;

	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}

public void ui(){
JFrame frame= new JFrame();	
	JPanel panel=new JPanel();
	JButton button1=new JButton("bad");
	JButton button2=new JButton("good");
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.pack();
    frame.setVisible(true);
    JComponent myJTextField = null;
	myJTextField.setBackground(Color.RED);

}
}
