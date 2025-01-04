package lesson9.service;

import lesson9.Exception.GameException;
import lesson9.User;

import java.util.Random;

public interface GameService {

    void validate(int bet, User user) throws GameException;

    boolean play(int userNumber, int randomNumber);

    void change(User user, int bet, boolean isWin);
}

