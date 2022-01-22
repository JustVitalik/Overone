package HW1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second = scanner.nextInt();
        System.out.println("Enter third number");
        int third = scanner.nextInt();

        if (first > second) {
            if (first > third) {
                System.out.println(first);
            }

        }
        if (second > third) {
            if (second > first) {
                System.out.println(second);
            }

        }
        if (third > first) {
            if (third > second) {
                System.out.println(third);
            }
        }

        //Вар2
        System.out.println("Enter first number");
        int first1 = scanner.nextInt();
        System.out.println("Enter second number");
        int second2 = scanner.nextInt();
        System.out.println("Enter third number");
        int third3 = scanner.nextInt();

        if (first1 > second2 && first1 > third3) {
            System.out.println(first1);
        }
        if (second2 > third3 && second2 > first1) {

            System.out.println(second2);
        }
        if (third3 > first1 && third3 > second2) {

            System.out.println(third3);

        }
    }
}