package lesson7.services;

import lesson7.Order;

public interface DeliveryService {

    default void deliveryService(Order order) {
        System.out.println("Выдача через окно");
    }
}
