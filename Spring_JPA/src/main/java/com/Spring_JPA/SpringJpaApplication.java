package com.Spring_JPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Spring_JPA.entity.UserJpa;
import com.Spring_JPA.repo.UserRepo;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJpaApplication.class, args);
		UserRepo ur=context.getBean(UserRepo.class);
		
		
//		UserJpa u=new UserJpa();
//		u.setName("Akash");
//		u.setCity("Akola");
//		u.setStatus("I am java programmer");
//		
//		UserJpa user=ur.save(u);
//		System.out.println(user);
	
/*  save	
	//   Create object of User
		UserJpa user1=new UserJpa();
		user1.setName("Radha");
		user1.setCity("Nagpur");
		user1.setStatus("Python developer");
		
		UserJpa user2=new UserJpa();
		user2.setName("Rana");
		user2.setCity("Nashik");
		user2.setStatus("node.js developer");
		
		List<UserJpa> list=new ArrayList<UserJpa>();
		list.add(user2);
		list.add(user1);
		
	// saving multiple Object	
		Iterable<UserJpa> result=ur.saveAll(list);
		result.forEach(user->{
			System.out.println(user);
			
		});
		
		
		
		System.out.println("Done........... ");
	
	*/

		/*
	//  Upadte the user id
		Optional<UserJpa> optional=ur.findById(3);
		UserJpa uj=optional.get();
		uj.setName("Krishna");
		
		UserJpa result1=ur.save(uj);
	
	*/
		
		
	/*	// how to get the data
		Iterable<UserJpa> itr=ur.findAll();
		itr.forEach(user->System.out.println(user));
		
		*/
		
	/*	 Delete the user element 
	 
	// ur.deleteById(3);
	// System.out.println("deleted");
	 
	 
  //  all user daleted
      Iterable<UserJpa> allusers=ur.findAll();
      allusers.forEach(user->System.out.println(user));
      
      ur.deleteAll(allusers);
	
	
	
	
	
	
	
	
	
	*/
/*
		// custome method	
	List<UserJpa> users2=ur.findByName("akash");
	users2.forEach(e->System.out.println(e));
	
	
	
	List<UserJpa> user3=ur.findByNameAndCity("krishna","nagpur");
	System.out.println("\n Data Getting after Creating custom Method \n");
	user3.forEach(e->System.out.println(e));
	
	
	*/
		
		
	List<UserJpa> allUser=ur.getAllUser();
	allUser.forEach(e->{
		System.out.println(e);
	});
	
	System.out.println("---------------------------------------------------------------");
	
	List<UserJpa> list=	ur.getUserByName("Akash");	
	list.forEach(e->System.out.println(e));
	
	System.out.println("--------------------------------------------");
	ur.getUsers().forEach(e->System.out.println(e));
	
	
	}
	
	
	

}
