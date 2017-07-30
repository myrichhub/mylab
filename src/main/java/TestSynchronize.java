/**
 * Created by doupeipei on 17/7/30.
 */
public class TestSynchronize {
    public static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread0 t0 = new Thread0();
        Thread1 t1 = new Thread1();
        t0.start();
        Thread.sleep(2000);
        t1.start();
    }



    static class Thread0 extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                try {
                    System.out.println("线程0获得锁");
                    object.wait();
                    System.out.println("线程0继续执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程0继续其他执行");
        }
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                object.notify();
                System.out.println("线程1释放了锁");
            }
        }
    }
}

