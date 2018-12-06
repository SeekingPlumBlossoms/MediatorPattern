package com.yb.model;

public class ConcreteMediator extends Mediator {
    public void doSomething1(){
        super.c1.selfMethod();
        super.c2.selfMethod();
    }
    public void doSomething2(){
        super.c1.selfMethod();
        super.c2.selfMethod();
    }
}
