package com.abc.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class  ExecutorServicThreadCallable<T>  implements Callable<T>
{

	@Override
	public T call() throws Exception {

		//list employee -->200
		//iterator forloop
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"   EmailNotification send:: "+i);
			
		}
		// TODO Auto-generated method stub
		return (T) Thread.currentThread().getName();
	}
}
public class ExecutorsServiceCallable {
public static <T> void main(String[] args) throws InterruptedException, ExecutionException {
//thread pool
	/*ExecutorService executor =Executors.newSingleThreadExecutor();
	ExecutorServicThread executorServicThread=new ExecutorServicThread();
	executor.submit(executorServicThread);*/
	
	//3 t
	//5 times
	//1 1 2 2 3 3 
	//1 4 //25
	ExecutorService executorFixed =Executors.newFixedThreadPool(3);
	ExecutorServicThreadCallable executorServicThread=new ExecutorServicThreadCallable();
	Future<T> result=executorFixed.submit(executorServicThread);
	String value = (String) result.get();
	System.out.println("value::: "+value);
//	executorFixed.execute(executorServicThread);
	//executorFixed.execute(executorServicThread);
	//ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
}
}
