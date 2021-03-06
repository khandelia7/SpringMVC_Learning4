package com.telusko.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telusko.model.Alien;

@Component
public class AlienDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	// Call all rows from database
	@Transactional
	public List<Alien> getAliens(){
		Session session = sessionFactory.getCurrentSession();
		List<Alien> aliens = session.createQuery("from alien",Alien.class).list();
 		return aliens;
	}
	
	//Add row in the database
	@Transactional
	public void addAlien(Alien a) {
		Session session = sessionFactory.getCurrentSession();
		session.save(a);
	}
	
	// Call one row from the database
	@Transactional
	public Alien getAlien(int aid) {
		Session session = sessionFactory.getCurrentSession();
		Alien a = session.get(Alien.class, aid);
		return a;
	}
}
