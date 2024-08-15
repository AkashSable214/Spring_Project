package com.Spring_JPA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Spring_JPA.entity.UserJpa;

public interface UserRepo extends JpaRepository<UserJpa, Integer> {

//	By Default from CrudRepository or Jparepository
//		findAllById
//		findById
//		findAll
	
	
	
	/*
	 custom method or derived method 
	 	data by name
	 	data by name and password
	 	data by name or password
	 	data name starting with prefix
	 	data by name like "keyword"
	
	
	*/
	
/*	find is introducer
	ByName is a criteria
*/
	//    custom method
	public List<UserJpa> findByName(String name);
	
	public List<UserJpa> findByNameAndCity(String name,String city);
	
// pre-Define pattern Expression	
//	public List<UserJpa> findByNameStartingWith(String prefix);
//	
//	public List<UserJpa> findByNameEndingWith(String suffix);
//	
//	public List<UserJpa> FindByNameContaining(String words);
//	
//	public List<UserJpa> findByNameLike(String likepattern);
//	
//	public List<UserJpa> findByAgeLessThan(int age);
	
	
	
//  custom Query
	@Query("select u FROM UserJpa u")
	public List<UserJpa> getAllUser();
	
	// parameterise Query
	@Query("select u From UserJpa u WHERE u.name =:n")
	public List<UserJpa> getUserByName(@Param("n") String name);
	
	
	@Query(value="select * from user_jpa",nativeQuery=true)
	public List<UserJpa> getUsers();
	
}
