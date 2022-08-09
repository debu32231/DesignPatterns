package StrategyPattern.model.QuackBehaviour.impl;

import StrategyPattern.model.QuackBehaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack.....");
    }
}
