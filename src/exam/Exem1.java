package exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exem1 {
    public static void main(String[] args) {
        int[] mas1=new int[0];
        String [] mas2=new String[0];

        initializeArray(mas1,mas2);
        findMax(mas1);
        System.out.println("Index "+indexOfArray(mas1));

    }

    public static void initializeArray(int[] mas1,String [] mas2) {

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
                    mas1 = new int[length];
                    for (int i = 0; i < mas1.length; i++) {
                        mas1[i] = scanner.nextInt();

                    }
                    System.out.println(Arrays.toString(mas1));
                    Arrays.sort(mas1);
                    System.out.println(Arrays.toString(mas1));
                }
                if (length < 0) {
                    System.out.println("Try again");

                }

            }

            if (choose2 == 2) {
                Random random = new Random();
                System.out.println("Enter length");
                int length = scanner.nextInt();
                mas1 = new int[length];
                for (int i = 0; i < mas1.length; i++) {
                    mas1[i] = random.nextInt();

                }
                System.out.println(Arrays.toString(mas1));

            }

        }

        //string
        if (choose1 == 2) {
            mas2= new String[] {"Hello","From","The"};
            Arrays.sort(mas2);
            System.out.println("Отсоритрованный "+Arrays.toString(mas2));
            System.out.println("Enter letter you want to replace");
            String letter= scanner.next();
            Random random = new Random();

            for (int i = 0; i < mas2.length; i++) {
                if(mas2[i].contains(letter)){
                    mas2[i]=String.valueOf(random.nextInt());
                }

            }
            System.out.println(Arrays.toString(mas2));

        }


    }
    public static int indexOfArray(int[] mas){
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index<= mas.length){
            for (int i = 0; i < mas.length; i++) {
                index=i;
            } return index;
        }else return -1;

    }

    public static void findMax(int[] mas) {
        int maxelement = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]>maxelement) {
                maxelement=mas[i];
            }

        }
        System.out.println("Max element "+maxelement);

    }
}

