
import java.util.Scanner;

public class Main{
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


        //task2.2

        System.out.println("Enter number one");
        int first1 = scanner.nextInt();
        System.out.println("Enter number two");
        int second2 = scanner.nextInt();
        if(first1%second2==0){
            System.out.println("Числа кратные");

        }
        else System.out.println("Числа не кратные");


        //task 3

        System.out.println("Enter number month");
        int month= scanner.nextInt();

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


        System.out.println("Enter day");
        int day= scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("404");

        }

// task4
        System.out.println("Enter number one");
        int oneNumber= scanner.nextInt();
        System.out.println("Enter number two");
        int twoNumber= scanner.nextInt();
        System.out.println("1-Sum");
        System.out.println("2-Division");
        System.out.println("3-Difference");
        System.out.println("4-Multiplication");
        int result = scanner.nextInt();


        switch (result){
            case  1:
                System.out.println("result: "+(oneNumber+twoNumber));
                break;
            case 2:
                System.out.println("result: "+(oneNumber/twoNumber));
                break;
            case 3:
                System.out.println("result: "+(oneNumber-twoNumber));
                break;
            case 4:
                System.out.println("result: "+(oneNumber*twoNumber));
                break;
            default:
                System.out.println("404");
        }

    }
}















