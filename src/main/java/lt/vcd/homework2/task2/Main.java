package lt.vcd.homework2.task2;
//A digital clock displays the time in hours, minutes,
// and seconds (input values h, m, s). What time will the
// clock display one second later? Output h, m, and s.
// All three values (h, m, s) must be entered using the keyboard.

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);

        System.out.println ("Enter hours: ");
        int h = in.nextInt();

        System.out.println ("Enter minutes: ");
        int m = in.nextInt();

        System.out.println ("Enter seconds: ");
        int s = in.nextInt();

        s = s + 1;

        if (s == 60) {
            s = 0;
            m = m + 1;
        }

        if (m == 60) {
            m = 0;
            h = h + 1;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.println(h + ":" + m + ":" + s);
    }
}