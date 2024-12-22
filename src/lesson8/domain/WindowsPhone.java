package lesson8.domain;

public class WindowsPhone extends Phone {
    @Override
    public void call(String number) {
        System.out.println("Выполняется звонок: " + number);
    }

    @Override
    public String firmware() {
        return "Версия Windows: 11";
    }
}