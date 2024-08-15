package com.registration.Employee.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.registration.Employee.entity.Employee;
 

@Repository
public class RegistrationDao {
	
	@Autowired
	SessionFactory sf;
	
	//insert data
	public String insertdata(Employee emp) {
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		se.save(emp);
		tr.commit();
		se.close();
		
		return "Data inserted";
	}
	
	//update data
	
	public Employee updatedata(Employee emp) {
		Session se=sf.openSession();
		Query q=se.createQuery("update Employee set name="+emp.getName()+",email="+emp.getEmail()+",Address="+emp.getAddress()+" where id="+emp.getId()+"");
		Transaction tr=se.beginTransaction();
		q.executeUpdate();
		tr.commit();
		se.close();
		return emp;
	}
	
	//delete
//	public void deletedata(int Id) {
//		Session se=sf.openSession();
//		Query q=se.createQuery("delete from Employee where id="+Id+"");
//		Transaction tr=se.beginTransaction();
//		q.executeUpdate();
//		tr.commit();
//		se.close();
//	}
	
	
	

}
