package com.demo.Demo4.service;

import java.util.List;
import java.util.Optional;

import com.demo.Demo4.Entity.StudentEntity;

public interface ServiceIMPL {
	
	public List<StudentEntity> getAllStudent();
	
	public Optional<StudentEntity> studentById(int id);
	
	public StudentEntity addStudent(StudentEntity std);
	
	public StudentEntity updateStudent(StudentEntity std ,int id);
	
	public StudentEntity updatecity(StudentEntity std,int id);
	
	public StudentEntity updateId(String name, int newId);
	
	public void deleteStudent(int id);

}
