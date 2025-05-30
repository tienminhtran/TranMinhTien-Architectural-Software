/*
 * @ {#} CancelledOrder.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise01.decoratorPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 * @time: 11:16 AM
 */
public class CancelledOrder extends OrderDecorator {
    public CancelledOrder(Order order) {
        super(order);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
