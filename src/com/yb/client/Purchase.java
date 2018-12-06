package com.yb.client;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator){
        super(_mediator);
    }

    public void buyIBMcomputer(int number){
//        Stock stock=new Stock();
//        Sale sale=new Sale();
//        int saleStatus=sale.getSaleStatus();
//        if(saleStatus>80){
//            System.out.println("采购IBM电脑："+saleStatus+"台");
//            stock.increace(number);
//        }else {
//            int buyNumber=number/2;
//            System.out.println("采购IBM电脑:"+buyNumber+"台");
//        }
        super.mediator.execute("purchase.buy",number);
        }
        public void refuseBuyIBM(){
            System.out.println("不再采购IBM电脑");
        }
}
