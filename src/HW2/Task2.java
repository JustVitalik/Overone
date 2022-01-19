package HW2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Составить программу вычисляющюю А*В не пользуясь операцией умножения
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=0;

        for (int i = 0; i < num2; i++) {

           result+=num1;

        } System.out.println(result);
    }
}
