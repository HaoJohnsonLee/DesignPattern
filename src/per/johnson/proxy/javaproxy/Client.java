package per.johnson.proxy.javaproxy;

import per.johnson.proxy.static0.IPlayer;
import per.johnson.proxy.static0.RealPlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Johnson on 2018/7/21.
 */
public class Client {
    public static void main(String[] args) {
        RealPlayer realPlayer = new RealPlayer();
        InvocationHandler handler = new DynamicProxy(realPlayer);
        IPlayer player = (IPlayer) Proxy.newProxyInstance(handler.getClass().getClassLoader(),realPlayer.getClass().getInterfaces(),handler);
        System.out.println(player.getClass().getName());
        player.play();
    }
}
