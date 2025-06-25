package task4;

import java.util.Scanner;


public class WeekdayFinder {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter the day position (0-6): ");
        int day = scr.nextInt();
        
        try {
            System.out.println("The day is: " + weekdays[day]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a valid day position between 0 and 6.");
        } 
    }
}