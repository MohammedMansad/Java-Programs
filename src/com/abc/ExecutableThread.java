package com.abc;

class  EmailThread  extends Thread
{
	public void run()
	{
		for (int i = 0; i < 20; i++) {
			
			System.out.println("Email"+Thread.currentThread().getName());
			System.out.println("EmailNotification send:: "+i);
			
		}
		
	}
}
public class ExecutableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailThread e1=new EmailThread();
		    e1.start();
		    
		    EmailThread e2=new EmailThread();
		    e2.start();
		    
		    
		    EmailThread e3=new EmailThread();
		    e3.start();
		    
	}

}
