package org.avalon.utils;

import org.avalon.model.Order;
import org.avalon.model.Trade;

import java.util.function.Consumer;

public class OrderBuilder {
    private final Order order = new Order();

    public static Order order(Consumer<OrderBuilder> builderRef){
        OrderBuilder orderBuilder = new OrderBuilder();
        builderRef.accept(orderBuilder);
        return orderBuilder.order;
    }

    public void forCustomer(String customer){
        order.setCustomer(customer);
    }

    private void createTrade(Consumer<TradeBuilder> builderRef, Trade.Type type){
        TradeBuilder tradeBuilder = new TradeBuilder();
        Trade trade = tradeBuilder.build();
        trade.setType(type);
        builderRef.accept(tradeBuilder);
        this.order.addTrade(trade);
    }

    public void buy(Consumer<TradeBuilder> builderRef){
        createTrade(builderRef, Trade.Type.BUY);
    }

    public void sell(Consumer<TradeBuilder> builderRef){
        createTrade(builderRef, Trade.Type.SELL);
    }

    public Order build(){
        return this.order;
    }
}
