package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PostController {
 
	private final Studentbucket bucket;
	public PostController() {
		bucket=new Studentbucket(1);
		
	}
	
	
	@PostMapping("/Addstudent")
	public ResponseEntity<String> ptest(@RequestBody Student student){

		if(bucket.accessApplication(1)) {
			Student.ll.add(student);
			System.out.println("API Working Successfully");
			return ResponseEntity.status(HttpStatus.CREATED).body("User added sucessfully");
		}
		System.out.println("Limit ExceedTo many hits");
		return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("limit Exceed"); 
		 	
	}
}
