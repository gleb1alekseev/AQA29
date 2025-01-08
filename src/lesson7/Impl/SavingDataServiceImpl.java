package lesson7.Impl;

import lesson7.Order;
import lesson7.services.SavingDataService;

public class SavingDataServiceImpl implements SavingDataService {

    @Override
    public void savingDataService(Order order) {
        System.out.println("Сохранение в базу данных");
    }
}
