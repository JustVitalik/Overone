package HW4;

import java.util.Arrays;

/**
 * Есть массив чисел. Разбить его пополам и поместить в соответствующие массивы (предусмотреть нечетную длину!)
 *
 */

public class Task4_5 {
    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5, 6};
        brokeMas(mas);

    }
    public static void brokeMas(int [] mas ){
        if (mas.length%2==0){
            int[] mas1=new int[mas.length-(mas.length/2)];
            int[] mas2=new int[mas.length-(mas.length/2)];
            for (int i = 0; i < mas.length-mas.length/2; i++) {
                mas1[i]=mas[i];
            }
            for (int i = mas.length/2 , j=0; i < mas.length;j++, i++) {
                mas2[j]=mas[i];
            }
            System.out.println(Arrays.toString(mas1));
            System.out.println(Arrays.toString(mas2));

        }else System.out.println("Массив не делится попалам");
    }
}
