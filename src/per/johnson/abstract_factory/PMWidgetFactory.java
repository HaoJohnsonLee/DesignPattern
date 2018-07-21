package per.johnson.abstract_factory;

/**
 * Created by Johnson on 2018/6/7.
 */
public class PMWidgetFactory implements WidgetFactory{
    @Override
    public ScrollBar createScrollBar() {
        System.out.println("createScrollBar in PMWidgetFactory");
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        System.out.println("createWindow in PMWidgetFactory");
        return new PMWindow();
    }
}
