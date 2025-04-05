package Decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:57 AM
 * @nameProject: Project_Architectural_Software
 */

public class SportsCar extends CarDecorator{
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
