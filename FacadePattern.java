//外观模式
public class FacadePattern {
    public static void main(String[] args) {
        //创建外观对象
        Facade facade = new Facade();
        //调用外观对象的接口方法
        facade.doA();
        facade.doB();
        facade.doC();
    }
}

//子系统A
class SubSystemA {
    public void doA() {
        //业务实现代码
    }
}
//子系统B
class SubSystemB {
    public void doB() {
        //业务实现代码
    }
}
//子系统C
class SubSystemC {
    public void doC() {
        //业务实现代码
    }
}

//外观
class Facade {
    //引用各个子系统
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    //对外接口，仅调用，不改变
    public void doA() {subSystemA.doA();}
    public void doB() {subSystemB.doB();}
    public void doC() {subSystemC.doC();}
}

