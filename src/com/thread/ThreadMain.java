package com.thread;


class EmailNotification  extends Thread
{
	public void run()
	{
		
		System.out.println("Email1"+Thread.currentThread().getName());
		System.out.println("EmailNotification");
	}
	
	 
}
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailNotification  thrd =new EmailNotification();
		thrd.start();
		System.out.println("Main2"+Thread.currentThread().getName());
		

	}

}

