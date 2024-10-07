package Assignment;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Flowchart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate tgl = LocalDate.now();
        DayOfWeek hari =tgl.getDayOfWeek();
        String category;
        int numBooks;
        double discount = 0;
        
        System.out.println("Enter the books category (dictionary, novel, other): ");
        category = sc.nextLine().toLowerCase();
        System.out.println("Enter the number books bought: ");
        numBooks = sc.nextInt();

        if (hari == DayOfWeek.WEDNESDAY) {
            if (category.equals("dictionary") && numBooks > 0) {
                if (numBooks > 2) {
                    discount = 0.12;
                } else {
                    discount = 0.1;
                }
                System.out.println("Your discount is: " + discount);
            } else if (category.equals("novel") && numBooks > 0) {
                discount = 0.07;
                if (numBooks >3) {
                    discount += 0.02;
                } else {
                    discount += 0.01;
                }
                System.out.println("Your discount is: " + discount);
            } else if (category.equals("other") && numBooks > 3) {
                discount = 0.05;
                System.out.println("Your discount is: " + discount);
            } else {
                System.out.println("You don't get a discount or your category is invalid!");
            }
        } else {
            System.out.println("Today is not wednesday, no discount!");
        }
    }
}
