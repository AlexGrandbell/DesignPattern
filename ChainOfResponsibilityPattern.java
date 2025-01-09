//责任链模式
public class ChainOfResponsibilityPattern {
}

//抽象处理者
interface IHandler {
    void handleRequest(String request);
    void setNextHandler(IHandler handler);
}

//具体处理者1
class ConcreteHandler1 implements IHandler {
    private IHandler nextHandler;

    public void handleRequest(String request) {
        if (request.equals("1可以处理的请求")) {
            //处理请求...
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }

    public void setNextHandler(IHandler handler) {
        nextHandler = handler;
    }
}

//具体处理者2及其他处理者...


