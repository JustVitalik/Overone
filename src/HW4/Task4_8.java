package HW4;

public class Task4_8 {
    public static void main(String[] args) {
// найти дубликаты в массиве char
        char[] array = {'a', 'h', 'r', 'f', 'a', 'h'};
        duplicate(array);

    }
    public static void duplicate (char[] array1){

        char symb;
        for (int i = 0; i <array1.length; i++) {
            for (int j = i+1; j <array1.length ; j++) {
                if (array1[i]==array1[j]){
                    symb=array1[i];
                    System.out.println(symb);
            }

            }
        }

    }

}
