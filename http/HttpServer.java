import java.io.*;
import java.net.*;

class HttpServer {
    final static int port = 8080;

    public static void main(String argv[]) throws Exception {
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("server is ready to handle requests at http://127.0.0.1:" + port + "/");

        // an infinite loop to allow an unbounded amount of website visitors
        while (true) {
            // wait for an incoming visitor
            Socket clientSocket = serverSocket.accept();
            
            // handle the visitor's request
            new ClientConnection(clientSocket);
        }
    }
}