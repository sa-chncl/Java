package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RateLimiter111Application {

	public static void main(String[] args) {
		SpringApplication.run(RateLimiter111Application.class, args);
		
		//Studentbucket studentBucket= new Studentbucket(1);
//		ExecutorService executors = Executors.newFixedThreadPool(5);
//		for (int i=0;i<=6;i++) {
//			executors.execute(()-> studentBucket.accessApplication(1));
//			
//		}
//		executors.shutdown();
				}

}
