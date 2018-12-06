package com.yb.model;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator _mediator){
        super(_mediator);
    }

    public void selfMethod(){
        //处理自己的业务逻辑
    }
    public void depMethod(){
        //处理自己的业务逻辑
        super.mediator.doSomething2();
    }
}
