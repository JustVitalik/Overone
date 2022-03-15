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
        //choose1->enteredIndex,chosenIndex and ect... This name is weird
        int choose1 = scanner.nextInt();
        if (choose1 == 1) {
            System.out.println("How do you want to initialize array");
            System.out.println("1-from console");
            System.out.println("2-random numbers");
            int choose2 = scanner.nextInt();
            if (choose2 == 1) {
                //for length create another method.
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
                    //this will stop the program, but i want to continue entering as I showed in expected results.
                    return;
                }
            }
            if (choose2 == 2) {
                //mas->array
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
    //In all methods every time you create Scanner instance. Pass it as parameters.
    public static int[] initNumbersArrayConsole(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        return mas;
    }

    public static int[] initNumbersArrayRandom() {
        Scanner scanner = new Scanner(System.in);//parameter
        Random random = new Random();
        System.out.println("Enter length");
        int length = scanner.nextInt();
        //mas->array.
        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }
        //does your method say anything about printing? print it after returning
        System.out.println(Arrays.toString(mas));
        return mas;

    }
    //string

    public static void initStringsArray() {
        Scanner scanner = new Scanner(System.in);
        //mas2->array. Bad naming
        String[] mas2 = new String[]{"Hello", "From", "The"};//? You need to initialize it from console
        System.out.println("Origin array: " + Arrays.toString(mas2));//why do you print it here?
        Arrays.sort(mas2);
        System.out.println("Sorted array " + Arrays.toString(mas2));//why do you print it here?
        System.out.println("Enter letter you want to replace");
        String letter = scanner.next();
        Random random = new Random();
        //does 'initStringsArray' says anything about this logic? It must be in a separate method.
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i].contains(letter)) {
                mas2[i] = mas2[i].replace(letter, String.valueOf(random.nextInt()));
            }
        }
        System.out.println(Arrays.toString(mas2));//does 'initStringsArray' says anything about printing? 
//no empty lines
//no empty lines
    }
//mas1->array. Bad naming
    public static int[] sortArray(int[] mas1) {
        for (int i = mas1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
//no empty lines
                if (mas1[j] > mas1[j + 1]) {
                    int tmp = mas1[j];
                    mas1[j] = mas1[j + 1];
                    mas1[j + 1] = tmp;
                }
            }
        }
        return mas1;
    }
//mas->array
    public static int indexOfArray(int[] mas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number whose index you want to find");
        int index = scanner.nextInt();
        for (int i = 0; i < mas.length; i++) {
            if (index == mas[i]) {
                index = i;//return i; no need in this assigments.
                return index;
            }
//no empty lines
        }
        return -1;
    }
//mas->array
    public static int findMax(int[] mas) {
        int maxelement = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxelement) {
                maxelement = mas[i];
            }
//no empty lines
        }
        return maxelement;
//no empty lines
    }
}

