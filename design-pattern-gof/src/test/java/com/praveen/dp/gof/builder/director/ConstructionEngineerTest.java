package com.praveen.dp.gof.builder.director;

import org.junit.Test;

import com.praveen.dp.gof.builder.builders.ConcreteHouseBuilder;
import com.praveen.dp.gof.builder.builders.HouseBuilder;
import com.praveen.dp.gof.builder.builders.PrefabricatedHouseBuilder;
import com.praveen.dp.gof.builder.director.ConstructionEngineer;
import com.praveen.dp.gof.builder.product.House;

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }
}