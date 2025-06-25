package task4;

class Voter {
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Removed @Override annotation
    public String toString() {
        return "Voter ID: " + voterId + ", Name: " + name + ", Age: " + age;
    }
}

public class VoterAge {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter Voter ID: ");
        String voterId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        try {
            Voter voter = new Voter(voterId, name, age);
            System.out.println(voter);  // Calls toString()
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}