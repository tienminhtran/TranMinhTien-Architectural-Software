/*
 * @ {#} Test.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise01.strategyPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 * @time: 11:16 AM
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderState(new ProcessingOrderStrategy());
        order.orderState(new CancelledOrderStrategy());
    }
}
