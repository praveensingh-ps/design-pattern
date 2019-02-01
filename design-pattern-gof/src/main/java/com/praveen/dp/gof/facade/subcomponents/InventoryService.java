package com.praveen.dp.gof.facade.subcomponents;


import com.praveen.dp.gof.facade.domain.Product;

public class InventoryService {
    public static boolean isAvailable(Product product){
        /*Check Warehouse database for product availability*/
        return true;
    }
}
