package singleton;

/**
 * Ⅴ 静态内部类实现
 * 当 Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例，
 * 并且 JVM 能确保 INSTANCE 只被实例化一次。
 *
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 */
public class Singleton_5 {

    private Singleton_5() {

    }

    private static class SingletonHolder {
        private static final Singleton_5 INSTANCE = new Singleton_5();
    }

    public static Singleton_5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
