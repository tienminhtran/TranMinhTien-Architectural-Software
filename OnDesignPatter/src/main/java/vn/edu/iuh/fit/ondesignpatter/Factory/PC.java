package vn.edu.iuh.fit.ondesignpatter.Factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:42 AM
 * @nameProject: Project_Architectural_Software
 */

public class PC extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getHDD() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }
}
