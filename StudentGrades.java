package task4;

import java.util.HashMap;
import java.util.Scanner;

class StudentGrades {
    private HashMap<String, Student> studentMap;

    public StudentGrades() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        Student student = new Student(name, grade);
        studentMap.put(name, student);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    public void removeStudent(String name) {
        if (studentMap.remove(name) != null) {
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("No student found with the name " + name);
        }
    }

    public void displayGrade(String name) {
        Student student = studentMap.get(name);
        if (student != null) {
            System.out.println(student.getName() + "'s grade is: " + student.getGrade());
        } else {
            System.out.println("Student " + name + " does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades grades = new StudentGrades();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display student grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    grades.addStudent(nameToAdd, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    grades.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    grades.displayGrade(nameToDisplay);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose between 1-4.");
            }
        }
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}