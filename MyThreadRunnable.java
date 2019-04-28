class MyThreadRunnable  implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " is running...");
		System.out.println("Priority of " + Thread.currentThread().getName() + " is = " + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		MyThreadRunnable m = new MyThreadRunnable();
		MyThreadRunnable s = new MyThreadRunnable();

		Thread tOne = new Thread(m);
		Thread tTwo = new Thread(s);

		tOne.setPriority(6);
		tTwo.setPriority(2);
		tOne.start();
		tTwo.start();
	}
}
