package HW2;

public class Task4 {
    public static void main(String[] args) {
        //Начав тренировки спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную ному на 10% нормы
        //предыдущего дня . Какой сумарный путь пробежит за 7 дней

        int km= 10;

        for (int i = 0; i < 7; i++) {
            int percent = km/10;
            km=km+percent;
        }
        System.out.println(km+" km");
    }
}
