package Java_practice;
import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        SumDigit s = new SumDigit();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        s.setNum(input.nextInt());
        s.calculator(s.getNum());
        System.out.printf("Sum of four-digit %d: %d", s.getNum() , s.getSum());
    }

    private int num;
    private int sum;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void calculator(int num) {
        for(int i = 0; i < 4; i++) {
            sum += num % 10;
            num /= 10;
        }
    }

    public int getSum() {
        return sum;
    }
}
