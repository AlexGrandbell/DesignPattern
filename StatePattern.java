//状态模式
public class StatePattern {
    public static void main(String[] args) {
        //创建环境
        Context context = new Context();
        //处理业务，状态会自动切换
        context.handle();
        context.handle();
        //......
    }
}

//抽象状态
interface IState {
    //状态对应的处理
    void handle();
}

//具体状态A
class ConcreteStateA implements IState {
    private Context context;//绑定环境
    public ConcreteStateA(Context context) {this.context = context;}
    public void setCurrentState(Context context) {this.context = context;}
    public void handle() {
        //...
        if (/*满足条件*/true) {//可能会使用switch
            //其他业务...
            //状态切换，主动修改环境的状态
            context.setCurrentState(context.getConcreteStateB());
        }
    }
}
//具体状态B同理
class ConcreteStateB implements IState {
    private Context context;//绑定环境
    public ConcreteStateB(Context context) {this.context = context;}
    public void setCurrentState(Context context) {this.context = context;}
    public void handle() {
        //...
        if (/*满足条件*/true) {
            //其他业务...
            //状态切换，主动修改环境的状态
            context.setCurrentState(context.getConcreteStateA());
        }
    }
}

//环境
class Context {
    private IState currentState;
    private IState presetStateA;    //预设具体状态A
    private IState presetStateB;    //预设具体状态B
    //构造函数
    public Context() {
        //初始化状态
        this.presetStateA = new ConcreteStateA(this);
        this.presetStateB = new ConcreteStateB(this);
        //设置初始状态
        this.currentState = presetStateA;
    }

    //获取具体状态A，这个函数不是人来调用，而是具体状态来调用切换
    public IState getConcreteStateA() {return presetStateA;}
    //获取具体状态B，这个函数不是人来调用，而是具体状态来调用切换
    public IState getConcreteStateB() {return presetStateB;}
    //设置当前状态，这个函数不是人来调用，而是具体状态来调用切换
    public void setCurrentState(IState currentState) {this.currentState = currentState;}

    //处理业务
    public void handle() {
        //如果要切换状态，则会自动转换
        currentState.handle();
    }
}



