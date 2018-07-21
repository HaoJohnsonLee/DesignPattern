package per.johnson.singleton;

/**
 * Created by Johnson on 2018/5/26.
 */
/*public class Singleton {
    private static0 final int DEFAULT_LONG = 1;
    private static0 Singleton instance =new Singleton(DEFAULT_LONG);
    private int initLong;
    private Singleton(int initLong){ this.initLong = initLong;}
    public static0 Singleton getInstance(){
        return instance;
    }
}*/

public class Singleton {
    private static Singleton instance;
    private int initLong;

    private Singleton(int initLong) {
        this.initLong = initLong;
    }

    public static Singleton getInstance(int initLong) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton(initLong);
            }
        }
        return instance;
    }
}
