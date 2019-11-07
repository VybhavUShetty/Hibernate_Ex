package com.lti.StudentMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration configuration=new Configuration().configure();
       StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
       SessionFactory fac=configuration.buildSessionFactory(builder.build());
       Session session=fac.openSession();
       Student student=new Student();
       student.setName("Vybhav");
       student.setDept("Mech");
       student.setName("Tiru");
       student.setDept("Electrical");
       student.setName("Ashika");
       student.setDept("CS");
       student.setName("Harshitha");
       student.setDept("Cs");
       session.beginTransaction();
     
  
       session.save(student);
       
       session.getTransaction().commit();
    }
}
