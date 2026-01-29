package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private Map<String, Student> students = new HashMap<>();

    public void addStudent(String id, String name) {
        if (students.containsKey(id)) {
            throw new RuntimeException("Student already exists");
        }
        students.put(id, new Student(id, name));
    }

    public void enrollStudent(String id, String code, String courseName) {
        Student s = getStudent(id);
        s.enrollCourse(new Course(code, courseName));
    }

    public void assignGrade(String id, String code, double grade) {
        Student s = getStudent(id);
        s.assignGrade(code, grade);
    }

    public double getGPA(String id) {
        Student s = getStudent(id);
        return s.calculateGPA();
    }

    private Student getStudent(String id) {
        if (!students.containsKey(id)) {
            throw new RuntimeException("Student not found");
        }
        return students.get(id);
    }
}

