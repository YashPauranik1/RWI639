package Jun13Multithreading;

public class DaemonThread extends Thread
{
	public void run(){ 
		// Checking whether the thread is Daemon or not
		  if(Thread.currentThread().isDaemon()){ 
		      System.out.println("Daemon thread executing");  
		  }  
		  else{  
	      System.out.println("user(normal) thread executing");  
	          }  
	   }  
	public static void main(String[] args) {
		DaemonThread dt=new DaemonThread();
		DaemonThread dt2=new DaemonThread();   
		Thread t1=new Thread(dt);
		Thread t2=new Thread(dt2);		
		 //Making user thread t1 to Daemon
	        t1.setDaemon(true);			     
	        //starting both the threads 
	        t1.start(); 
	        t2.start();  
	}


}
