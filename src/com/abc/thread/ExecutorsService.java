package com.abc.thread;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class  ExecutorServicThread  implements Runnable
{
	public void run()
	{
		//list employee -->200
		//iterator forloop
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"   EmailNotification send:: "+i);
			
		}
		try {
			
			
			System.out.println("Sleep"+Thread.currentThread().getName());
			Thread.sleep(10000);
			System.out.println("Wake up"+Thread.currentThread().getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
public class ExecutorsService {
public static void main(String[] args) {
//thread pool
	/*ExecutorService executor =Executors.newSingleThreadExecutor();
	ExecutorServicThread executorServicThread=new ExecutorServicThread();
	executor.submit(executorServicThread);*/
	
	//3 t
	//5 times
	//1 1 2 2 3 3 
	//1 4 //25
	ExecutorService executorFixed =Executors.newFixedThreadPool(3);
	ExecutorServicThread executorServicThread=new ExecutorServicThread();
		executorFixed.execute(executorServicThread);
	
//	executorFixed.execute(executorServicThread);
	//executorFixed.execute(executorServicThread);
	//ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
}
}
