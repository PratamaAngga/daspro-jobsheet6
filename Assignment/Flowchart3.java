package Assignment;
import java.util.Scanner;
public class Flowchart3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand, category, sizeInterval;
        double price = 0;

        System.out.print("Enter the brand of shoes you purchased: ");
        brand = sc.nextLine().toLowerCase();
        System.out.print("Enter the category of shoes you purchased: ");
        category = sc.nextLine().toLowerCase();
        System.out.print("Enter the size interval of shoes you purchased(36-40, 36-41, 40-44, 41-44): ");
        sizeInterval = sc.nextLine().toLowerCase();

        if (brand.equals("converse")) {
            if (category.equals("slip on")) {
                if (sizeInterval.equals("36-40")) {
                    price = 800000;
                } else {
                    System.out.println("Invalid size interval!");
                }
            } else if (category.equals("high top")) {
                if (sizeInterval.equals("40-44")) {
                    price = 1200000;
                } else {
                    System.out.println("Invalid size interval!");
                }
            } else {
                System.out.println("Invalid category!");
            }
        } else if (brand.equals("sketcher")) {
            if (category.equals("woman")) {
                if (sizeInterval.equals("36-41")) {
                    price = 1000000;
                } else {
                    System.out.println("Invalid size interval!");
                }
            } else if (category.equals("man")) {
                if (sizeInterval.equals("41-44")) {
                    price = 1800000;
                } else {
                    System.out.println("Invalid size interval!");
                }
            } else {
                System.out.println("Invalid category!");
            }
        } else if (brand.equals("nike")) {
            if (category.equals("kids")) {
                if (sizeInterval.equals("36-40")) {
                    price = 750000;
                } else {
                    System.out.println("Invalid size interval!");
                }
            } else if (category.equals("adult")) {
                if (sizeInterval.equals("40-44")) {
                    price = 1500000;
                } else {
                    System.out.println("Invalid size interval!");
                }
            } else {
                System.out.println("Invalid category!");
            }
        } else {
            System.out.println("Invalid brand!");
        }
        System.out.println("The price you have to pay is: " + price);
    }
}
