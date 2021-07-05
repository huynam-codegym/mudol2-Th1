import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,heght,bmi;
        System.out.print("nhap so kg");
        weight = scanner.nextDouble();
        System.out.print("nhap chieu cao");
        heght = scanner.nextDouble();
        bmi= weight/Math.pow(heght,2);
        System.out.print("chi so bmi\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
