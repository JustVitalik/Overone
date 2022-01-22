package HW2;

public class Task2_4 {
    public static void main(String[] args) {
        //Начав тренировки спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную ному на 10% нормы
        //предыдущего дня . Какой сумарный путь пробежит за 7 дней

        int km= 10;
       double result1= 0;


        for (int i = 0; i <3; i++) {

            result1=result1 +(km+i);
        }
        System.out.println(result1+" km");
    }
}
