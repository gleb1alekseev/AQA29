package lesson3;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Please enter number");

        Scanner sc = new Scanner(System.in);

        int value =  sc.nextInt();

        int result = 1;

        for (int i = 1; i <= value; i++){
            result = result * i;
        }

        System.out.println("Result is:");

        System.out.println(result);

    }
}