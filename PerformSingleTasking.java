package Jun11Multithreading;
class Threads implements Runnable{
	public void run(){
		task1();
		task2();
		task3();
	}
	public void task1(){
		System.out.println("This is task1");
	}
	public void task2(){
		System.out.println("This is task2");
	}
	public void task3(){
		System.out.println("This is task3");
	}	
}

public class PerformSingleTasking
{
	public static void main(String[] args) {
		Threads s=new Threads();
		Thread t=new Thread(s);
		t.start();
	}


}
