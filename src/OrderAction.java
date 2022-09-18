import java.util.ArrayList;
import java.util.List;

public class OrderAction {
    List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Address 1","YellowXSmallDuck"));
        orders.add(new Order("Address 2","YellowSmallDuck"));
        orders.add(new Order("Address 3","WhiteXLargeDuck"));
        orders.add(new Order("Address 4","WhiteMediumDuck"));
        orders.add(new Order("Address 5","RedLargeDuck"));
        orders.add(new Order("Address 6","GreenLargeDuck"));
        orders.add(new Order("Address 7","BlackXLargeDuck"));
        orders.add(new Order("Address 8","BlackMediumDuck"));
        return orders;
    }
}
