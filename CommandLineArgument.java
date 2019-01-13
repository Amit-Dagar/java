/*
* This is a java program for printing Command Line Arguments.
* This program uses command line as input.
*/
class CommandLineArgument
{
    public static void main(String args[]) {
		int count,i=0;
		String string;
		count = args.length;
		System.out.println("Number of Arguments = "+count);
		while(i < count)
		{
			string = args[i];
			i=i+1;
			System.out.println(i+" : Java is "+string+"!");
		}
	}
}
