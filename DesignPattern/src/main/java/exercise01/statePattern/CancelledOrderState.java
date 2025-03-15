/*
 * @ {#} Cancel.java   1.0     14/03/2025
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
public class CancelledOrderState implements OrderState {
    @Override
    public void doAction() {
        System.out.println("---Hủy: Hủy đơn hàng và hoàn tiền.");
    }

    @Override
    public OrderState getPreviousState() {
        return new ProcessingOrderState();
    }

    @Override
    public OrderState getNextState() {
        return this;
    }
}
