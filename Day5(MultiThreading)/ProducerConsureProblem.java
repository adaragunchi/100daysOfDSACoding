package com.ds.multithreading;

class Item {
	int i;
	boolean isVlaueSet = false;

	public synchronized void put(int i) {
		if (isVlaueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		this.i = i;
		System.out.println(" PUT :" + i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		isVlaueSet = true;
		notify();
	}

	public synchronized void get() {
		if (!isVlaueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(" GET :" + i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		isVlaueSet = false;
		notify();
	}
}

class Producer implements Runnable {
	Item item;

	public Producer(Item item) {
		this.item = item;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			item.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Item item;

	public Consumer(Item item) {
		this.item = item;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {
		while (true) {
			item.get();
		}
	}
}

public class ProducerConsureProblem {
	public static void main(String[] args) {
		Item item = new Item();
		new Producer(item);
		new Consumer(item);
	}
}
