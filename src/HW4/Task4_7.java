package HW4;

import java.util.Arrays;

/**
 * Скопировать один масив в другой
 *
 */

public class Task4_7 {
    public static void main(String[] args) {

        int[] mas1 = {1, 2, 3, 4, 5, 6};
        int[] mas2 = new int[6];
        copyMas(mas1,mas2);
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));;

    }
    public static void copyMas(int [] mas1, int [] mas2){

        if (mas1.length==mas2.length){
            for (int i = 0; i < mas1.length; i++) {
                mas2[i]=mas1[i];
            }

        }

    }
}
