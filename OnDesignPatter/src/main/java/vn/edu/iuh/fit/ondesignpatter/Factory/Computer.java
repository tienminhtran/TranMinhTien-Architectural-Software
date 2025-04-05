package vn.edu.iuh.fit.ondesignpatter.Factory;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 6:41 AM
 * @nameProject: Project_Architectural_Software
 */

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
