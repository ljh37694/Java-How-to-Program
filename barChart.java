package Java_practice;
import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0 ,d = 0, e = 0, num;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.printf("Enter number%d (1~30): ", i + 1);

            switch (i){
                case 0:
                    a = input.nextInt();
                    break;
                case 1:
                    b = input.nextInt();
                    break;
                case 2:
                    c = input.nextInt();
                    break;
                case 3:
                    d = input.nextInt();
                    break;
                case 4:
                    e = input.nextInt();
                    break;
            }
        }

        for(int i = 0; i < a; i++)
            System.out.print("*");
        System.out.println();

        for(int i = 0; i < b; i++)
            System.out.print("*");
        System.out.println();

        for(int i = 0; i < c; i++)
            System.out.print("*");
        System.out.println();

        for(int i = 0; i < d; i++)
            System.out.print("*");
        System.out.println();

        for(int i = 0; i < e; i++)
            System.out.print("*");
        System.out.println();
    }
}