package task4;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Studentdetails {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Studentdetails(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        validateAge(age);
        validateName(name);
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private void validateAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
    }

    private void validateName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name must not contain numbers or special symbols.");
        }
    }
}

public class SMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            Studentdetails student = new Studentdetails(rollNo, name, age, course);
            System.out.println("Student created successfully!");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}