//命令模式
public class CommandPattern {
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        ICommand command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        //执行方法
        invoker.executeCommand();
    }
}

//命令接口
interface ICommand {
    void execute();
}

//具体命令
class ConcreteCommand implements ICommand {
    //持有一个对接收者对象的引用
    private Receiver receiver;
    //构造函数传递或生成接收者
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    //命令对象的执行方法
    public void execute() {
        //调用接收者的相关方法来执行具体逻辑
        receiver.action();
    }
}

//接收者
class Receiver {
    //真正执行命令相应的操作
    public void action() {
        //...
    }
}

//调用者
class Invoker {
    private ICommand command;
    //构造函数传递命令对象
    //public Invoker(ICommand command) {...    }

    //修改命令对象
    public void setCommand(ICommand command) {this.command = command;}
    //业务方法，用于调用命令类的execute方法
    public void executeCommand() {command.execute();}
}

