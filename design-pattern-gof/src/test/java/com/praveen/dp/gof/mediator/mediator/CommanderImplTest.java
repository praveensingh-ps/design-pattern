package com.praveen.dp.gof.mediator.mediator;

import org.junit.Test;

import com.praveen.dp.gof.mediator.colleague.ArmedUnit;
import com.praveen.dp.gof.mediator.colleague.SoldierUnit;
import com.praveen.dp.gof.mediator.colleague.TankUnit;
import com.praveen.dp.gof.mediator.mediator.Commander;
import com.praveen.dp.gof.mediator.mediator.CommanderImpl;

import static org.junit.Assert.*;


public class CommanderImplTest {

    @Test
    public void testMediator() throws Exception {
        Commander commander= new CommanderImpl();
        ArmedUnit soldierUnit=new SoldierUnit(commander);
        ArmedUnit tankUnit=new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}