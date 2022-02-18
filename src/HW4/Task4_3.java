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
        int[] mas = new int[15];
        arrays(mas);
        minElement(mas);
        maxElement(mas);
        }

    public static void arrays(int[] mas ) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);

        }
    }

        public static void minElement ( int[] mas ){
            int min = mas[0];
            for (int i = 0; i < mas.length; i++) {
                if (min > mas[i]) {
                    min = mas[i];
                }

            }
            System.out.println("Min element " + min);
        }

    public static void maxElement (int [] mas){
        int maxvalue = mas[0];
        int secondMax=0;
        for (int i = 0; i < mas.length; i++) {
            if(maxvalue<mas[i]){
                secondMax=maxvalue;
                maxvalue=mas[i];
            }
            else if(mas [i]>secondMax && mas[i]!=secondMax ){
                secondMax=mas[i];
            }
        }
        System.out.println("SecondMax element "+secondMax);
    }
}
