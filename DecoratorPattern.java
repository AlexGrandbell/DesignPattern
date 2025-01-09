//装饰模式
public class DecoratorPattern {
    public static void main(String[] args) {
        //创建具体组件，接下来使用两个装饰器装饰它成为两个不同的有相似核心但有不同功能的对象
        AbComponent component = new ConcreteComponent();

        //创建具体装饰器1
        AbDecorator decorator1 = new ConcreteDecorator1(component);
        //调用具体装饰器1的方法
        decorator1.componentOperation();
        //创建具体装饰器2
        AbDecorator decorator2 = new ConcreteDecorator2(component);
        //调用具体装饰器2的方法
        decorator2.componentOperation();

        //装饰器也可以嵌套使用
        AbDecorator decorator3 = new ConcreteDecorator1(decorator2);
        decorator3.componentOperation();
    }
}

//抽象组件
abstract class AbComponent {
    //组件执行的业务操作
    public abstract void componentOperation();
}

//具体组件
class ConcreteComponent extends AbComponent {
    //具体组件执行的业务方法
    public void componentOperation() {
        //具体业务方法的实现
    }
}

//抽象装饰器
abstract class AbDecorator extends AbComponent {
    //定义一个私有成员变量来存储组件对象，确定谁被装饰
    private AbComponent component;
    //通过构造方法绑定被装饰对象
    public AbDecorator(AbComponent component) {
        this.component = component;
    }
    //将被修饰的组件的方法原封不动向外传
    public void componentOperation() {
        component.componentOperation();
    }
}

//具体装饰器1
class ConcreteDecorator1 extends AbDecorator {
    //通过构造方法绑定被装饰对象
    public ConcreteDecorator1(AbComponent component) {
        super(component);
    }
    //私有的装饰方法
    private void decorate() {
        //装饰方法的具体实现
    }
    //重写父类的需要使用装饰器的方法
    public void componentOperation() {
        //调用父类的方法
        super.componentOperation();
        //调用自己的装饰方法，可在前在后调用
        decorate();
    }
}
//具体装饰器2
class ConcreteDecorator2 extends AbDecorator {
    //通过构造方法绑定被装饰对象
    public ConcreteDecorator2(AbComponent component) {
        super(component);
    }
    //私有的装饰方法
    private void decorate() {
        //装饰方法的具体实现
    }
    //重写父类的需要使用装饰器的方法
    public void componentOperation() {
        //调用父类的方法
        super.componentOperation();
        //调用自己的装饰方法，可在前在后调用
        decorate();
    }
}
//其他装饰器...


