import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class GmailHelper {
	
	public static String getLinkContent(String findBy) {
		System.out.println("getLinkContent 1");
	
		String resetLink = "not found";
        String strResult = new String();
        
        String USERNAME = "le.minh.971912@gmail.com";
        String PASSWORD = "leminh1997";

		try {

			String host = "pop.gmail.com";

			// create properties field
			Properties properties = new Properties();

			properties.put("mail.pop3.host", host);
			properties.put("mail.pop3.port", "995");
			properties.put("mail.pop3.starttls.enable", "true");
            
            Authenticator auth = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(USERNAME, PASSWORD);
                }
            };

            Session emailSession = Session.getDefaultInstance(properties, auth);

			// create the POP3 store object and connect with the pop server
			Store store = emailSession.getStore("pop3s");

            store.connect(host, USERNAME, PASSWORD);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("INBOX");
			// System.out.println(emailFolder);
			emailFolder.open(Folder.READ_ONLY); 

			// retrieve the messages from the folder in an array and print it
			Message[] messages = emailFolder.getMessages();
			// System.out.println("messages.length---" + messages.length);

			String subString =  findBy;
			// System.out.println("Minh-----------subString: " + subString);
			int n = messages.length;
			
			try {
	        Thread.sleep(100*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
			System.out.println("messages.length---n---" + messages.length);
			for (int i = n-1; i > 0 ; i--) {
				String subject = messages[i].getSubject();
				 
			         System.out.println("---------------------------------");
			         System.out.println("Email Number " + (i));
			         System.out.println("Subject: " + messages[i].getSubject());
			         System.out.println("From: " + messages[i].getFrom()[0]);
			         System.out.println("Text: " + messages[i].getContent().toString());
				if (subject.matches(subString)) {
					String strText = messages[i].getContent().toString();
            
                    Multipart multiPart = (Multipart) messages[i].getContent();
                    int numberOfParts = multiPart.getCount();
                    for (int partCount = 0; partCount < numberOfParts; partCount++) {
                        MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
                        resetLink = part.getContent().toString();
                    }
					// System.out.println("strText ---------------------------------");
					// resetLink = strText;
					System.out.println(resetLink);
					break;
				}
			}

			// int indexStart = resetLink.indexOf("href");
			// int indexEnd = resetLink.indexOf(">http");
			// String resetSubLink = resetLink.substring(indexStart + 6, indexEnd - 1);
			// strResult = resetSubLink;
			// System.out.println(strResult);

            // close the store and folder objects

			emailFolder.close(false);
			store.close();

		} catch (NoSuchProviderException e) {
            System.out.println(e);
			e.printStackTrace();
		} catch (MessagingException e) {
            System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
            System.out.println(e);
			e.printStackTrace();
        }

		return strResult = resetLink;

	}
}
