package observerOk;/*
 * @description:
 * @author: TienMinhTran
 * @date: 21/3/2025
 * @time: 8:55 PM
 * @nameProject: Project_Architectural_Software
 */

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
