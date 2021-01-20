package by.homeWork1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число.");
        double startNum = sc.nextDouble();
        if (startNum == 0) {
            System.out.println("Невозможно определить близость числа к " + startNum);
            return;
        }
        System.out.println("Введите второе число.");
        double inputNum = sc.nextDouble();
        if (inputNum == 0) {
            System.out.println("Невозможно определить близость " + inputNum + " к числу.");
            return;
        }
        if (startNum > 0) {
            if (inputNum <= (startNum * 1.1) && inputNum >= (startNum * 0.9)) {
                System.out.println("Введённое число близко к первому.");
            } else {
                System.out.println("Введённое число далеко от первого.");
            }
        } else if (inputNum >= (startNum * 1.1) && inputNum <= (startNum * 0.9)) {
            System.out.println("Введённое число близко к первому.");
        } else {
            System.out.println("Введённое число далеко от первого.");
        }
    }
}