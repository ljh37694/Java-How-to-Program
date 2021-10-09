package Java_practice;
import java.util.Scanner;
public class studentClass {
    public static void main(String[] args) {
        String student;
        int a = 0, b = 0, c = 0, d = 0;

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.printf("Enter the number of student%d grade: ", i + 1);
            student = input.next();

            switch (student){
                case "A":
                    a += 1;
                    break;
                case "B":
                    b += 1;
                    break;
                case "C":
                    c += 1;
                    break;
                case "D":
                    d += 1;
                    break;
            }
        }
        System.out.printf("A: %d%nB: %d%nC: %d%nD: %d%n", a, b, c, d);
    }
}