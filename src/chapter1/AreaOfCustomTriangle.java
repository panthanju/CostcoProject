package chapter1;

import java.util.Scanner;

public class AreaOfCustomTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Please enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * (base * height);

        System.out.println("The area of the triangle is " + area);
    }
}
