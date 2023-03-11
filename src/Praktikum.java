import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Praktikum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        boolean isLeapYear = isLeapYear(year);

        int days = 255;
        LocalDate date = LocalDate.of(year,1,1);
        LocalDate dateDeveloper = date.plusDays(days);
        String result = dateDeveloper.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        if (isLeapYear(year)) {
            System.out.println("День программиста в високосный год: "+result);
        }
        else{
            System.out.println("День программиста в НЕ високосный год: "+result);
        }
    }

    public static boolean isLeapYear(int year) {
        if (0 == year%400)
            return true;
        else if (0 == year%100)
            return false;

        return 0 == year%4;
    }
}