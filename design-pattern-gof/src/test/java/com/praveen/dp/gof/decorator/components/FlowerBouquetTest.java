package com.praveen.dp.gof.decorator.components;

import org.junit.Test;

import com.praveen.dp.gof.decorator.components.FlowerBouquet;
import com.praveen.dp.gof.decorator.components.OrchidBouquet;
import com.praveen.dp.gof.decorator.components.RoseBouquet;
import com.praveen.dp.gof.decorator.decorators.Glitter;
import com.praveen.dp.gof.decorator.decorators.PaperWrapper;
import com.praveen.dp.gof.decorator.decorators.RibbonBow;


public class FlowerBouquetTest {
    @Test
    public void testFlowerBouquet() {
        /*Rose bouquet with no decoration*/
        FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription()
                + " $ " + roseBouquet.cost());

         /*Rose bouquet with paper wrapper, ribbon bow, and glitter*/
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet=new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet=new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet=new Glitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription()
                + " $ " + decoratedRoseBouquet.cost());

         /*Orchid bouquet with double paper wrapper and ribbon bow*/
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new RibbonBow(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription()
                + " $ " + decoratedOrchidBouquet.cost());
    }
}