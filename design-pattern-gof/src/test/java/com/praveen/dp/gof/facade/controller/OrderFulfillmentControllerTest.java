package com.praveen.dp.gof.facade.controller;

import org.junit.Test;

import com.praveen.dp.gof.facade.controller.OrderFulfillmentController;
import com.praveen.dp.gof.facade.servicefacade.OrderServiceFacadeImpl;

import static org.junit.Assert.*;

public class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller=new OrderFulfillmentController();
        controller.facade=new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result=controller.orderFulfilled;
        assertTrue(result);
    }
}