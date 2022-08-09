package StrategyPattern.model.QuackBehaviour.impl;

import StrategyPattern.model.QuackBehaviour.QuackBehaviour;

public class Silence implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't Quack.....!!!");
    }
}
