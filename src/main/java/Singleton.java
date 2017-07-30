/**
 * Created by doupeipei on 17/7/30.
 */
public class Singleton {
    private static volatile Singleton instance = null; // 加入volatile后,可保证线性安全
    //private static Singleton instance = null; // 由于会发生执行重排,2个线性竞争时,可能会造就不是单例, 这个不是线性安全

    private Singleton() {
    }

    public static Singleton getInstance() { // 比synchronized修饰方法性能更好
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
