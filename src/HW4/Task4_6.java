package HW4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Удалить из массива определенное число
 *
 */

public class Task4_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int numb=scanner.nextInt();
        int[] mas = {1, 2, 3, 4, 5, 6};
       dell(mas, numb);

    }
    public static void dell (int[] mas,int numb ){
        int[] newArray = null;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == numb) {
                newArray = new int[mas.length - 1];
                for (int j = 0; j < i; j++) {
                    newArray[j] = mas[j];
                }
                for (int j = i; j < mas.length - 1; j++) {
                    newArray[j] = mas[j + 1];
                }
                break;
            }

            }System.out.println(Arrays.toString(newArray));

            }
            }












