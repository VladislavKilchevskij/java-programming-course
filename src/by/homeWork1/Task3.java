package by.homeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число.");
        double firstNum = sc.nextDouble();
        System.out.println("Введите второе число.");
        double secondNum = sc.nextDouble();
        System.out.println("Введите третье число.");
        double thirdNum = sc.nextDouble();
        double averNum = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("Среднее арифметическое введённых чисел равно " + averNum);
        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("Невозможно сравнить 3 одинокаовых числа.");
            return;
        }
        if (firstNum < secondNum) {
            if (firstNum < thirdNum) {
                System.out.println("Минимальное число - " + firstNum);
            } else {
                System.out.println("Минимальное число - " + thirdNum);
            }
        } else if (secondNum < thirdNum) {
            System.out.println("Минимальное число - " + secondNum);
        } else {
            System.out.println("Минимальное число - " + thirdNum);
        }
        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                System.out.println("Максимальное число - " + firstNum);
            } else {
                System.out.println("Максимальное число - " + thirdNum);
            }
        } else if (secondNum > thirdNum) {
            System.out.println("Максимальное число - " + secondNum);
        } else {
            System.out.println("Максимальное число - " + thirdNum);
        }
    }
}
