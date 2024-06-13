package Jun23Multithreading;

class X extends Thread{
	   public void run() {
	     System.out.println("Thread x Started");
	     for(int i=0; i<5; i++) {
	              System.out.println("\t value of i in Thread x : " + i);
	        }
	              System.out.println("Threadx finished ");
	    }
	}
	class Y extends Thread{
	      public void run() {
	       System.out.println("Thread Y started");
	       for(int i=0; i<5; i++) {
	                 System.out.println("\t Value of i in Thread Y : " + i);
	            }
	                 System.out.println("ThreadY Finished");
	      }
	}
	class Z extends Thread{
	      public void run() {
	       System.out.println("Thread Z started");
	       for(int i=0; i<5; i++) {
	                 System.out.println("\t Value of i in Thread Z : " + i);
	            }
	                 System.out.println("ThreadZ Finished");
	      }
	}
public class ThreadPriority {
	public static void main(String[] args) {
		 System.out.println("Main thread started");
	          X threadX = new X();
	          Y threadY = new Y ();
	          Z threadZ = new Z ();
	          threadZ.setPriority(Thread.MAX_PRIORITY);  // priority = 10
	          threadY.setPriority(threadX.getPriority()+1); // priority = 6
	          threadX.setPriority(Thread.MIN_PRIORITY); // priority =l
	          Thread t1=new Thread(threadX);
	          Thread t2=new Thread(threadY);
	          Thread t3=new Thread(threadZ);
	          t1.start(); 
	          t2.start(); 
	          t3.start();       
	    }


}
