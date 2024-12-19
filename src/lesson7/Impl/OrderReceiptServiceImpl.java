package lesson7.Impl;

import lesson7.Order;
import lesson7.services.OrderReceiptService;

public enum OrderReceiptServiceImpl implements OrderReceiptService {
    ONLINE,
    PHONE;

    @Override
    public void orderReceiptService(Order order) {
        if (OrderReceiptServiceImpl.ONLINE == order.getOrderReceiptService()){
            System.out.println("Заказ онлайн");
        } else {
            System.out.println("Заказ по телефону");
        }

    }
}
