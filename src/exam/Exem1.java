package exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose array to work with");
        System.out.println("1- numbers");
        System.out.println("2- string");
        int choose1 = scanner.nextInt();
        if (choose1 == 1) {
            System.out.println("How do you want to initialize array");
            System.out.println("1-from console");
            System.out.println("2-random numbers");
            int choose2 = scanner.nextInt();
            if (choose2 == 1) {
                System.out.println("Enter length");
                int length = scanner.nextInt();
                if (length > 0) {
                    int[] mas = initNumbersArrayConsole(length);
                    System.out.println("After sorted " + Arrays.toString(sortArray(mas)));
                    System.out.println("Index: " + indexOfArray(mas));
                    System.out.println("Max element: " + findMax(mas));
                }
                if (length < 0) {
                    System.out.println("Try again");
                    return;
                }
            }
            if (choose2 == 2) {
                int[] mas = initNumbersArrayRandom();
                System.out.println("Index: " + indexOfArray(mas));
                System.out.println("Max element: " + findMax(mas));
            }
        }

        if (choose1 == 2) {
            initStringsArray();
        }
    }

    //  Numbers
    public static int[] initNumbersArrayConsole(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        return mas;
    }

    public static int[] initNumbersArrayRandom() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter length");
        int length = scanner.nextInt();
        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mas));
        return mas;

    }
    //string

    public static void initStringsArray() {
        Scanner scanner = new Scanner(System.in);
        String[] mas2 = new String[]{"Hello", "From", "The"};
        System.out.println("Origin array: " + Arrays.toString(mas2));
        Arrays.sort(mas2);
        System.out.println("Sorted array " + Arrays.toString(mas2));
        System.out.println("Enter letter you want to replace");
        String letter = scanner.next();
        Random random = new Random();
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i].contains(letter)) {
                mas2[i] = mas2[i].replace(letter, String.valueOf(random.nextInt()));
            }
        }
        System.out.println(Arrays.toString(mas2));


    }

    public static int[] sortArray(int[] mas1) {
        for (int i = mas1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (mas1[j] > mas1[j + 1]) {
                    int tmp = mas1[j];
                    mas1[j] = mas1[j + 1];
                    mas1[j + 1] = tmp;
                }
            }
        }
        return mas1;
    }

    public static int indexOfArray(int[] mas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number whose index you want to find");
        int index = scanner.nextInt();
        for (int i = 0; i < mas.length; i++) {
            if (index == mas[i]) {
                index = i;
                return index;
            }

        }
        return -1;
    }

    public static int findMax(int[] mas) {
        int maxelement = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxelement) {
                maxelement = mas[i];
            }

        }
        return maxelement;

    }
}

