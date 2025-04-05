package Decorator;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:58 AM
 * @nameProject: Project_Architectural_Software
 */

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        System.out.println("Sports Car: ");
        sportsCar.assemble();
        System.out.println("\n");

        Car luxuryCar = new LuxuryCar(new BasicCar());
        System.out.println("Luxury Car: ");
        luxuryCar.assemble();
        System.out.println("\n");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        System.out.println("Sports Luxury Car: ");
        sportsLuxuryCar.assemble();
    }
}
