import java.util.Scanner;
public class Selection2Exp120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        int year;

        System.out.println();
        System.out.print("Input year = ");
        year = input20.nextInt();

        if (year%4 == 0) {
            if (year%100 != 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}