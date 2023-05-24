package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Studentbucket {
	Map<Integer,LeakyBucket> bucket;
	public Studentbucket(int id) {
		bucket = new HashMap<>();
		bucket.put(id,new LeakyBucket(5));
	}
	public boolean accessApplication(int id) {
		if(bucket.get(id).grantAccess()) {
			System.out.println(Thread.currentThread().getName()+"able to access the application");
			return true;
			
		}
		
			System.out.println(Thread.currentThread().getName()+"Too Many Request,please try after some time");
				
		return false;
	}

}
