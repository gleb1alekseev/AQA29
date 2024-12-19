package lesson7;


import lesson7.Impl.*;

public class MainApp {

    public static void main(String[] args) {

        Order order = new Order(OrderReceiptServiceImpl.PHONE, DeliveryServiceImpl.WINDOW);

        ControlCustomerServiceImpl service = new ControlCustomerServiceImpl(
                new SavingDataServiceImpl(),
                new ProccessingOrderServiceImpl(),
                order.getOrderReceiptService(),
                order.getDeliveryService());
        service.controlCustomerService(order);

    }
}
