package lesson9;

import lesson9.Exception.GameException;
import lesson9.Impl.GameHandlerImpl;
import lesson9.Impl.GameServiceImpl;
import lesson9.service.GameHandler;
import lesson9.service.GameService;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите сумму на счете: ");
        int balance = scanner.nextInt();

        var user = new User(name, balance);
        var gameHandler = new GameHandlerImpl(user);

        gameHandler.run();

        scanner.close();
    }
}
