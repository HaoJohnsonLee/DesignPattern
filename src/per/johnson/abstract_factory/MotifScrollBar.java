package per.johnson.abstract_factory;

/**
 * Created by Johnson on 2018/6/7.
 */
public class MotifScrollBar implements ScrollBar{
    @Override
    public void roll() {
        System.out.println("MotifScrollBar rolling");
    }
}
