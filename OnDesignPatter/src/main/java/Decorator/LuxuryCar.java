package Decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:58 AM
 * @nameProject: Project_Architectural_Software
 */

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
