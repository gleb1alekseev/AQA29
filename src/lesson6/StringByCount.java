package lesson6;

public class StringByCount {

    public static void PrintStringByCount (String string, int repeat) {
        for (int i = 0; i <= repeat; i++){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        PrintStringByCount("lesson6.1", 5);
    }
}
