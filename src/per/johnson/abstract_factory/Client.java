package per.johnson.abstract_factory;

/**
 * Created by Johnson on 2018/6/7.
 */
public class Client {
    private Window window;
    private ScrollBar scrollBar;
    private WidgetFactory widgetFactory;
    public Client(WidgetFactory widgetFactory){
        this.widgetFactory = widgetFactory;
        this.window = this.widgetFactory.createWindow();
        this.scrollBar = this.widgetFactory.createScrollBar();
    }
    public void run(){
        window.show();
        scrollBar.roll();
    }

    public static void main(String[] args) {
        Client client = new Client(new PMWidgetFactory());
        client.run();
    }
}
