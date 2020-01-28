package com.ds.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExcecutorServiceCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		List<TaskWIthCallable> list = new ArrayList<TaskWIthCallable>();
		list.add(new TaskWIthCallable("Manju"));
		list.add(new TaskWIthCallable("Sanju"));
		list.add(new TaskWIthCallable("Poorva"));
		list.add(new TaskWIthCallable("Chandru"));

		List<Future<String>> tasks = executorService.invokeAll(list);

		for (Future<String> future : tasks) {
			System.out.println(future.get());
		}
		
		executorService.shutdown();
	}

}

class TaskWIthCallable implements Callable<String> {

	private String name;

	public TaskWIthCallable(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello from " + name;
	}

}