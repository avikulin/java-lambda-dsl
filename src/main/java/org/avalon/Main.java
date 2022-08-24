package org.avalon;

import org.avalon.model.Order;
import org.avalon.utils.OrderBuilder;

public class Main {
    public static void main(String[] args) {
        Order order = OrderBuilder.order(o ->{
            o.forCustomer("Andrey Vikulin");
            o.buy(t->{
                t.quantity(50);
                t.price(10.1);
                t.stock(s->{
                    s.symbol("IBM");
                    s.market("NYSE");
                });
            });
            o.sell(t->{
                t.quantity(10);
                t.price(12.7);
                t.stock(s->{
                    s.symbol("GOOGLE");
                    s.market("NASDAQ");
                });
            });
        });

        System.out.println(order);
        System.out.println(order.getValue());
    }
}
