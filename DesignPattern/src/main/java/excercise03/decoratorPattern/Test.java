/*
 * @ {#} Test.java   1.0     14/03/2025
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

public class Test {
    public static void main(String[] args) {
        Payment basicPayment = new BasicPayment();
        basicPayment.pay(100);

        Payment creditCard = new CreditCard(new BasicPayment());
        creditCard.pay(100);

        Payment paypal = new Paypal(new BasicPayment());
        paypal.pay(100);
    }
}

