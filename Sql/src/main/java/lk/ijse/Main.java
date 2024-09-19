package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Course;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
//add data
        Course course = new Course();
        course.setId(1);
        course.setName("English Course");
        course.setLocation("Panadura");
        course.setYear(2020);

        Course course1 =  new Course();
        course1.setId(2);
        course1.setName("IT Course");
        course1.setLocation("Panadura");
        course1.setYear(2020);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course);
        courseList.add(course1);

        Student student = new Student();
        student.setId(1);
        student.setName("Ama");
        student.setAge(22);
        student.setCourses(courseList);

        course.setStudent(student);
        course1.setStudent(student);

        session.save(course1);
        session.save(course);
        session.save(student);

    //insert
//        NativeQuery query =  session.createNativeQuery("insert into student(id, name, age) values(?1, ?2, ?3)");
//        query.setParameter(1, 1);
//        query.setParameter(2, "ama");
//        query.setParameter(3, 22);
//        query.executeUpdate();

        ////////////////////////////////////////////////////////

    //select *

//        NativeQuery query =  session.createNativeQuery("select * from Course");
//        query.addEntity(Course.class);
//
//        List<Course> courses = query.list();
//
//        for (Course cours  : courses) {
//            System.out.println(cours.getId());
//        }



//         NativeQuery query =  session.createNativeQuery("select * from Student");
//        query.addEntity(Student.class);
//
//        List<Student> studentList = query.list();
//
//        for (Student students  : studentList) {
//            System.out.println(students.getId());
//        }

        ////////////////////////////////////////////////////////

    //delete
//        NativeQuery query =  session.createNativeQuery("delete * from Student");
//        query.addEntity(Student.class);

//        NativeQuery query =  session.createNativeQuery("delete * from Student where id = ?1");
//        query.setParameter(1, 1);
//        query.executeUpdate();
        ////////////////////////////////////////////////////////

    //update
//        NativeQuery query =  session.createNativeQuery("update Student set name= ?1 where id=1");
//        query.setParameter(1, "pawan");
//        query.executeUpdate();
        ////////////////////////////////////////////////////////

    //search by name
//        NativeQuery query =  session.createNativeQuery("select * from Student where name = ?1",Student.class);
//       query.setParameter(1, "pawan");
//      List<Student> students = query.list();
//      for(Student student1 : students){
//          System.out.println(student1.getId()+" "+student1.getName()+" "+student1.getAge()+" "+student1.getCourses());
//      }
            ////////////////////////////////////////////////////////
    //join query
//        NativeQuery query =  session.createNativeQuery("select * from Student s inner join Course c on s.id = c.id");
//        List<Object>resultList = query.getResultList();
//        for (Object object : resultList) {
//            System.out.println(object);
//        }
        transaction.commit();
        session.close();
    }
}