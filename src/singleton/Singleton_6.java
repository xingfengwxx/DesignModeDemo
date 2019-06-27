package singleton;

/**
 * Ⅵ 枚举实现
 *
 * 该实现可以防止反射攻击。在其它实现中，通过 setAccessible() 方法可以将私有构造函数的访问级别设置为 public，
 * 然后调用构造函数从而实例化对象，如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码。
 * 该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击。
 *
 * 该实现在多次序列化和序列化之后，不会得到多个实例。而其它实现需要使用 transient 修饰所有字段，并且实现序列化和反序列化的方法。
 */
public enum Singleton_6 {
    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        //单例测试
        Singleton_6 firstSingleton = Singleton_6.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());
        Singleton_6 secondSingleton = Singleton_6.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        //反射获取示例测试
        try {
            Singleton_6[] enumConstants = Singleton_6.class.getEnumConstants();
            System.out.println("反射获取示例：");
            for (Singleton_6 enumConstant : enumConstants) {
                System.out.println(enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
