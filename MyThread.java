class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " is running...");
		System.out.println("Priority of " + Thread.currentThread().getName() + " is = " + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		MyThread tOne = new MyThread();
		MyThread tTwo = new MyThread();
		tOne.setPriority(10);
		tTwo.setPriority(3);
		tOne.start();
		tTwo.start();
	}
}
