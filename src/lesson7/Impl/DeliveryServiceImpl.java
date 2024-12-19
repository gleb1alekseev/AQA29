package lesson7.Impl;

import lesson7.Order;
import lesson7.services.DeliveredService;

public enum DeliveryServiceImpl implements DeliveredService {
    HOME,
    WINDOW;

    @Override
    public void deliveredService(Order order) {
        if (DeliveryServiceImpl.HOME == order.getDeliveryService()){
            System.out.println("Доставка заказа на дом");
        } else {
            System.out.println("Выдача заказа через окно");
        }

    }
}
