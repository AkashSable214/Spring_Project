package com.demo.Demo4.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.Demo4.Entity.StudentEntity;


@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
	
	public List<StudentEntity> findByname(String name);
	
	@Transactional
	@Modifying
	 @Query("UPDATE StudentEntity s SET s.name = :name, s.Address = :address, s.city = :city WHERE s.id = :id")
    int updateStudentDetailsById(int id, String name, String address, String city);

	public List<StudentEntity> findByname();

}
