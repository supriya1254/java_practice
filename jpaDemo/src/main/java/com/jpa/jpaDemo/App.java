package com.jpa.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    { 
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    	EntityManager em =  emf.createEntityManager();
    	Student student = em.find(Student.class, 101);
    	System.out.println(student);
    }
}
