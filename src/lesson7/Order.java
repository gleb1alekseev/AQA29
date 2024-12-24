package lesson7;

import lesson7.Impl.DeliveryServiceWindowImpl;
import lesson7.Impl.OrderOnlineImpl;
import lesson7.Impl.ProccessOrderServiceImpl;
import lesson7.Impl.SavingDataServiceImpl;

public class Order {

    private DeliveryServiceWindowImpl deliveryService;
    private OrderOnlineImpl orderOnline;
    private ProccessOrderServiceImpl proccessingOrder;
    private SavingDataServiceImpl savingData;

    public Order(DeliveryServiceWindowImpl deliveryService, OrderOnlineImpl orderOnline, ProccessOrderServiceImpl proccessingOrder, SavingDataServiceImpl savingData){
        this.orderOnline = orderOnline;
        this.deliveryService = deliveryService;
        this.proccessingOrder = proccessingOrder;
        this.savingData = savingData;
    }

    public DeliveryServiceWindowImpl getDeliveryService() {
        return deliveryService;
    }

}
