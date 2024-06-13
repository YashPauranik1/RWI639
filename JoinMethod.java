package Jun23Multithreading;

class JoinThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("first Thread");
			try{
				Thread.sleep(200);
			}
			catch (InterruptedException e){}
		}
	}
}

public class JoinMethod 
{
	public static void main(String[] args) throws InterruptedException {
		JoinThread j=new JoinThread();
		Thread t=new Thread(j);
		t.start();
	    t.join();	
	   // System.out.println(Thread.currentThread().getPriority());
	   
		for(int i=0;i<5;i++)		{
			System.out.println("second Thread");
		}
		 System.out.println(Thread.currentThread().isAlive());
	}


}
