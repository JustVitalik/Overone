package HW4;

import java.util.Scanner;

/**
 * вывести числа которые являются положительными и кратными числу, которое ввел пользователь. Вывести количество совпадений
 *
 *
 */

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas={1,2,3,-4,5,-6,10,15};
        minDif(mas,scanner);
    }
    public static void minDif(int [] mas,Scanner scanner ){
        System.out.println("Enter your number");
        int values = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]>0 && mas[i]%values==0 ){
                System.out.print(mas[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество совпадений "+count);

    }
}
