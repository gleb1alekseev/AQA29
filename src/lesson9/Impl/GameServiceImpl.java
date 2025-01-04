package lesson9.Impl;

import lesson9.Exception.GameException;
import lesson9.User;
import lesson9.service.GameService;

import java.util.Random;



public class GameServiceImpl implements GameService {

    @Override
    public void validate(int bet, User user) throws GameException {
        if (bet > user.getBalance()) {
            throw new GameException("Ставка не может быть больше баланса");
        }
        if (bet > 100) {
            throw new GameException("Ставка не может превышать 100 рублей");
        }
    }

    @Override
    public boolean play(int userNumber, int randomNumber) {
        return userNumber == randomNumber;
    }

    @Override
    public void change(User user, int bet, boolean isWin) {
        if (isWin) {
            user.setBalance(user.getBalance() + bet);
        } else {
            user.setBalance(user.getBalance() - bet);
        }
    }
}

