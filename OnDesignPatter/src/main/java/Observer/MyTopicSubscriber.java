package Observer;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 7:27 AM
 * @nameProject: Project_Architectural_Software
 */

public class MyTopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String nm){
        this.name=nm;
    }
    @Override
    public void update() {

        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name + ":: No new message");
        }else
            System.out.println(name + ":: Consuming message::" + msg);
    }

    @Override
    public void setSubject(Subject sub) {

        this.topic = sub;

    }
}
