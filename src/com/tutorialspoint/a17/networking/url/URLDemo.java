package com.tutorialspoint.a17.networking.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.amrood.com/index.htm?language=en#j2se");

            System.out.println("URL is: " + url.toString());
            System.out.println("protocol is: " + url.getProtocol());
            System.out.println("Authority is: " + url.getAuthority());
            System.out.println("File name is: " + url.getFile());
            System.out.println("Host is: " + url.getHost());
            System.out.println("Path is: " + url.getPath());
            System.out.println("Port is: " + url.getPath());
            System.out.println("Default port is: " + url.getDefaultPort());
            System.out.println("Query is: " + url.getQuery());
            System.out.println("Ref is: " + url.getRef());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

}
