package HW2;

public class Task2_1 {
    public static void main(String[] args) {
//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить сколько амеб будет через 3,6,б,9,12,..24 часа
        int cell=0;
        for (int i = 3; i <= 24; i=i+3) {
            cell=cell+2;
            System.out.println(i+" hour"+" = "+cell);
        }
    }

}
