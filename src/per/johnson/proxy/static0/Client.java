package per.johnson.proxy.static0;

/**
 * Created by Johnson on 2018/7/21.
 */
public class Client {
    public static void main(String[] args) {
        RealPlayer player = new RealPlayer();
        RealPlayerProxy proxy = new RealPlayerProxy(player);
        proxy.play();
    }
}
