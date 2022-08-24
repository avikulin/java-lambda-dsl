package org.avalon.model;

import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class Order {
    private String customer;

    @Singular
    private final List<org.avalon.model.Trade> trades = new ArrayList<>();
    public void addTrade(org.avalon.model.Trade trade){
        Objects.requireNonNull(trade, "Trade ref must be set");
        this.trades.add(trade);
    }

    public double getValue(){
        return this.trades.stream().mapToDouble(org.avalon.model.Trade::getValue).sum();
    }
}
