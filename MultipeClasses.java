/*
* This is a Java program to calculate Room Area with using Multiple Java Classes.
*/
class Room
{
    float length;
	float breadth;
	void getData(float a, float b)
	{
		length = a;
		breadth = b;
	}
}
class MultipeClasses
{
	public static void main(String args[])
	{
		float area;
		Room room1=new Room(); //Create an object room1
		room1.getData(14,10);  //Assigs values to length and breadth
		area = room1.length*room1.breadth;
		System.out.println("Area of Room= "+area);

	}
}
