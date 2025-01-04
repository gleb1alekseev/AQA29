package lesson9.Impl;

import lesson9.Exception.GameException;
import lesson9.User;
import lesson9.service.GameHandler;
import lesson9.service.GameService;

import java.util.Random;
import java.util.Scanner;

public class GameHandlerImpl implements GameHandler {

    private User user;
    private GameService gameService;
    private Random random;

    public GameHandlerImpl(User user) {
        this.user = user;
        this.gameService = new GameServiceImpl();
        this.random = new Random();
    }

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (user.getBalance() > 0) {
            System.out.println("Введите вашу ставку: ");
            int bet = scanner.nextInt();

            try {
                gameService.validate(bet, user);

                System.out.println("Введите число от 0 до 5 (\"-1\" для выхода): ");
                int userNumber = scanner.nextInt();

                if (userNumber == -1) {
                    System.out.println("Игра окончена");
                    break;
                }

                if (userNumber < 0 || userNumber > 5) {
                    System.out.println("Число должно быть от 0 до 5");
                    continue;
                }

                int randomNumber = random.nextInt(6);
                System.out.println("Случайное число: " + randomNumber);

                boolean isWin = gameService.play(userNumber, randomNumber);
                gameService.change(user, bet, isWin);

                if (isWin) {
                    System.out.println("Вы угадали число");
                } else {
                    System.out.println("Вы не угадали число");
                }

                System.out.println("Ваш текущий баланс: " + user.getBalance());

            } catch (GameException e) {
                System.out.println(e.getMessage());
            }
        }

        if (user.getBalance() <= 0) {
            System.out.println("Игра окончена, у вас закончились деньги");
        }

        scanner.close();
    }
}


