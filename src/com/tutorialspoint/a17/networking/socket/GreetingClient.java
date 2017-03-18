package com.tutorialspoint.a17.networking.socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class GreetingClient {

    public static void main(String[] args) {

//        String serverName = args[0];
        String serverName = "localhost";
//        int port = Integer.valueOf(args[1]);
        int port = 6066;

        try {

            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server says " + in.readUTF());
            client.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
