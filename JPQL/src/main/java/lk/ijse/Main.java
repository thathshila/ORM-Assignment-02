package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Course;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


//        Course course = new Course();
//        course.setId(1);
//        course.setName("English Course");
//        course.setLocation("Panadura");
//        course.setYear(2020);
//
//        Course course1 =  new Course();
//        course1.setId(2);
//        course1.setName("IT Course");
//        course1.setLocation("Panadura");
//        course1.setYear(2020);
//
//        List<Course> courseList = new ArrayList<>();
//        courseList.add(course);
//        courseList.add(course1);
//
//        Student student = new Student();
//        student.setId(1);
//        student.setName("Ama");
//        student.setAge(22);
//        student.setCourses(courseList);
//
//        course.setStudent(student);
//        course1.setStudent(student);
//
//        session.save(course1);
//        session.save(course);
//        session.save(student);

        //delete
//        String name = "IT Course";
//        Query query =  session.createQuery("delete from Course c where c.name =  : name");
//       query.setParameter("name", name);
//        System.out.println( query.executeUpdate() > 0 ? "deleted" : "oops");

        //update
//        String name = "kamal";
//        Query query = session.createQuery("update Student s set s.name = :name");
//        query.setParameter("name", name);
//        query.executeUpdate();
//        System.out.println( query.executeUpdate() > 0 ? "update" : "oops");

        //search
//        int id = 1;
//        Query query = session.createQuery("from Student where id = : id");
//        query.setParameter("id", id);
//        List<Student> result = query.list();
//        for (Student student : result) {
//            System.out.println(student);
//        }

        //join
//        Query query = session.createQuery("from Student s inner join Course c on s.id = c.id");
//        List<Object[]> list = query.list();
//        for (Object[] o : list) {
//            System.out.println(o[0]+"\t"+o[1]);
//        }
        transaction.commit();
        session.close();
    }
}