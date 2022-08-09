package StrategyPattern.model.FlyBehaviour.impl;

import StrategyPattern.model.FlyBehaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly......");
    }
}
