import java.net.*;
class Inet
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address.getHostName());
		System.out.println(Address.getHostAddress());
	}
}