package lesson7.Impl;

import lesson7.Order;
import lesson7.services.ProcessOrderService;

public class ProccessOrderServiceImpl implements ProcessOrderService {

    @Override
    public void processOrderService(Order order) {
        System.out.println("Заказ в обработке");
    }
}
