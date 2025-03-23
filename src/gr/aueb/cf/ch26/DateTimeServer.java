package gr.aueb.cf.ch26;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer extends Thread {  // οι concurrent servers "σηκώνουν" thread για κάθε αίτημα (async), οι iterative, μόνο ένα

    @Override
    public void run() {
        ServerSocket servFd;    // fd: file descriptor
        int serverPort = 13;

        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", serverPort), 100);

            while (true) {  // ο server τρέχει για πάντα
                Socket connectedFd = servFd.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                bw.write(new Date().toString());
                bw.flush();
                connectedFd.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
