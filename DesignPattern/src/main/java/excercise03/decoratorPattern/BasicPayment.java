/*
 * @ {#} BasicPayment.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package excercise03.decoratorPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 8/3/2025
 * @time: 11:16 AM
 * @nameProject: Project_Architectural_Software
 */

public class BasicPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using basic payment.");
    }
}
