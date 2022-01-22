package HW2;

public class Task2_5 {
    public static void main(String[] args) {
        //   *
        //  ***
        // *****
        //*******


        for (int i = 5; i >=0 ; i--) {
            System.out.println("*");
            for (int j = 0; j <=5-i; j++) {

                System.out.print("-");
            }

        }
    }
}
