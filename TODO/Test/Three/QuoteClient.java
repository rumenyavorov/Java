package TODO.Test.Three;

import java.io.*;
import java.net.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class QuoteClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int lineToGet = Integer.parseInt(sc.nextLine());

        if (args.length != 1) {
             System.out.println("Usage: java QuoteClient <hostname>");
             return;
        }
 
            // get a datagram socket
        DatagramSocket socket = new DatagramSocket();
 
            // send request
        byte[] buf = new byte[256];
        InetAddress address = InetAddress.getByName(args[0]);
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
        socket.send(packet);
     
            // get response
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
 
        // display response
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Quote of the Moment: " + received);
        String line = Files.readAllLines(Paths.get("Exam/file.txt")).get(lineToGet);
        System.out.println("Test: " + line);
        // System.out.println(socket.getPort());
        // System.out.println(socket);
        // System.out.println(socket.getLocalSocketAddress());
        // System.out.println(socket.isBound());
        // System.out.println(socket.isConnected());
    
        socket.close();
    }
}