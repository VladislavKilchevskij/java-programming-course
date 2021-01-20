package by.homeWork1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {  // 1 и 2 включая
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число диапазона.");
        int firstNum = sc.nextInt();
        System.out.println("Введите второе число диапазона.");
        int secondNum = sc.nextInt();
        if (secondNum < firstNum) {
            System.out.println("При введённых числах невозможно определеить принадлежность третьего к какому-либо из диапозонов.");
            return;
        }
        if (firstNum == secondNum) {
            System.out.println("При введённых числах не будет задано 3 диапазонов.");
            return;
        }
        System.out.println("Введите число для определения.");
        int thirdNum = sc.nextInt();
        if (thirdNum <= firstNum) {
            System.out.println("Введённое значение принадлежит к диапозону до " + firstNum + " включительно.");
        }
        if (thirdNum > firstNum && thirdNum <= secondNum) {
            System.out.println("Введённое значение принадлежит к диапозону от " + firstNum + " до " + secondNum + " включительно.");
        }
        if (thirdNum > secondNum) {
            System.out.println("Введённое значение принадлежит к диапозону после " + secondNum);
        }
    }
}
