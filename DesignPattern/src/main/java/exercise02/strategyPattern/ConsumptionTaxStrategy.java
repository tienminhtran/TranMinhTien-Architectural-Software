/*
 * @ {#} ConsumptionTaxStrategy.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise02.strategyPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 */
public class ConsumptionTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
