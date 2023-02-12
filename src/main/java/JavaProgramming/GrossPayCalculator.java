package JavaProgramming;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display Results
        System.out.println("The employee's gross pay is " + grossPay);
    }
}
