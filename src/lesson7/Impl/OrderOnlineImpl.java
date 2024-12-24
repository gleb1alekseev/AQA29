package lesson7.Impl;

import lesson7.Order;
import lesson7.services.OrderService;

public class OrderOnlineImpl implements OrderService {

    @Override
    public void orderService(Order order) {
        System.out.println("Заказ онлайн");
    }
}
