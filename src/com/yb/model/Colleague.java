package com.yb.model;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator){
        this.mediator=_mediator;
    }
}
