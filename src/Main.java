import java.util.Scanner;

import static java.lang.System.in;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();

        if (a<=b&&a>=d){
            System.out.println(a);
        } else if (b<=a&&b >=d){
            System.out.println(b);

        }else {
            System.out.println(d);
        }




    }
}