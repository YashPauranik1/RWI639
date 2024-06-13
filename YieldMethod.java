package Jun23Multithreading;

class YieldThread extends Thread{
	public void run()	{
		for(int i=0;i<5;i++){
			Thread.yield();
			System.out.println("child thread");
		}
	}
}

public class YieldMethod 
{
	public static void main(String[] args) {
		YieldThread y=new YieldThread();
		Thread t=new Thread(y);	
		t.setPriority(10);
		t.start();
		for(int i=0;i<5;i++){
				System.out.println("main thread");
		}
	}


}
