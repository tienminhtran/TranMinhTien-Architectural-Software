package Strategy;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 7:17 AM
 * @nameProject: Project_Architectural_Software
 */

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("myemail@example.com", "mypassword"));

        cart.pay(new CreditCardStrategy("Tien Tran", "1234567890123456", "786", "12/23"));
    }
}
