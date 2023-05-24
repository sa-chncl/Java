package com.example.demo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LeakyBucket {
	BlockingQueue<Integer> queue;
	// linked blocking queue implements the blocking queue interface
	public LeakyBucket(int capacity) {
		this.queue = new LinkedBlockingQueue<>(capacity);
		
	}
	
	public boolean grantAccess() {
		if(queue.remainingCapacity()>0) {
			queue.add(1);
			return true;
		}
		return false;
	}

}
