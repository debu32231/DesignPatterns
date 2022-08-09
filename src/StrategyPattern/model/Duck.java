package StrategyPattern.model;

import StrategyPattern.model.FlyBehaviour.FlyBehaviour;
import StrategyPattern.model.QuackBehaviour.QuackBehaviour;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly(){
        this.flyBehaviour.fly();
    }

    public void performQuack(){
        this.quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All Ducks float, even decoys. ");
    }

}
