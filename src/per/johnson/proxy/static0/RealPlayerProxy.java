package per.johnson.proxy.static0;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Johnson on 2018/7/21.
 */
public class RealPlayerProxy implements IPlayer{
    private IPlayer player;
    public RealPlayerProxy(IPlayer player){
        this.player = player;
    }
    @Override
    public void play() {
        this.start();
        player.play();
        this.shutdown();
    }
    private void start(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("我在 "+formatter.format(new Date())+" 开始了游戏");
    }
    private void shutdown(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("我在 "+formatter.format(new Date())+" 结束了游戏");
    }
}
