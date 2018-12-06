package com.yb.client;

import java.util.Random;

public class Sale extends  AbstractColleague {
    public Sale(AbstractMediator _mediator){
        super(_mediator);
    }
    public void sellIBMComputer(int number){
        System.out.println("销售IBM电脑:"+number+"台!");
//        Stock stock=new Stock();
//        Purchase purchase=new Purchase();
//        if(stock.getStockNumber()<number){
//
//        }
//        stock.decrease(number);
        super.mediator.execute("sale.sell",number);


    }

    public int getSaleStatus(){
        Random random=new Random(System.currentTimeMillis());
        int saleStatus=random.nextInt(100);
        System.out.println("IBM电脑销售情况:"+saleStatus);
        return saleStatus;
    }
    public void offSale(){
//        Stock stock=new Stock();Stock stock=new Stock();
//        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
        super.mediator.execute("sale.offsell");
    }
}
