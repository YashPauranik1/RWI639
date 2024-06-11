package Jun11Multithreading;
import java.lang.*;
class MyThread extends Thread { 	 
    public void run() {
         // System.out.println(" this thread is running ... ");
          for(int i=1;i<10;i++) {
        	  System.out.println(" Curent thread is "+Thread.currentThread().getName());
          }
    }
}  
public class FirstThread 
{
    public static void main(String [] args  ) {
	MyThread obj = new MyThread();
	Thread t=new Thread(obj);
	t.setName("Yash");
	Thread t1=new Thread(obj);
	t1.setName("Pauranik");
	 t.start();
	 t1.start();
	 
   }
    

}	
