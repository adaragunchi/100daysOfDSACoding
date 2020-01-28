package com.ds.multithreading;

public class Sequence {
private int value=0;

public synchronized int getNext() {
	return value++;
}
}
