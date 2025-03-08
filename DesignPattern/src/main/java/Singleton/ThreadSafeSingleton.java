package Singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static ThreadSafeSingleton getInstance(String number) {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton(number);
                }
            }
        }
        return instance;
    }
}
