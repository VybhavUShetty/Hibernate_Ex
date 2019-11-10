package com.lti.HibernateCollegePro.CollegeMapping;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("persistence");
        EntityManager em=emf.createEntityManager();
        
        System.out.println("Starting Transaction");
        em.getTransaction().begin();
        
        Department dept=new Department();
        dept.setDeptname("Biology");
        
        Department dept1=new Department();
        dept1.setDeptname("Hindi");
        
        Department dept3=new Department();
        dept3.setDeptname("Arts");
        
        System.out.println("Saving to database");
        
        em.persist(dept);
        em.persist(dept1);
        em.persist(dept3);
        
        Student student=new Student();
        student.setStudentname("Vivek");
        student.setDepartment(dept);
        
        Student student1=new Student();
        student1.setStudentname("Karthik");
        student1.setDepartment(dept1);
        
        Student student2=new Student();
        student2.setStudentname("Simran");
        student2.setDepartment(dept);
        
        Student student4=new Student();
        student4.setStudentname("Hardik");
        student4.setDepartment(dept1);
        
        Student student5=new Student();
        student5.setStudentname("Kisan");
        student5.setDepartment(dept3);
        
        Student student6=new Student();
        student6.setStudentname("Vivek");
        student6.setDepartment(dept3);
        
        em.persist(student1);
        em.persist(student2);
       
        em.persist(student4);
        em.persist(student5);
        em.persist(student6);
        
        
        
        
        System.out.println("Saving to database");
        
     
        
        
        
        
      Instructor instructor=new Instructor();
        instructor.setInstname("Raghav");
        instructor.setDepartment(dept);;
        
        Instructor instructor1=new Instructor();
        instructor1.setInstname("Manoj");
        instructor1.setDepartment(dept1);
      
        Instructor instructor2=new Instructor();
        instructor2.setInstname("Kavya");
        instructor2.setDepartment(dept3);
        
        Instructor instructor3=new Instructor();
        instructor3.setInstname("Harish");
        instructor3.setDepartment(dept1);
        
        Instructor instructor4=new Instructor();
        instructor4.setInstname("Megha");
        instructor4.setDepartment(dept1);
        
        Instructor instructor5=new Instructor();
        instructor5.setInstname("Karthik");
        instructor5.setDepartment(dept);
        
        Instructor instructor6=new Instructor();
        instructor6.setInstname("Deeraj");
        instructor6.setDepartment(dept3);
        
        System.out.println("Saving to database");
        em.persist(instructor);
        em.persist(instructor1);
        em.persist(instructor2);
        em.persist(instructor3);
        em.persist(instructor4);
        em.persist(instructor5);
        em.persist(instructor6);
        
        Course course1=new Course();
        course1.setCoursename("Algebra");
        course1.setDepartment(dept1); 
        
        Course course2=new Course();
        course2.setCoursename("Language");
        course2.setDepartment(dept); 
        
        Course course3=new Course();
        course3.setCoursename("Trignometry");
        course3.setDepartment(dept3); 
        
        Course course4=new Course();
        course4.setCoursename("Science");
        course4.setDepartment(dept1); 
        
        em.persist(course1);
        em.persist(course2);
        em.persist(course3);
        em.persist(course4);
        
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
        
        
        
        
        
        
        
    }
}
