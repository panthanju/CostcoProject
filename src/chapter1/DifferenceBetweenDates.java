package chapter1;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenDates {

    public static void main(String[] args) {

        LocalDate day1 = LocalDate.of(2000, Month.SEPTEMBER, 15);
        LocalDate day2 = LocalDate.of(2002, Month.JULY, 21);

        System.out.println("Difference between the dates is: " + day1.until(day2, ChronoUnit.DAYS));
    }
}
