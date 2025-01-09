//抽象工厂模式
public class AbstractFactoryPattern {
    public static void main(String args[]) {
        IAbstractFactory factory1 = new ConcreteFactory1();//创建具体工厂1
        IProductA productA1 = factory1.createProductA();//通过具体工厂1造产品A
        IProductB productB1 = factory1.createProductB();//通过具体工厂1造产品B
        productA1.doA();//产品A1的自身业务方法
        productB1.doB();//产品B1的自身业务方法

        IAbstractFactory factory2 = new ConcreteFactory2();//创建具体工厂2
        IProductA productA2 = factory2.createProductA();//通过具体工厂2造产品A
        IProductB productB2 = factory2.createProductB();//通过具体工厂2造产品B
        productA2.doA();//产品A2的自身业务方法
        productB2.doB();//产品B2的自身业务方法
    }
}

//抽象工厂类
interface IAbstractFactory {
    //造产品A的方法
    IProductA createProductA();
    //造产品B的方法
    IProductB createProductB();
}

//抽象产品A
interface IProductA {
    //产品A的自身业务方法
    public void doA();
}
//抽象产品B
interface IProductB {
    //产品B的自身业务方法
    public void doB();
}

//具体工厂1
class ConcreteFactory1 implements IAbstractFactory {
    //造产品A的方法
    public IProductA createProductA() {return new ProductA1();}
    //造产品B的方法
    public IProductB createProductB() {return new ProductB1();}
}
//具体工厂2
class ConcreteFactory2 implements IAbstractFactory {
    //造产品A的方法
    public IProductA createProductA() {return new ProductA2();}
    //造产品B的方法
    public IProductB createProductB() {return new ProductB2();}
}

//具体产品A1
class ProductA1 implements IProductA {
    //产品A1的自身业务方法
    public void doA() {
        //...
    }
}
//具体产品A2
class ProductA2 implements IProductA {
    //产品A2的自身业务方法
    public void doA() {
        //...
    }
}
//具体产品B1
class ProductB1 implements IProductB {
    //产品B1的自身业务方法
    public void doB() {
        //...
    }
}
//具体产品B2
class ProductB2 implements IProductB {
    //产品B2的自身业务方法
    public void doB() {
        //...
    }
}






