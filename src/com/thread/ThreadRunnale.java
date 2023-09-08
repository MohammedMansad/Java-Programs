package com.thread;

class EmailNotificatn implements Runnable
{
	public void run()
	{
		
		System.out.println("Email1"+Thread.currentThread().getName());
		System.out.println("EmailNotification");
	}
	
	
}

public class ThreadRunnale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailNotificatn email=new EmailNotificatn();
		Thread t=new Thread(email);
		t.start();
		System.out.println("Main method Thread:"+Thread.currentThread().getName());
	}

}
