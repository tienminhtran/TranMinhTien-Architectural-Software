package Decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:55 AM
 * @nameProject: Project_Architectural_Software
 */

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
