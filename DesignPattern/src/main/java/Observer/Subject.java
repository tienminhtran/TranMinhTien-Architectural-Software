package Observer;/*
 * @description:
 * @author: TienMinhTran
 * @date: 15/3/2025
 * @time: 10:20 AM
 * @nameProject: Project_Architectural_Software
 */
//register(Observer obj): Thêm một Observer vào danh sách.
//unregister(Observer obj): Xóa một Observer khỏi danh sách.
//notifyObservers(): Gửi thông báo đến tất cả Observer khi có thay đổi.
//getUpdate(Observer obj): Trả về thông tin mới nhất cho Observer.

// Giao diện Subject
public interface Subject {
    // Đăng ký observer
    public void register(Observer obj);

    // Hủy đăng ký observer
    public void unregister(Observer obj);

    // Thông báo đến tất cả observer
    public void notifyObservers();

    // Lấy thông tin cập nhật
    public Object getUpdate(Observer obj);
}
