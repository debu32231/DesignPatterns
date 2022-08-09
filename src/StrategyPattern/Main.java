package StrategyPattern;

import StrategyPattern.model.Duck;
import StrategyPattern.model.impl.MallardDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Strategy Pattern");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
