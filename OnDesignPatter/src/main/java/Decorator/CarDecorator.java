package Decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:56 AM
 * @nameProject: Project_Architectural_Software
 */

public class CarDecorator implements Car{
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
    @Override
    public void assemble() {
        System.out.print("Car Decorator.");
    }
}
