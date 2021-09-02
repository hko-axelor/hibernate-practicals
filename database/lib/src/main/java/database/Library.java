/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Library {
  public static void main(String[] args) {
	  Student st = new Student();
	  st.setSid(1);
	  st.setSname("Hemang");
	  st.setColor("Black");
	  
	  Student st1 = new Student();
	  st1.setSid(2);
	  st1.setSname("Jaydeep");
	  st1.setColor("Blue");
	  
	  Student st2 = new Student();
	  st2.setSid(3);
	  st2.setSname("Nandit");
	  st2.setColor("White");
	  
	  Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
	  SessionFactory sf = con.buildSessionFactory();
	  Session session = sf.openSession();
	  session.beginTransaction();
	  session.save(st);
	  session.save(st1);
	  session.save(st2);
	  System.out.println(st);
	  System.out.println(st1);
	  System.out.println(st2);
	  session.getTransaction().commit();
	  session.close();
	  

	 
// To fetch the data
	  
//	  Student st = new Student();

//	  Student st1 = new Student();
	  
//	  Student st2 = new Student();
 
//	  Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
//	  SessionFactory sf = con.buildSessionFactory();
//	  Session session = sf.openSession();
//	  session.beginTransaction();
//	  st = (Student) session.get(Student.class, 1);
//	  st1 = (Student) session.get(Student.class, 2);
//	  st2 = (Student) session.get(Student.class, 3);
//	  System.out.println(st);
//	  System.out.println(st1);
//	  System.out.println(st2);
//	  session.getTransaction().commit();
//	  session.close();
	  
	  
    }
}
