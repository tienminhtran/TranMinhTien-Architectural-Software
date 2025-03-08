import Singleton.StaticBlockSingleton;

public class StaticBlockSingletonTest {
    public static void main(String[] args) {
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();

        System.out.println(singleton1.hashCode());  // Mã hash của instance
        System.out.println(singleton2.hashCode());  // Phải giống singleton1, chứng minh Singleton hoạt động đúng
    }
}
