package com.yb.model;

public class ConcreteColleague1 extends Colleague {
    public  ConcreteColleague1(Mediator _mediator){
        super(_mediator);
    }

    public void selfMethod(){
        //处理自己的业务逻辑
    }
    public void depMethod(){
        //处理自己的业务逻辑
        super.mediator.doSomething1();
    }
}
