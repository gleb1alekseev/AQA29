package lesson7.Impl;

import lesson7.Order;
import lesson7.services.DeliveryService;

public class DeliveryServiceHomeImpl implements DeliveryService {
    @Override
    public void deliveryService(Order order) {
        System.out.println("Доставка на дом");
    }
}