package Singleton;

public class StaticBlockSingleton {
    
    // Thể hiện (instance) duy nhất của lớp
    private static StaticBlockSingleton instance;

    // Constructor private để ngăn chặn việc tạo instance từ bên ngoài
    private StaticBlockSingleton() {}

    // Khối static để khởi tạo instance, có xử lý ngoại lệ
    static {
        try {
            instance = new StaticBlockSingleton(); // Khởi tạo instance
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi tạo instance của Singleton", e);
        }
    }

    // Phương thức public để lấy thể hiện duy nhất của Singleton
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
