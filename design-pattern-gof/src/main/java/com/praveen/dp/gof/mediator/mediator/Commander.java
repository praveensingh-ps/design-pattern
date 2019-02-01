package com.praveen.dp.gof.mediator.mediator;


import com.praveen.dp.gof.mediator.colleague.ArmedUnit;
import com.praveen.dp.gof.mediator.colleague.SoldierUnit;
import com.praveen.dp.gof.mediator.colleague.TankUnit;

public interface Commander {
   void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);
    void setAttackStatus(boolean attackStatus);
    boolean canAttack();
    void startAttack(ArmedUnit armedUnit);
    void ceaseAttack(ArmedUnit armedUnit);
}
