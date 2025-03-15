package Observer;/*
 * @description:
 * @author: TienMinhTran
 * @date: 15/3/2025
 * @time: 10:21 AM
 * @nameProject: Project_Architectural_Software
 */
public interface Observer {
    // Nhận thông báo cập nhật từ Subject
    public void update();

    // Đăng ký Subject để quan sát
    public void setSubject(Subject sub);
}
