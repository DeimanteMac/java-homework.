package lt.vcd.homework2.task1;
//The first Summer Olympic Games were held in Athens in 1896.
// After that, they were held or scheduled to be held every four
// years: the second Games in 1900, the third in 1904, and so on.
// Games that did not take place are still assigned an edition number,
// and those years are still considered Olympic years.
//
//Given a year M, determine the edition number of the
// Olympic Games if it is an Olympic year. Otherwise, state
// that it is not an Olympic year. The program must prompt the user
// to enter a year and display whether it is an Olympic year. If it
// is, the program must also display the edition number.

import java.util.Scanner;
public class Main {
    public static void
    main ( String[] args){
 Scanner in = new Scanner(System.in);
 System.out.println( "Please enter a year: ");
 int year = in.nextInt();
        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = (year - 1896) / 4 + 1;
            System.out.println("Olympic year. Edition number: " + edition);
        } else {
            System.out.println("Not an Olympic year.");
        }
    }
}
