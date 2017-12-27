package Signleton.StaticInnerClass;

/**
 * Created with IntelliJ IDEA.
 * User: hot
 * Date: 17/12/21
 * Time: 下午3:42
 * 静态内部类实现,线程安全
 */
public class Signleton {

    private Signleton() {
    }

    private static class SignleHodle {
        private static final Signleton signleton = new Signleton();

    }

    public static Signleton getInstance() {
        return SignleHodle.signleton;
    }
}
