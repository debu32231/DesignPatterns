package StrategyPattern.QuackBehaviour.impl;

import StrategyPattern.QuackBehaviour.QuackBehaviour;

public class Silence implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't Quack.....!!!");
    }
}
