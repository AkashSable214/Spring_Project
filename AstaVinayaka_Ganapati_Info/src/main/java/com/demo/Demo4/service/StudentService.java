package com.demo.Demo4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.Demo4.Entity.StudentEntity;
import com.demo.Demo4.Repo.StudentRepo;


@Service
public class StudentService implements ServiceIMPL {
	@Autowired
	StudentRepo sr;

	
	public List<StudentEntity> getAllStudent() {
		List<StudentEntity> list=sr.findAll();
		return list;
		
		
	}

	
	public Optional<StudentEntity> studentById( int id) {
		Optional<StudentEntity> se= sr.findById(id);
		return se;
		
	}

	
	public StudentEntity addStudent(StudentEntity std ) {
		StudentEntity st= sr.save(std);
		return st;
		
	}

	
	public StudentEntity updateStudent(StudentEntity std, int id) {
		StudentEntity se= sr.findById(id).get();
		se.setName(std.getName());
		se.setAddress(std.getAddress());
		
		return sr.save(se);
		
		
	}
	

	// delete student
	public void deleteStudent(int id) {
		sr.deleteById(id);
		
		
	}


	
	public StudentEntity updatecity(StudentEntity std, int id) {
		StudentEntity se=sr.findById(id).get();
		se.setCity(std.getCity());
		
		return sr.save(se);
		
	}


	// to update id using name
	
	@Transactional
	public StudentEntity updateId(String name, int newId) {
	    Optional<StudentEntity> optionalStudent = sr.findByname(name).stream().findFirst();
	    if (optionalStudent.isPresent()) {
	        StudentEntity student = optionalStudent.get();
	        student.setId(newId); // Update the ID with the new value
	        
	        return sr.save(student); // Save the updated entity
	    } else {
	        return null; // Return null if no student with the given name is found
	    }
	
//	@Transactional
//	public StudentEntity updateId( String name, int newId) {
//		
//		Optional<StudentEntity> list=sr.findByname(name).stream().findFirst();
//		
//		if(list.isPresent()) {
//			StudentEntity std=list.get();
//			std.setId(newId);
//			
//			return sr.save(std);
//		}else {
//			return null;
//		}
		 		
//		StudentEntity std=sr.findByname(name).get(0);
//		std.setId(newId);
//		return sr.save(std);
		
	}
	
	

}
