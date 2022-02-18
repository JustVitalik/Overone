package HW4;

import java.util.Scanner;

/**
 *
 * Заполнить массив с консоли (предусмотреть исключительные ситуации) Если пользователь во время заполнения массива вводит отрицательно число,
 * то инициализацию массива прекратить, вывести сообщение и закончить программу.Вывести полученный массив с помощью foreach
 */
public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        int[] mas = new int[size];
        enterArrays(mas,scanner);
        arrays(mas);
    }

    public static void enterArrays(int[] mas, Scanner scanner) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Enter your number");
            int numb = scanner.nextInt();
            if (numb > 0) {
                mas[i] = numb;
            } else {
                System.out.println("Введенно отрицательное значение");
                break;
            }
        }
    }

    public static void arrays(int[] mas) {
        for (int elem : mas) {
            System.out.print(elem + " ");

        }
    }
}
