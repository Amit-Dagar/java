class Constructor{
	int num;
	String str;
	Constructor(int var, String str){
		num=var;
		this.str=str;
	}
	Constructor(Constructor c){
		num=c.num;
		this.str=c.str;
	}
	void display(){
		System.out.println("Number = " + num + ", String = " + str);
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor(5,"Hello World");
		Constructor c2=new Constructor(c1);

		c1.display();
		c2.display();
	}
}