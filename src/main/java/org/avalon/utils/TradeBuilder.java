package org.avalon.utils;

import org.avalon.model.Trade;

import java.util.function.Consumer;

public class TradeBuilder {
    private Trade trade = new Trade();

    public void quantity(int value){
        this.trade.setQuantity(value);
    }

    public void price(double value){
        this.trade.setPrice(value);
    }

    public void stock(Consumer<StockBuilder> builderRef){
        StockBuilder stockBuilder = new StockBuilder();
        builderRef.accept(stockBuilder);
        this.trade.setStock(stockBuilder.build());
    }

    public Trade build(){
        return this.trade;
    }
}
