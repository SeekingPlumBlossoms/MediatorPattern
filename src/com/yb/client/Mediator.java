package com.yb.client;

public class Mediator extends AbstractMediator {
    public void execute(String str,Object...objects){
        if(str.equals("puerchase.buy")){
            this.buyComputer((Integer) objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellIBMComputer((Integer) objects[0]);
        }else if(str.equals("sale.offsell")){
            this.offSale();
        }else if(str.equals("stock.clear")){
            this.clearStock();
        }
    }

    private void  buyComputer(int number){
        int saleStatus=super.sale.getSaleStatus();
        if(saleStatus>80){
            System.out.println("采购IBM电脑："+number+"台");
            super.stock.increace(number);
        }else {
            int buyNumber=number/2;
            System.out.println("采购IBM电脑:"+buyNumber+"台");
        }
    }
    private void sellIBMComputer(int number){
        System.out.println("销售IBM电脑:"+number+"台");
        if(super.stock.getStockNumber()<number){
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }
    private void offSale(){
        System.out.println("折价销售IBM电脑"+super.stock.getStockNumber()+"台");
 }
    private void clearStock(){
        System.out.println("清理存货数量为："+super.stock.getStockNumber());
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
