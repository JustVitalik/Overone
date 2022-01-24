package HW3;
//code formatting!!!!
public class Task3_1 {
    public static void main(String[] args) {
        //Вычислить: 1+2+4+8+...+256
        int i=1;
        int result=0;
        while (i<=256){
//result+=i, i*=2
            result=result+i;
            i=i*2;

        }System.out.println(result);
//delete empty line

    }
}
