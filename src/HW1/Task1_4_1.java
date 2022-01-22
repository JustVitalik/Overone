package HW1;

import java.util.Scanner;

public class Task1_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one");
        int oneNumber = scanner.nextInt();
        System.out.println("Enter number two");
        int twoNumber = scanner.nextInt();
        System.out.println("1-Sum");
        System.out.println("2-Division");
        System.out.println("3-Difference");
        System.out.println("4-Multiplication");
        int result = scanner.nextInt();

        if (twoNumber != 0) {
            switch (result) {
                case 1:
                    System.out.println("result: " + (oneNumber + twoNumber));
                    break;
                case 2:
                    System.out.println("result: " + (oneNumber / twoNumber));
                    break;
                case 3:
                    System.out.println("result: " + (oneNumber - twoNumber));
                    break;
                case 4:
                    System.out.println("result: " + (oneNumber * twoNumber));
                    break;
                default:
                    System.out.println("404");
            }

        } else System.out.println("деление на 0 не допускаеться");
    }
}
//double would be better option