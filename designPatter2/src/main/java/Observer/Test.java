package Observer;/*
 * @description:
 * @author: TienMinhTran
 * @date: 15/3/2025
 * @time: 10:24 AM
 * @nameProject: Project_Architectural_Software
 */


public class Test {
    public static void main(String[] args) {
        // Tạo một Subject (chủ đề)
        MyTopic topic = new MyTopic();

        // Tạo các Observer
        Observer obj1 = new MyTopicSubscriber("Observer 1");
        Observer obj2 = new MyTopicSubscriber("Observer 2");
        Observer obj3 = new MyTopicSubscriber("Observer 3");

        // Đăng ký Observer vào Subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // Gán Subject cho Observer
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        // Kiểm tra khi không có tin nhắn
        obj1.update();

        // Đăng tin nhắn mới
        topic.postMessage("Chào mừng đến với Observer Pattern!");
    }
}
