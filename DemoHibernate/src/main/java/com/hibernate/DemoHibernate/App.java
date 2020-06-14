package com.hibernate.DemoHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)
	{
		    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		    	EntityManager em = emf.createEntityManager();
		    	User user = em.find(User.class, 4);
	}
		
		
		/*
		 * 
		 * Configuration con = new
		 * Configuration().configure().addAnnotatedClass(StudentHQLTest.class);
		 * ServiceRegistry reg = new
		 * ServiceRegistryBuilder().applySettings(con.getProperties()).
		 * buildServiceRegistry(); SessionFactory sf = con.buildSessionFactory(reg);
		 * Session session = sf.openSession(); session.beginTransaction();
		 * 
		 * User user = new User(); user.setUid(143); user.setUname("Arnika");
		 * 
		 * 
		 * 
		 * 
		 * Query q = session.createQuery("from StudentHQLTest where marks=7");
		 * 
		 * StudentHQLTest sTest = (StudentHQLTest)q.uniqueResult();
		 * 
		 * for(StudentHQLTest sList :sTests ) { System.out.println("student list : " +
		 * sTest); //}
		 * 
		 * 
		 * insert the value into StudentHQLTest table Random rm = new Random();
		 * 
		 * for(int i =1;i<=10;i++) { StudentHQLTest test = new StudentHQLTest();
		 * test.setId(i); test.setName("name" + i); test.setMarks(rm.nextInt(100));
		 * session.save(test); }
		 * 
		 * 
		 * session.getTransaction().commit(); session.close();
		 * 
		 * 
		 * User user = null;
		 * 
		 * Configuration con = new
		 * Configuration().configure().addAnnotatedClass(User.class); ServiceRegistry
		 * reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).
		 * buildServiceRegistry(); SessionFactory sf = con.buildSessionFactory(reg);
		 * Session session = sf.openSession(); session.beginTransaction();
		 * session.getTransaction().commit(); session.close();
		 * 
		 * 
		 * 
		 * Session session1 = sf.openSession(); Transaction txn =
		 * session1.beginTransaction(); //fetching the record by get method. user =
		 * (User) session1.get(User.class, 101);
		 * 
		 * //fetching the record by query. Query q1 =
		 * session1.createQuery("from User where uid=101"); q1.setCacheable(true); user
		 * = (User)q1.uniqueResult(); System.out.println(" session1 : " + user);
		 * session1.getTransaction().commit(); session1.close();
		 * 
		 * 
		 * 
		 * Session session2 = sf.openSession(); session2.beginTransaction(); // fetching
		 * the record by get method. user = (User) session2.get(User.class, 101);
		 * 
		 * // fetching the record by query. Query q2 =
		 * session2.createQuery("from User where uid=101"); q2.setCacheable(true); user
		 * = (User) q2.uniqueResult(); System.out.println(" session2 : " + user);
		 * session2.getTransaction().commit(); session2.close();
		 * 
		 * 
		 * }
		 */
}
