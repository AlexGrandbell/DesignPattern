//适配器模式
public class AdapterPattern {
    public static void main(String[] args) {
        //创建被适配者对象
        //IAdaptee adaptee = new Adaptee();
        //创建适配器对象
        //ITarget target = new Adapter(adaptee);
        //调用适配器的新接口方法
        //target.newMethod();
    }
}

//目标
interface ITarget {
    void newMethod();
}

//被适配者
interface IAdaptee {
    void oldMethod();
}

//适配器
class Adapter implements ITarget {
    //私有封装的被适配者（旧接口）对象
    private IAdaptee adaptee;

    //旧接口需要使用满足旧接口的对象进行实例化
    public Adapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    //新接口的方法实现
    public void newMethod() {
        //...
        adaptee.oldMethod();//调用旧接口
        //除了调用旧接口，为了适配新接口肯定要再写点东西来兼容
    }
}

//具体被适配者，肯定是要的，但是这里略
//class Adaptee implements IAdaptee {
//    //旧接口的方法实现
//    public void oldMethod() {
//        //...
//    }
//}


