package lesson7.Impl;

import lesson7.Order;
import lesson7.services.ProcessingOrderService;

public class ProccessingOrderServiceImpl implements ProcessingOrderService {

    @Override
    public void processingOrderService(Order order) {
        System.out.println("Заказ в обработке");
    }
}
