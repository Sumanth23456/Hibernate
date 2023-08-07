package com.abc.ArogyaHospital.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.ArogyaHospital.model.Patients;

public class DAOImpl implements PatientsDAO  {
  private SessionFactory sf=null;
 public DAOImpl(){
	   sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Patients.class).buildSessionFactory();
  }
@Override
public void addPatient(Patients p) {
	try (Session session = sf.openSession()) {
        Transaction txn = session.beginTransaction();
        session.save(p);
        txn.commit();
    }
	
}
@Override
public void getPatientById(int i) {
	try(Session session=sf.openSession()){
		Transaction txn=session.beginTransaction();
		Patients p=session.get(Patients.class, i);
		txn.commit();
		System.out.println(p);
	}
	
	
}
@Override
public void deletePatientById(int i) {
	try(Session session=sf.openSession()){
		Transaction txn=session.beginTransaction();
		Patients p=session.get(Patients.class, i);
		session.delete(p);
		txn.commit();
		System.out.println("Deleted Successfully");
		
	}
	
}
@Override
public List<Patients> viewAll() {
	List<Patients> pl=new ArrayList<Patients>();
	try(Session session=sf.openSession()){
		
		return session.createQuery("from Patients",Patients.class).getResultList();
	}
	 
 
	
			
}
@Override
public List<Patients> where() {
	try(Session session=sf.openSession()){
	return session.createQuery("from Patients where pname='pavan'",Patients.class).getResultList();	
	}
	
}
@Override
public boolean UpdatePatient() {
	boolean b=false;
	try(Session session=sf.openSession()){
		Transaction tx=session.beginTransaction();
		
		int i=session.createQuery("update Patients set city='wgl'"+" where pid='1' ").executeUpdate();
		tx.commit();
		if(i>0) {
			b=true;
			
	}
		
		
		}
	return b;	
	
}



}


		

