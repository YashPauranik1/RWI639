package Jun12Multithreading;

import java.io.IOException;
import static java.lang.Thread.currentThread;
class UserThread implements Runnable {
	   private volatile boolean exit = false;
	   public void run() {
	      while(!exit) {
	         System.out.println("The user thread is running");
	      }
	      System.out.println("The user thread is now stopped");
	   }
	   public void stop() {
	      exit = true;
	   }
	}

public class TerminateTheThread 
{
	 public static void main(String args[]) throws InterruptedException {
	      UserThread userThread = new UserThread();
	      Thread thread = new Thread(userThread, "T1");
	      thread.start();
	      System.out.println(currentThread().getName()+ " is stopping user thread");
	      userThread.stop();
	      Thread.sleep(200);
	      System.out.println(currentThread().getName() + " is finished now");
	   }

}
