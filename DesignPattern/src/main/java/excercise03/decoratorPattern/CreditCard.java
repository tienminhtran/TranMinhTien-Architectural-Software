/*
 * @ {#} CreditCard.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package excercise03.decoratorPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 * @time: 11:16 AM
 * @nameProject: Project_Architectural_Software
 */

<<<<<<< HEAD
public class CreditCard extends Paypal.PaymentDecorator {
    public CreditCard(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(int amount) {
        super.pay(amount);
        System.out.println("Pay by credit card");
    }
}
=======
//public class CreditCard extends PaymentDecorator {
//    public CreditCard(Payment payment) {
//        super(payment);
//    }
//
//    @Override
//    public void pay(int amount) {
//        super.pay(amount);
//        System.out.println("Pay by credit card");
//    }
//}
>>>>>>> 9ed8d11 (desginpatter_day2)
