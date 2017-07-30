/**
 * Created by doupeipei on 17/7/30.
 */
public class TestVolatile {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        new Thread(t).run();

        while (true) {
            if (t.isFlag()) {
                System.out.println("----end-----");
                break;
            }
        }
    }
}
