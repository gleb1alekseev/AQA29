package lesson8.service;

import lesson8.domain.Phone;

public class PhoneRepairCheckService {
    public void check(Phone phone) {
        phone.call("2020327");
        phone.play(50);
        System.out.println(phone.firmware());
        System.out.println("Телефон исправен");
    }
}