/*
 * @ {#} DeliveredOrderStrategy.java   1.0     14/03/2025
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
public class DeliveredOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(String orderStatus) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
