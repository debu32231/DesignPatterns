package StrategyPattern.model.impl;

import StrategyPattern.model.Duck;
import StrategyPattern.model.FlyBehaviour.FlyBehaviour;
import StrategyPattern.model.FlyBehaviour.impl.FlyWithWings;
import StrategyPattern.model.QuackBehaviour.QuackBehaviour;
import StrategyPattern.model.QuackBehaviour.impl.Quack;

public class MallardDuck extends Duck {


    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck.....");
    }
}
