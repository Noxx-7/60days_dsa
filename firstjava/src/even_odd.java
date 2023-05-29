import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("even" + num);
        } else {
            System.out.println("Odd" + num);
        }
    }
    
}

