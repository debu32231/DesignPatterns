package StrategyPattern.model.FlyBehaviour.impl;

import StrategyPattern.model.FlyBehaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {


    @Override
    public void fly() {
        System.out.println("I am flying......!!!!");
    }
}
