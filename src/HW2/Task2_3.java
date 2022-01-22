package HW2;

public class Task2_3 {
    public static void main(String[] args) {
        //Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для занчений от 1 до 20 дюймов
        //1 дюйм = 2.54 см.

//        int inch=0;

        for (int i = 1; i <= 20; i++) {
             double centimeter =2.54*i;
            System.out.println(i +" inch = "+ centimeter+" centimeter");
        }



    }

}
