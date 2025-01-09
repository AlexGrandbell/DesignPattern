//策略模式
public class StrategyPattern {
    public static void main(String[] args) {
        //创建具体策略对象
        IStrategy strategy = new ConcreteStrategy1();
        //创建上下文对象并将具体策略对象传入
        Context1 context = new Context1(strategy);
        //执行上下文对象的业务方法
        context.doWithAlgorithm();
    }
}

//抽象策略
interface IStrategy {
    void algorithm();
}

//具体策略
class ConcreteStrategy1 implements IStrategy {
    public void algorithm() {
        //...
    }
}
class ConcreteStrategy2 implements IStrategy {
    public void algorithm() {
        //...
    }
}

//上下文
class Context1 {
    private IStrategy strategy;
    //在构造时确定使用哪个策略
    public Context1(IStrategy strategy) {
        this.strategy = strategy;
    }
    //执行业务算法
    public void doWithAlgorithm() {
        strategy.algorithm();
        //可能有其他业务...
    }
}

