package Assignment;
import java.util.Scanner;
public class Flowchart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 28, num2 =54, num3 = 15, max = 0;

        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("Max number is: " + max);
    }
}
