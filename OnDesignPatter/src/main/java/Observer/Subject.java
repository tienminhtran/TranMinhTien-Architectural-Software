package Observer;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 7:24 AM
 * @nameProject: Project_Architectural_Software
 */

public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
    Object getUpdate(Observer obj);
}
