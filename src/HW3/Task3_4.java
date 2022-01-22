package HW3;

public class Task3_4 {
    public static void main(String[] args) {
        //Данны числа от 0 до 100
        //-Посчитать сумму четнеых и вывести на экран
        //-Посчитать сумму нечетнеых и вывести на экран
        //-Найти общую сумму всех чисел

        int i=0;
        int sumEvenNumbers=0;
        int sumOddNumbers=0;
        int sumAll=0;

        while (i<=100){
            if (i%2==0){
                sumEvenNumbers=sumEvenNumbers+i;
            }
            if (i%2==1){
                sumOddNumbers=sumOddNumbers+i;
            }
            sumAll=sumAll+i;
            i++;

        }System.out.println("Sum even: "+sumEvenNumbers);
        System.out.println("Sum odd: "+sumOddNumbers);
        System.out.println("Sum all: "+sumAll);


    }



}
