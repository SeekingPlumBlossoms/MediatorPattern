package com.yb.client;

import java.security.PublicKey;

public class Stock extends AbstractColleague {
    private static int COMPUTER_NUMBER=100;
    public Stock(AbstractMediator _mediator){
        super(_mediator);
    }
    public void increace(int number){
        COMPUTER_NUMBER=COMPUTER_NUMBER+number;
        System.out.println("库存数量为s:"+COMPUTER_NUMBER);
    }
    public void decrease(int number){
        COMPUTER_NUMBER=COMPUTER_NUMBER-number;
        System.out.println("库存数量为s:"+COMPUTER_NUMBER);
    }
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }
    public void clearStock(){
        System.out.println("清理存货数量!!为："+COMPUTER_NUMBER);
//        Purchase purchase=new Purchase();
//        Sale sale=new Sale();
//
//        sale.OffSale();
//        purchase.refuseBuyIBM();
        super.mediator.execute("stock.clear");
    }
}
