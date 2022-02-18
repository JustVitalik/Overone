package HW4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Заполнить массив рандомными числами. Вывести второй максимальный и минимальный элемент
 *
 *
 */

public class Task4_3 {
    public static void main(String[] args) {
        int[] mas1={1,2,3,-4,5,-6,10,15};

        int min=mas1[0];
        for (int i = 0; i < mas1.length; i++) {
            if(min>mas1[i]) {
                min=mas1[i];
            }

        }
        System.out.println("min"+min);

        int maxvalue = mas1[0];
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < mas1.length; i++) {
            if(maxvalue<mas1[i]){
                max2=maxvalue;
                maxvalue=mas1[i];
            }
            else if(mas1 [i]>max2 && mas1[i]!=max2 ){
                max2=mas1[i];

            }
        }
        System.out.println("Max2 "+max2);
        System.out.println("Max "+maxvalue);


        int [] mas = new int[15];
        Random random = new Random();
        for (int i = 0; i < mas.length ; i++) {
            mas[i] = random.nextInt(20);
        }
        for (int i = 0; i < mas1.length; i++) {


        }
        System.out.println(Arrays.toString(mas));

    }
}
