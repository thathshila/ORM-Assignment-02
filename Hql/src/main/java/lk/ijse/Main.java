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

        //select *
//        Query query = session.createQuery("from Student ");
//       List<Student> studentList = query.list();
//
//        for (Student students  : studentList) {
//            System.out.println(students.getId() + " " + students.getName() + " " + students.getAge() + students.getCourses());
//       //System.out.println(students);
//        }

        //select specific column
//        Query query = session.createQuery("select name from Student");
//        List<String> nameList = query.list();
//        for (String name : nameList) {
//            System.out.println(name);
//        }

        //where
//        Query query = session.createQuery("select id,name from Student where id = 1");
//        List<Student> studentList = query.list();
//
//        for (Student students  : studentList) {
//            System.out.println(students);
//        }

        //update
//       int student_id = 3;
//       String student_name = "Jack";
//        int student_age = 21;
//        Query query = session.createQuery("update Student set student_name = :name , student_age = :age where student_id = :id");
//       query.setParameter("name", student_name);
//       query.setParameter("id", student_id);
//       query.setParameter("age", student_age);
//      int rowCount = query.executeUpdate();
//        System.out.println(rowCount > 0 ? "Student updated successfully" : "Student not updated");

        //delete
//        Query query = session.createQuery("delete from Course where id = 1");
//        int rowCount = query.executeUpdate();
//        System.out.println(rowCount > 0 ? "Course deleted" : "Course not deleted.");


        //inner join
//        Query query =  session.createQuery("from Student s inner join Course  c on s.id = c.id");
//        List<Object[]> result = query.list();
//
//        for (Object[] objects  : result) {
//            System.out.println(objects[0]);
//        }
        transaction.commit();
        session.close();
    }
}