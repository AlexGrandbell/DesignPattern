//单例模式
public class SingletonPattern {
    public static void main(String[] args) {
        //不能使用new创建具体单件类对象
        //Singleton s = new Singleton();
        //要调用getInstance方法
        Singleton s1 = Singleton.getInstance();
        //单件类对象的函数调用...
        //...
    }
}

//单件类
class Singleton {
    //定义一个静态变量来存储创建好的类实例
    //注意要静态static的
    private static Singleton uniqueInstance = null;

    //与一般构造函数要公有不同，这里的构造方法是私有的
    private Singleton() {
        //...
    }

    //定义一个静态方法来获取类实例,并且要多线程
    public static synchronized Singleton getInstance() {
        //如果类实例为null，即还没创建，则创建一个
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //其他方法...
}


