package gr.aueb.cf.ch26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class DateTimeCli {

    public static void main(String[] args) {

        Socket socket = null;
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = null;

        try {
            InetAddress servAddress = InetAddress.getByName("time.nist.gov");   // connects to a DateTime server
//            InetAddress servAddress = InetAddress.getByName("127.0.0.1");           // localhost - to use if we write a local DateTime server
            int servPort = 13;
            socket = new Socket(servAddress, servPort);                               // create socket and connect at the same time
            bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));  // get socket data with BufferedStreamReader
            String line = "";

            while ((line = bf.readLine()) != null) {                                  // read socket data and add to StringBuilder
                sb.append(line).append("\n");
            }

            System.out.println("Server DateTime: " + sb);                             // print socket data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
                if (bf != null) bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
