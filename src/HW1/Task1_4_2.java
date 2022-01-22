package HW1;

import java.util.Scanner;

class Task1_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one calculator2");
        int oneNumber1 = scanner.nextInt();
        System.out.println("Enter number two");
        int twoNumber2 = scanner.nextInt();
        System.out.println("'+'-Sum");
        System.out.println("'/'-Division");
        System.out.println("'-'-Difference");
        System.out.println("'*'-Multiplication");
        String result2 = scanner.next();
        if (twoNumber2 != 0) {
            switch (result2) {
                case "+":
                    System.out.println("result: " + (oneNumber1 + twoNumber2));
                    break;
                case "/":
                    System.out.println("result: " + (oneNumber1 / twoNumber2));
                    break;
                case "-":
                    System.out.println("result: " + (oneNumber1 - twoNumber2));
                    break;
                case "*":
                    System.out.println("result: " + (oneNumber1 * twoNumber2));
                    break;
                default:
                    System.out.println("404");
            }
//if you used English, then do not switch to russian, be consistent
        } else System.out.println("деление на 0 не допускаеться");
    }

}