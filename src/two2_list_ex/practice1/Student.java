package two2_list_ex.practice1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

//    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("1", 11, "1111"));
//        studentList.add(new Student("2", 22, "2222"));
//
//
//        for (Student student : studentList) {
//            System.out.println("Name: " + student.getName());
//            System.out.println("Age: " + student.getAge());
//            System.out.println("Student ID: " + student.getStudentId());
//            System.out.println();
//        }
//    }
}
