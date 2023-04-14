package com.Day3;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details
        System.out.print("Enter Student's Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Enter Student's Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student's address: ");
        String studentAddress = scanner.nextLine();

        String nitInput;
        do {
            System.out.print("Whether the student is from NIT(Yes/No): ");
            nitInput = scanner.nextLine();
        } while (!nitInput.equalsIgnoreCase("yes") && !nitInput.equalsIgnoreCase("no"));

        String collegeName;
        if (nitInput.equalsIgnoreCase("yes")) {
            // Create NIT student object
            Student student = new Student(studentId, studentName, studentAddress);
            System.out.println("Student id: " + student.getStudentId());
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Address: " + student.getStudentAddress());
            System.out.println("College name: " + student.getCollegeName());
        } else {
            // Get college name and create student object
            System.out.print("Enter the college name: ");
            collegeName = scanner.nextLine();
            Student student = new Student(studentId, studentName, studentAddress, collegeName);
            System.out.println("Student id: " + student.getStudentId());
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Address: " + student.getStudentAddress());
            System.out.println("College name: " + student.getCollegeName());
        }

        scanner.close();
    }
}

