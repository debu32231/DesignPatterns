package StrategyPattern.model.QuackBehaviour.impl;

import StrategyPattern.model.QuackBehaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak.....");
    }
}
