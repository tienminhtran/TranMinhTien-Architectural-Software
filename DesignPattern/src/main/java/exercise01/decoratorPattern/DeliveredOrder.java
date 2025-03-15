/*
 * @ {#} DeliveredOrder.java   1.0     14/03/2025
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
public class DeliveredOrder extends OrderDecorator {
    public DeliveredOrder(Order order) {
        super(order);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Cập nhật trạng thái đơn hàng là ĐÃ GIAO.");
    }
}
