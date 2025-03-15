<<<<<<< HEAD
/*
 * @ {#} Paypal.java   1.0     14/03/2025
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

public class Paypal extends Paypal.PaymentDecorator {
    public Paypal(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(int amount) {
        super.pay(amount);
        System.out.println("Paypal payment");
    }

    public static class PaymentDecorator implements Payment {
        protected Payment payment;

        public PaymentDecorator(Payment payment) {
            this.payment = payment;
        }

        @Override
        public void pay(int amount) {
            payment.pay(amount);
        }
    }
}
=======
///*
// * @ {#} Paypal.java   1.0     14/03/2025
// *
// * Copyright (c) 2025 IUH. All rights reserved.
// */
//
//package excercise03.decoratorPattern;
//
///*
// * @description:
// * @author: TienMinhTran
// * @date: 11/3/2025
// * @time: 11:16 AM
// * @nameProject: Project_Architectural_Software
// */
//
//public class Paypal extends Paypal.PaymentDecorator {
//    public Paypal(Payment payment) {
//        super(payment);
//    }
//
//    @Override
//    public void pay(int amount) {
//        super.pay(amount);
//        System.out.println("Paypal payment");
//    }
//
//    public static class PaymentDecorator implements Payment {
//        protected Payment payment;
//
//        public PaymentDecorator(Payment payment) {
//            this.payment = payment;
//        }
//
//        @Override
//        public void pay(int amount) {
//            payment.pay(amount);
//        }
//    }
//}
>>>>>>> 9ed8d11 (desginpatter_day2)
