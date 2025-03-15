/*
 * @ {#} TaxDecorator.java   1.0     14/03/2025
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
public class TaxDecorator implements Tax {
    protected Tax tax;

    public TaxDecorator(Tax tax) {
        this.tax = tax;
    }

    @Override
    public double calculateTax(double price) {
        return tax.calculateTax(price);
    }
}
