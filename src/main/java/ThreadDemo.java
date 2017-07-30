/**
 * Created by doupeipei on 17/7/30.
 */
public class ThreadDemo implements Runnable{
    //private volatile boolean flag = false;
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        flag = true;
        System.out.println("flag="+flag);
    }
}
