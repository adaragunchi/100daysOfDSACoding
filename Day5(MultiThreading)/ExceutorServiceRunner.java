package com.ds.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExcutorTask extends Thread {
	private int number;

	public ExcutorTask(int number) {
		this.number = number;
	}

	public void run() {
		for (int i = number*100; i < number * 100+99; i++) {
			System.out.println("number" + i);
		}
	}
}

public class ExceutorServiceRunner {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		executorService.execute(new ExcutorTask(1));
		executorService.execute(new ExcutorTask(2));
		executorService.execute(new ExcutorTask(3));
		executorService.shutdown();
	}
}
