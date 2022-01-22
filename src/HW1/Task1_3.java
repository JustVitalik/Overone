package HW1;

import java.util.Scanner;

class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number month");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("month is Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("month is spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("month is summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("month is autumn");
                break;
            default:
                System.out.println("404");
        }
    }
}