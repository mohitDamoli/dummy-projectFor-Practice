package com.mohii.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		UserDetails userDetails = new UserDetails();
		userDetails.setName("mohit");
		// userDetails.setBirthDate(new Date());

		UserDetails userDetails1 = new UserDetails();
		userDetails1.setName("amoli");
		// userDetails.setBirthDate(new Date());

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.save(userDetails1);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
