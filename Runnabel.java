package Jun11Multithreading;
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int x =1; x < 10; x++) {
		System.out.println("MyRunnable running for Thread Name: " + Thread.currentThread().getName());
			}
	}
}


public class Runnabel 
{
	public static void main(String[] args) {
		MyRunnable myrunnable = new MyRunnable();
		//Passing myrunnable object to Thread class constructor
		Thread t1 = new Thread(myrunnable);
		t1.setName("Yash");
		//Starting Thread t1
		t1.start();
		Thread t2 = new Thread(myrunnable);
		t2.setName("Pauranik");
		t2.start();
	}


}
