package model;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private Map<String, Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void enrollCourse(Course course) {
        courses.put(course.getCode(), course);
    }

    public void assignGrade(String courseCode, double grade) {
        if (!courses.containsKey(courseCode)) {
            throw new RuntimeException("Course not found");
        }
        courses.get(courseCode).setGrade(grade);
    }

    public double calculateGPA() {
        double total = 0;
        int count = 0;

        for (Course c : courses.values()) {
            if (c.getGrade() != -1) {
                total += c.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public String getName() {
        return name;
    }
}

