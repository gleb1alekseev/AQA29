package lesson8.domain;

public abstract class Phone {
    public void call(String number) {
        System.out.println("Выполняется звонок: " + number);
    }

    public void play(int volume) {
        System.out.println("Громкость музыки: " + volume);
    }

    public abstract String firmware();
}
