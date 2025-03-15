package Observer;/*
 * @description:
 * @author: TienMinhTran
 * @date: 15/3/2025
 * @time: 10:22 AM
 * @nameProject: Project_Architectural_Software
 */

import java.util.ArrayList;
import java.util.List;
//observers: Danh sách các Observer đăng ký.
//message: Thông điệp được cập nhật.
//        changed: Cờ kiểm tra nếu có thay đổi.
//        MUTEX: Đối tượng dùng để đồng bộ hóa khi truy cập danh sách Observer.
public class MyTopic implements Subject{
    private List<Observer> observers;  // Danh sách các observer
    private String message;            // Thông điệp cần thông báo
    private boolean changed;           // Cờ kiểm tra thay đổi
    private final Object MUTEX = new Object(); // Đối tượng khóa đồng bộ

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        synchronized (MUTEX) {
            if (!changed) return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // Phương thức để đăng bài lên topic
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
