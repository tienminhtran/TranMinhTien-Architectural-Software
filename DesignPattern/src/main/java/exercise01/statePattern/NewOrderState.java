/*
 * @ {#} Create.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise01.statePattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 * @time: 11:16 AM
 */
public class NewOrderState implements OrderState {
    @Override
    public void doAction() {
        System.out.println("---Kiểm tra thông tin đơn hàng.");
    }


    @Override
    public OrderState getPreviousState() {
        return this; // Là trạng thái đầu tiên
    }

    @Override
    public OrderState getNextState() {
        return new ProcessingOrderState(); // Chuyển sang trạng thái xử lý
    }
}
