package HW4;

/**
 * Есть массив. Найти максимально возможную сумму и минимальную разность элементов
 *
 */

public class Task4_4 {
    public static void main(String[] args) {

        int[] mas={5,10,3,6,5,1};
         sumarrays(mas);

        }
        public static void sumarrays (int [] mas ){

        int sum=0;
        for (int i = 0; i <mas.length ; i++) {
            sum+=mas[i];
        }
        System.out.println(sum);

    }

}
