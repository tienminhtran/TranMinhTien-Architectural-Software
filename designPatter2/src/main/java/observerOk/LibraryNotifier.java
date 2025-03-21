package observerOk;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:56 PM
 * @nameProject: Project_Architectural_Software
 */

import java.util.ArrayList;
import java.util.List;

public class LibraryNotifier {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}