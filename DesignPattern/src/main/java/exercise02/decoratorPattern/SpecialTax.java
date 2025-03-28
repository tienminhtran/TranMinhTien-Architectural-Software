/*
 * @ {#} SpecialTax.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise02.decoratorPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 * @time: 11:16 AM
 */
public class SpecialTax extends TaxDecorator {
    public SpecialTax(Tax tax) {
        super(tax);
    }

    @Override
    public double calculateTax(double price) {
        return super.calculateTax(price) + 0.2 * price;
    }
}
