package com.praveen.dp.gof.facade.controller;

import com.praveen.dp.gof.facade.servicefacade.OrderServiceFacade;

public class OrderFulfillmentController {
    OrderServiceFacade facade;
    boolean orderFulfilled=false;
    public void orderProduct(int productId) {
        orderFulfilled=facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
    }
}
