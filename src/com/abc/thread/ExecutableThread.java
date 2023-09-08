package com.abc.thread;

class  EmailThread  extends Thread
{
	public void run()
	{
		//list employee -->200
		//iterator forloop
		for (int i = 0; i < 20; i++) {
			System.out.println("Email:: "+Thread.currentThread().getName());
			System.out.println("EmailNotification send:: "+i);
			
		}
		try {
			//exception
			try {
				String n=null;
				n.length();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Sleep"+Thread.currentThread().getName());
			Thread.sleep(10000);
			System.out.println("Wake up"+Thread.currentThread().getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}
	
	/*public void start() {
		System.out.println("Sleep"+Thread.currentThread().getName());
	}*/
}
public class ExecutableThread {
//thread s
	public static void main(String[] args) {
		
		//for
		// TODO Auto-generated method stub
		EmailThread e1=new EmailThread();
		    e1.start();
		    
		    EmailThread e2=new EmailThread();
		    e2.start();
		    
		    
		    EmailThread e3=new EmailThread();
		    e3.start();
		    
		    for (int i = 0; i < 10; i++) {
				
				System.out.println("Main"+Thread.currentThread().getName());
				System.out.println("Main EmailNotification send:: "+i);
				
			}
		    
	}

}
