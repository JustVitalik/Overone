package HW4;

public class Task4_4 {
    public static void main(String[] args) {
        //Есть массив. Найти максимально возможную сумму и минимальную разность элементов
        int[] mas={5,10,3,6,5,1};
        int diff=0;

        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i]>mas[i+1]){
                diff=mas[i]-mas[i+1];

            }

        } System.out.println(diff);

//        int sum=0;
//        for (int i = 0; i <mas.length ; i++) {
//            sum+=mas[i];
//        }
//        System.out.println(sum);
//
//
    }

}
