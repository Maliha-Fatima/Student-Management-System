package model;

public class Course {
    private String code;
    private String name;
    private double grade;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.grade = -1;
    }

    public String getCode() {
        return code;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

