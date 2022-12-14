package org.avalon.model;

import lombok.Data;

@Data
public class Trade {
    public enum Type{BUY, SELL}
    private Type type;
    private Stock stock;
    private int quantity;
    private double price;

    public double getValue(){
        return this.quantity * this.price;
    }
}
