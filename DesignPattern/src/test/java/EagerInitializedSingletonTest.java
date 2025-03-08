import Singleton.EagerInitializedSingleton;

public class EagerInitializedSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();

        System.out.println(singleton1.hashCode());  // In ra mã băm của thể hiện
        System.out.println(singleton2.hashCode());  // Phải giống với singleton1, chứng minh chỉ có 1 thể hiện duy nhất
    }
}
