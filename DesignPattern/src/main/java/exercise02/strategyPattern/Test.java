/*
 * @ {#} Test.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise02.strategyPattern;

/*
 * @description:
 * @author: TienMinhTran
 * @date: 11/3/2025
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product("iPhone", 1500, new ConsumptionTaxStrategy());
        product.printTax();

        product.setTaxStrategy(new VATStrategy());
        product.printTax();

        product.setTaxStrategy(new SpecialTaxStrategy());
        product.printTax();
    }
}
