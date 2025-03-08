package Singleton;/*
 * @description:
 * @author: TienMinhTran
 * @date: 8/3/2025
 * @time: 11:16 AM
 * @nameProject: Project_Architectural_Software
 */

public class EagerInitializedSingleton {

    // Bước 1: Khởi tạo thể hiện duy nhất của lớp ngay khi class được tải vào bộ nhớ.
    // Điều này đảm bảo an toàn luồng (thread-safe) nhưng có thể gây lãng phí bộ nhớ nếu không sử dụng.
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // Bước 2: Constructor để private nhằm ngăn chặn việc tạo thể hiện mới từ bên ngoài lớp này.
    private EagerInitializedSingleton() {}

    // Bước 3: Phương thức public để truy cập thể hiện duy nhất.
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}