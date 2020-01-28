package com.ds.multithreading;

public class ApplicationUsingRunnable {
	public static void main(String[] args) {
		Task1 task = new Task1();
		Thread thread = new Thread(task);
		thread.start();
	}
}

class Task1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
