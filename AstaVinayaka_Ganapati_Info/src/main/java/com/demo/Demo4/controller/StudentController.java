package com.demo.Demo4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Demo4.Entity.StudentEntity;
import com.demo.Demo4.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@GetMapping("/Student")
	public List<StudentEntity> getAllStudent() {
		return ss.getAllStudent();

	}

	@GetMapping("/student/{id}")
	public Optional<StudentEntity> studentById(@PathVariable("id") int id) {
		return ss.studentById(id);
	}
	
	
// add new data
	@PostMapping("/student")
	public StudentEntity addStudent(@RequestBody StudentEntity std) {
		return ss.addStudent(std);
	}
// update existing data
	@PutMapping("/student/{id}")
	public StudentEntity existingStudent(@RequestBody StudentEntity std, @PathVariable int id) {
		return ss.updateStudent(std, id);
	}
// delete the data using id
	@DeleteMapping("student/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		ss.deleteStudent(id);

	}

	// to update city name using Id
	@PutMapping("student/{id}/city")
	public StudentEntity updatecity(@RequestBody StudentEntity std, @PathVariable("id") int id) {
		return ss.updatecity(std, id);
	}

	// to update id using name
	@PutMapping("student/updateid")
	public StudentEntity updateId(@RequestParam String name, @RequestParam int newId) {

		return ss.updateId(name, newId);

	}

}
