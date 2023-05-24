package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component; 

@Component
@RestController
 class HomeController 
{   
	 
private final Studentbucket bucket;
public HomeController() {
	bucket=new Studentbucket(1);
	
}
@SuppressWarnings("unchecked")
@GetMapping("/getAllusers")
public ResponseEntity<List<Student>> getAllstudent(){
	if(bucket.accessApplication(1)) {
		System.out.println("API Working Successfully");
		return ResponseEntity.ok(Student.ll);
	}
    return(ResponseEntity<List<Student>>)ResponseEntity.status( HttpStatus.TOO_MANY_REQUESTS);
}
	
//@PostMapping("/Addstudent")
//		public ResponseEntity<String> ptest(@RequestBody Student student){
//	
//			if(bucket.accessApplication(1)) {
//				Studentlist.add(student);
//				System.out.println("API Working Successfully");
//				return ResponseEntity.status(HttpStatus.CREATED).body("User added sucessfully");
//			}
//			System.out.println("Limit ExceedTo many hits");
//			return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("limit Exceed"); 
//			 	
//		//public static List<Student> list = new ArrayList<>();
//		
//}
}