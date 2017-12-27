package Signleton.Hungry;

/**
 * Created with IntelliJ IDEA.
 * User: hot
 * Date: 17/12/21
 * Time: 下午3:56\
 * 饿汉式
 */
public class Signleton {
    private Signleton() {
    }

    private static final Signleton signleton = new Signleton();

    public static Signleton getInstance() {
        return signleton;
    }

}
