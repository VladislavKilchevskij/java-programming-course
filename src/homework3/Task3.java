package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String greeting = String.format("Greetings %s. Oh, you're already %d years old.", name, age);
        System.out.println(greeting); // or use ".printf()" without String greeting
    }
}
