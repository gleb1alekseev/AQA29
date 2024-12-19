package lesson7.Impl;

import lesson7.Order;
import lesson7.services.*;

public class ControlCustomerServiceImpl implements ControlCustomerService {

    private SavingDataService savingDataService;
    private ProcessingOrderService processingOrderService;
    private OrderReceiptService orderReceiptService;
    private DeliveredService deliveredService;

    public ControlCustomerServiceImpl(SavingDataService savingDataService, ProcessingOrderService processingOrderService, OrderReceiptService orderReceiptService, DeliveredService deliveredService) {
        this.savingDataService = savingDataService;
        this.processingOrderService = processingOrderService;
        this.orderReceiptService = orderReceiptService;
        this.deliveredService = deliveredService;
    }

    @Override
    public void controlCustomerService(Order order) {
        System.out.println("step_1");
        savingDataService.savingDataService(order);

        System.out.println("step_2");
        processingOrderService.processingOrderService(order);

        System.out.println("step_3");
        orderReceiptService.orderReceiptService(order);

        System.out.println("step_4");
        deliveredService.deliveredService(order);
    }
}
