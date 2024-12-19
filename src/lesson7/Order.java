package lesson7;

import lesson7.Impl.DeliveryServiceImpl;
import lesson7.Impl.OrderReceiptServiceImpl;

public class Order {

    private DeliveryServiceImpl deliveryService;
    private OrderReceiptServiceImpl orderReceiptService;

    public Order(OrderReceiptServiceImpl orderReceiptService, DeliveryServiceImpl deliveryService){
        this.orderReceiptService = orderReceiptService;
        this.deliveryService = deliveryService;
    }

    public DeliveryServiceImpl getDeliveryService() {
        return deliveryService;
    }

    public OrderReceiptServiceImpl getOrderReceiptService() {
        return orderReceiptService;
    }
}
