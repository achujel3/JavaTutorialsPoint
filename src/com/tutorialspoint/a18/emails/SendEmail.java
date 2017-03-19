package com.tutorialspoint.a18.emails;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {

    public static void main(String[] args) {

        String to = "random@gmail.com";
        String from = "web@gmail.com";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        try {

            Session session = Session.getDefaultInstance(properties);

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is the Subject Line");
            message.setText("This is actual message");

            Transport.send(message);
            System.out.println("Sent message succ   essfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
