package lesson7;


import lesson7.Impl.*;

public class MainApp {

    public static void main(String[] args) {

        DeliveryServiceWindowImpl deliveryWindow = new DeliveryServiceWindowImpl();
        DeliveryServiceHomeImpl deliveryHome = new DeliveryServiceHomeImpl();
        OrderOnlineImpl orderOnline = new OrderOnlineImpl();
        OrderPhoneImpl orderPhone = new OrderPhoneImpl();
        ProccessOrderServiceImpl proccessOrder = new ProccessOrderServiceImpl();
        SavingDataServiceImpl savingData = new SavingDataServiceImpl();
        Order order = new Order(deliveryWindow, orderOnline, proccessOrder, savingData);

        ControlCustomerServiceImpl service = new ControlCustomerServiceImpl(
                new SavingDataServiceImpl(),
                new ProccessOrderServiceImpl(),
                new OrderPhoneImpl(),
                new DeliveryServiceWindowImpl()
        );

        service.controlCustomerService(order);
    }
}
