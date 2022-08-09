package StrategyPattern.QuackBehaviour.impl;

import StrategyPattern.QuackBehaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak.....");
    }
}
