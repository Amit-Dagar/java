import java.io.*;
import java.net.*;

class Client{
	public static void main(String[] args) {
		try{
			DataInputStream in = new DataInputStream(System.in);
			System.out.print("Type a message to server: ");
			
			String msg = new String(in.readLine());

			Socket s=new Socket("localhost",5000);
			
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			
			out.writeUTF(msg);
			out.flush();
			out.close();
			s.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}