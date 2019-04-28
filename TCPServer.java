import java.io.*;
import java.net.*;
class TCPServer{
	public static void main(String[] args) throws Exception{
		String clientSentence, capitalizedSentence;
		ServerSocket welcomeSocket = new ServerSocket(3000);
		while(true){
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			clientSentence = inFromClient.readLine();
			System.out.println(clientSentence);
			capitalizedSentence = clientSentence.toUpperCase()+'\n';
			outToClient.writeBytes(capitalizedSentence);
		}
	}
}