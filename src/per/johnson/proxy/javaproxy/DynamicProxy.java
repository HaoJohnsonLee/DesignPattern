package per.johnson.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Johnson on 2018/7/21.
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;
    public DynamicProxy(Object obj){
        this.object = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        start();
        method.invoke(object,args);
        shutdown();
        return null;
    }
    private void start(){
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        System.out.println("我在 "+formatter.format(new Date())+" 开始了游戏");
    }
    private void shutdown(){
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        System.out.println("我在 "+formatter.format(new Date())+" 结束了游戏");
    }
}
