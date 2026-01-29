package app;

import service.StudentService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Enroll Course");
            System.out.println("3. Assign Grade");
            System.out.println("4. View GPA");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        service.addStudent(id, name);
                        break;

                    case 2:
                        System.out.print("Student ID: ");
                        id = sc.nextLine();
                        System.out.print("Course Code: ");
                        String code = sc.nextLine();
                        System.out.print("Course Name: ");
                        String cname = sc.nextLine();
                        service.enrollStudent(id, code, cname);
                        break;

                    case 3:
                        System.out.print("Student ID: ");
                        id = sc.nextLine();
                        System.out.print("Course Code: ");
                        code = sc.nextLine();
                        System.out.print("Grade: ");
                        double grade = sc.nextDouble();
                        service.assignGrade(id, code, grade);
                        break;

                    case 4:
                        System.out.print("Student ID: ");
                        id = sc.nextLine();
                        System.out.println("GPA: " + service.getGPA(id));
                        break;

                    case 5:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
