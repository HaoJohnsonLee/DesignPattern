package per.johnson.proxy.static0;

/**
 * Created by Johnson on 2018/7/21.
 */
public class RealPlayer implements IPlayer{
    @Override
    public void play() {
        System.out.println("I'm playing game");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) { }
    }
}
