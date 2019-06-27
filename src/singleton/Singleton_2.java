package singleton;

/**
 * Ⅱ 饿汉式-线程安全
 * 线程不安全问题主要是由于 instance 被实例化多次，采取直接实例化 instance 的方式就不会产生线程不安全问题。
 *
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
public class Singleton_2 {

    private static Singleton_2 instance = new Singleton_2();

    public static Singleton_2 getInstance() {
        return instance;
    }
}
