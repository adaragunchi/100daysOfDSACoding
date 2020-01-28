package com.ds.multithreading;

public class Application {
public static void main(String[] args) {
	Task task =new Task();
	task.start();
	System.out.println("Hello");
	
	Task task1=new Task();
	task1.start();
}

}
class Task extends Thread{
	
	public void run(){
		for(int i=0;i<100;i++) {
			System.out.println(i+"-->"+Thread.currentThread().getName());
		}
		
	}
}
