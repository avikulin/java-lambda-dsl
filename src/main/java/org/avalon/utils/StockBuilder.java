package org.avalon.utils;

import org.avalon.model.Stock;

public class StockBuilder {
    private Stock stock = new Stock();

    public void symbol(String value){
        this.stock.setSymbol(value);
    }

    public void market(String value){
        this.stock.setMarket(value);
    }

    public Stock build(){
        return this.stock;
    }
}
