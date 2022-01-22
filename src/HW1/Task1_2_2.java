package HW1;

import java.util.Scanner;

public class Task1_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one");
        int first1 = scanner.nextInt();
        System.out.println("Enter number two");
        int second2 = scanner.nextInt();
        if (first1 % second2 == 0) {
            System.out.println("Numbers are Multiples");

        } else System.out.println("Numbers are not multiples");
    }
}
