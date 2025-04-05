package vn.edu.iuh.fit.ondesignpatter.Factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:43 AM
 * @nameProject: Project_Architectural_Software
 */

public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;

    }
}
