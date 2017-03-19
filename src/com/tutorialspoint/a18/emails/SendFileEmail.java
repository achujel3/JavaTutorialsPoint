package com.tutorialspoint.a18.emails;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class SendFileEmail {

    public static void main(String[] args) {

        String to = "abc@gmail.com";
        String from = "web@gmail.com";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.stmp.host", host);
        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is the subject line!");
            BodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setText("This is message body");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            String fileName = "file.txt";
            DataSource source = new FileDataSource(fileName);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            Transport.send(message);
            System.out.println("Sent message successfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
