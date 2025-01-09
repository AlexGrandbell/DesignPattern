//工厂方法模式
public class FactoryMethodPattern {
    public static void main(String[] args) {
        ICreator creator1 = new ConcreteCreator1();//创建具体工厂1
        IProduct product1 = creator1.factoryMethod();//通过具体工厂1造产品
        product1.doSomething();//产品1的自身业务方法

        ICreator creator2 = new ConcreteCreator2();//创建具体工厂2
        IProduct product2 = creator2.factoryMethod();//通过具体工厂2造产品
        product2.doSomething();//产品2的自身业务方法

        //其他工厂...
    }
}

//抽象工厂
interface ICreator {
    //造抽象产品的方法
    IProduct factoryMethod();
}
//抽象产品
interface IProduct {
    //产品的自身业务方法...
    public void doSomething();
}

//具体工厂1
class ConcreteCreator1 implements ICreator {
    //造具体产品1的方法
    public IProduct factoryMethod() {
        //...
        return new ConcreteProduct1();
    }
}
//具体工厂2
class ConcreteCreator2 implements ICreator {
    //造具体产品2的方法
    public IProduct factoryMethod() {
        //...
        return new ConcreteProduct2();
    }
}
//其他工厂...

//具体产品1
class ConcreteProduct1 implements IProduct {
    //产品1的自身业务实现方法
    public void doSomething() {
        //...
    }
}
//具体产品2
class ConcreteProduct2 implements IProduct {
    //产品2的自身业务实现方法
    public void doSomething() {
        //...
    }
}
//其他产品...


