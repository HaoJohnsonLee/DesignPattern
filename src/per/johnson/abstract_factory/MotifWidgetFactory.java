package per.johnson.abstract_factory;

/**
 * Created by Johnson on 2018/6/7.
 */
public class MotifWidgetFactory implements WidgetFactory{
    @Override
    public ScrollBar createScrollBar() {
        System.out.println("createScrollBar in MotifWidgetFactory");
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        System.out.println("createWindow in MotifWidgetFactory");
        return new MotifWindow();
    }
}
