package Strategy;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 7:17 AM
 * @nameProject: Project_Architectural_Software
 */

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }


}
