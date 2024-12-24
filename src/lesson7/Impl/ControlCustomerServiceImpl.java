package lesson7.Impl;

import lesson7.Order;
import lesson7.services.*;

public class ControlCustomerServiceImpl implements ControlCustomerService {

    private SavingDataService savingDataService;
    private ProcessOrderService processOrderService;
    private OrderService orderService;
    private DeliveryService deliveryService;

    public ControlCustomerServiceImpl(SavingDataService savingDataService, ProcessOrderService processOrderService, OrderService orderService, DeliveryService deliveryService) {
        this.savingDataService = savingDataService;
        this.processOrderService = processOrderService;
        this.orderService = orderService;
        this.deliveryService = deliveryService;
    }

    @Override
    public void controlCustomerService(Order order) {
        System.out.println("step_1");
        savingDataService.savingDataService(order);

        System.out.println("step_2");
        processOrderService.processOrderService(order);

        System.out.println("step_3");
        orderService.orderService(order);

        System.out.println("step_4");
        deliveryService.deliveryService(order);
    }

}
