package Java_practice;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        TemperatureConversion temp = new TemperatureConversion();

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kelvin to Celsius\n2. Celsius to Kelvin\nSelect a number: ");
        int select = input.nextInt();
        System.out.print("Enter temperature: ");
        temp.setTemperature(input.nextDouble());

        switch (select) {
            case 1:
                System.out.printf("Kelvin -> Celsius: %.2f%n", temp.getKtoC());
                break;
            case 2:
                System.out.printf("Celsius -> Kelvin: %.2f%n", temp.getCtoK());
        }
    }

    private double temperature;

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public double getKtoC() {
        return temperature - 273.15;
    }

    public double getCtoK() {
        return temperature + 273.15;
    }
}
