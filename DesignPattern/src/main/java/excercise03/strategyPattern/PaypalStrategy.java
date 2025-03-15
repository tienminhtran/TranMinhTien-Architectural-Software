/*
 * @ {#} PaypalStrategy.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package excercise03.strategyPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 * @time: 11:16 AM
 */
public class PaypalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal payment: " + amount);
    }
}
