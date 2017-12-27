package Signleton;

import Signleton.EnumClass.Signgleton;
import Signleton.Hungry.Signleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: hot
 * Date: 17/12/21
 * Time: 下午3:59
 */
public class Main {


    private static final ExecutorService threadPool = Executors.newFixedThreadPool(4);


    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            final int index = i;

            threadPool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        //System.out.println(Signleton.EnumClass.Signgleton.INSTANCE);
                        Signgleton signgleton = Signgleton.INSTANCE;
                        signgleton.print();
                       // System.out.println(signleton.Hungry.Signleton.getInstance());
                       //System.out.println(signleton.StaticInnerClass.Signleton.getInstance());
                        //System.out.println(Single.getInstance());
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }


}
