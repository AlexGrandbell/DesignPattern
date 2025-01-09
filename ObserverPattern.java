import java.util.List;
//观察者模式
public class ObserverPattern {
    public static void main(String[] args) {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建多个观察者对象
        IObserver observer1 = new ConcreteObserver(subject);
        //IObserver observer2 = new OtherConcreteObserver(subject);

        //主题对象通知所有观察者
        subject.notifyObservers();
    }
}

//抽象观察者
interface IObserver {
    //更新接口
    void update();
}

//抽象主题
interface ISubject {
    //增加观察者
    void add(IObserver observer);
    //删除观察者
    void del(IObserver observer);
    //通知观察者
    void notifyObservers();
}

//具体观察者
class ConcreteObserver implements IObserver {
    //关联的主题
    private ISubject subject;

    //构造方法，绑定主题
    public ConcreteObserver(ISubject subject) {
        this.subject = subject;
        //观察者自己添加到主题的观察者队列中
        subject.add(this);
    }

    //更新方法
    public void update() {
        //...
    }
}
//其他具体观察者...

//具体主题
class ConcreteSubject implements ISubject {
    //用来保存注册的观察者对象
    private List<IObserver> observers;

    //注册观察者对象
    public void add(IObserver observer) {
        //...
    }
    //删除观察者对象
    public void del(IObserver observer) {
        //...
    }

    //遍历通知所有注册的观察者对象
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}