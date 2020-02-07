import java.io.*;
import java.net.*;

class ClientConnection
{
    private Socket socket;
    private BufferedReader in;
    private DataOutputStream out;

    private String requestedFile;
    private String responseContentType;
    private String responseBody;

    ClientConnection(Socket socket) {
        this.socket = socket;

        try {
            // create streams to allow our server to receive and send data
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new DataOutputStream(socket.getOutputStream());

            // parse, handle and respond to the client's request
            parseRequest();
            fetchResponseData();
            respondToClient();
        } catch (Exception exception) {
            System.err.println("failed to handle incoming client:");
            exception.printStackTrace();
        }
    }

    private void parseRequest() throws IOException {
        String request = in.readLine();

        System.out.println("request from client: " + request);

        // TODO: parse the "request" string and set an appropriate value of this variable
        requestedFile = "/";
    }

    private void fetchResponseData() {
        // if the path we are requested to serve ends with a slash, we'll try to serve the file "index.htm" in that folder
        if (requestedFile.endsWith("/")) {
            requestedFile = requestedFile + "index.htm";
        }

        // TODO: instead of having a hard-coded response, read the file pointed out to by requestedFile and return its contents
        responseBody = "<h1>Hello!</h1><p>This is an HTML document.</p>";

        // this web server only serves HTML content (no images, no other data type), so the content type is always like below
        responseContentType = "text/html; charset=UTF-8";
    }

    private void respondToClient() throws IOException {
        int contentLength = responseBody.getBytes().length;

        out.writeBytes("HTTP/1.1 200 OK\n");
        out.writeBytes("Content-Type: " + responseContentType + "\n");
        out.writeBytes("Content-Length: " + contentLength + "\n");
        
        // separate headers from the body (the HTML code) by an extra new line character
        out.writeBytes("\n");

        out.writeBytes(responseBody);

        // close the streams and the socket
        in.close();
        out.close();
        socket.close();
    }
}