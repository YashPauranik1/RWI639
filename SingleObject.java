package Jun12Multithreading;
class Reserve implements Runnable{
	   int available=5;
	   int wanted;
	  Reserve(int i){									   
	              wanted=i;
	              System.out.println("Available Breaths="+available);
	                     }
	     public void run(){		
	       if(available>=wanted){
	        String name=Thread.currentThread().getName();
	        System.out.println(wanted+"Berths Reserved For"+name);
	        available=available-wanted;
				/*try{
					Thread.sleep(1500);
					available=available-wanted;
					available--;
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}*/
			}
			else
				System.out.println("Sorry, no breaths");
		}
	}

public class SingleObject 
{
	public static void main(String[] args) {
		Reserve obj=new Reserve(2);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName(" Yash");
		t2.setName(" Laddu");
		t1.start();
		t2.start();
	}


}
