package StrategyPattern.model;

import StrategyPattern.model.FlyBehaviour.FlyBehaviour;
import StrategyPattern.model.QuackBehaviour.QuackBehaviour;

public abstract class Duck {

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All Ducks float, even decoys. ");
    }

}
