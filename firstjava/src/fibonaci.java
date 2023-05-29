import java.util.Scanner;

public class fibonaci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 50;
        int c;
        int a = 1;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <=n; i++) {
            c = a + b;


            System.out.println(c);
            a = b;
            b=c;

        }



    }





}
