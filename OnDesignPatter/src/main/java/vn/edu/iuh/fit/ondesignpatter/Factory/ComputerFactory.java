package vn.edu.iuh.fit.ondesignpatter.Factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:44 AM
 * @nameProject: Project_Architectural_Software
 */

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
