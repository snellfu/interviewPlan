package Signleton.ThreadSafetyEffcient;

/**
 * 高效安全的单例模式实现类
 *
 */

public class Single {

    private Single() {
    }

    private static volatile Single signle = null;

    /**
     * @return
     */
    public static Single getInstance() {
        if (signle == null) {
            synchronized (Single.class) {
                if (signle == null) {
                    signle = new Single();
                }

            }
        }
        return signle;
    }
}
