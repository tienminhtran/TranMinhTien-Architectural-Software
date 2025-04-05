package Observer;

public class Main {

    public static void main(String[] args) {
        // Tạo chủ đề
        MyTopic topic = new MyTopic();

        // Tạo người quan sát
        Observer obj1 = new MyTopicSubscriber("Subscriber 1");
        Observer obj2 = new MyTopicSubscriber("Subscriber 2");
        Observer obj3 = new MyTopicSubscriber("Subscriber 3");

        // Đăng ký người quan sát vào chủ đề
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // Gán chủ đề cho người quan sát
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        // Kiểm tra cập nhật ban đầu
        obj1.update();

        // Gửi tin nhắn mới
        topic.postMessage("Hello, this is a new message!");
    }
}