package Observer;/*
 * @description:
 * @author: TienMinhTran
 * @date: 15/3/2025
 * @time: 10:23 AM
 * @nameProject: Project_Architectural_Software
 */

public class MyTopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " :: Không có tin nhắn mới.");
        } else {
            System.out.println(name + " :: Tin nhắn mới: " + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
