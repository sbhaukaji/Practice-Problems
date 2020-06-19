// Calculate the annual salary of an employee

import java.util.Scanner;

public class Main {

    public static double calculateEmployeesSalary(double hoursPerWeek, double payPerHour, double vacationDays){

        // If an user enters negative value return -1
        if (hoursPerWeek < 0){
            return -1;
        }

        if (payPerHour < 0){
            return -1;
        }

        int weeksInYear = 52;
        int vacationHours = 8; // Consider one vacationDays is equal to 8 hours
        double unPaidVacationHours = vacationDays * vacationHours;
        double unPaidAmount = unPaidVacationHours * payPerHour;
        double payPerWeek = payPerHour * hoursPerWeek;
        double result = (payPerWeek * weeksInYear) - unPaidAmount ;
        return result;
    }

    public static void main(String[] args) {

        System.out.println("This program will calculate the annual income of an employee");
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursPerWeek = scanner.nextDouble();

        System.out.println("How much do you make an hour?");
        double payPerHour = scanner.nextDouble();

        System.out.println("How many vacation days did you use?");
        double vacationDays = scanner.nextDouble();

        double annualSalary = calculateEmployeesSalary(hoursPerWeek, payPerHour, vacationDays);
        System.out.println("You make $" + annualSalary + " a year");

    }
}