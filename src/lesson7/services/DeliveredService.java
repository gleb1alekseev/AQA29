package lesson7.services;

import lesson7.Impl.DeliveryServiceImpl;
import lesson7.Order;

public interface DeliveredService {

    default void deliveredService(Order order) {
        if (DeliveryServiceImpl.WINDOW == order.getDeliveryService()) {
            System.out.println("Выдача заказа через окно");
        } else {
            System.out.println("Доставка заказа на дом");
        }
    }
}
