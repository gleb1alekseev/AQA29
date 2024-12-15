package lesson4_2;

public class MainApp {

    public static void main(String[] args) {

        int[] mass = {12,9,1,4,88,5};

        int count = mass.length;
        int sum = 0;
        int max = mass[0];
        int min = mass[0];

        for (int i = 1; i < mass.length; i++){
            if (max < mass[i]){
                max = mass[i];
            }
            if (min > mass[i]) {
                min = mass[i];
            }
            sum += mass[i];
        }
            System.out.println("count is " + count);
            System.out.println("sum is " + sum);
            System.out.println("max is " + max);
            System.out.println("min is " + min);
    }
}
