import java.util.List;

//组合模式
public class CompositePattern {
    //创建简单的树
    public static void main(String[] args) {
        //根节点
        IComponent root = new Composite();
        //第一层
        IComponent leaf1_1 = new Leaf();
        IComponent branch1_1 = new Composite();
        IComponent branch1_2 = new Composite();
        //添加到第一层
        root.add(leaf1_1);
        root.add(branch1_1);
        root.add(branch1_2);
        //继续构造...
    }
}

//抽象组件
interface IComponent {
    void operation();//业务方法

    void add(IComponent c);//增加孩子节点
    void remove(IComponent c);//删除孩子节点
    IComponent getChild(int num);//获取孩子节点
}

//叶子
class Leaf implements IComponent {
    //叶子节点的业务方法
    public void operation() {
        //...
    }

    //其他方法也必须实现
    public void add(IComponent c) {}
    public void remove(IComponent c) {}
    public IComponent getChild(int i) {
        return null;
    }
}

//组合节点
class Composite implements IComponent {
    private List<IComponent> children;//存储孩子节点

    //组合节点的业务方法
    public void operation() {
        //...
    }

    //增加孩子节点
    public void add(IComponent c) {
        //children.add(c);
    }
    //删除孩子节点
    public void remove(IComponent c) {
        //children.remove(c);
    }
    //获取孩子节点
    public IComponent getChild(int num) {
       return children.get(num);
    }
}


