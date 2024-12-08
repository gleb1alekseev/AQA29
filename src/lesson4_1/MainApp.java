package lesson4_1;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int[] mass1 = {9,1,8,6,2};
        int[] mass2 = {1,2,3,4,5,6};

        for (int i = 0; i < mass1.length; i++) {
            int number = mass1[i];
            for (int j = 0; j < mass2.length; j++) {
                if (mass1[i] == mass2[j]) {
                    System.out.println(number);
                     }
                 }
            }
    }
}
