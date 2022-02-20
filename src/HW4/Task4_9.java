package HW4;

/**
 * Являются ли масивы идентичные *
 *
 */

public class Task4_9 {
    public static void main(String[] args) {

        int[] mas1 = {1, 2, 3, 4, 5, 6};
        int[] mas2 = {1, 2, 3, 4, 5, 6};

        System.out.println(equals(mas1, mas2));
    }

    public static boolean equals(int[] mas1, int[] mas2) {
        if (mas1.length != mas2.length) {
            return false;
        }
            for (int i = 0, j = 0; i < mas1.length; j++, i++) {
                if (mas1[i] != mas2[j]) {
                    return false;
                }
            }

        return true;
    }
}




