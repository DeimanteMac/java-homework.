package lt.vcd.homework2.task3;
//Leap years have 366 days,
// while non-leap years have 365.
// Years that are not century years are leap years if they are
// divisible by 4. Century years are leap years if they are
// divisible by 400. For example, 1600 is a leap year,
// while 1700 is a non-leap year.
//
//Write a program that determines whether the
// entered year is a leap year or a non-leap year.
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Please enter a year:");
            int year = in.nextInt();

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Leap year.");
            } else {
                System.out.println("Non-leap year.");
            }
    }
}
