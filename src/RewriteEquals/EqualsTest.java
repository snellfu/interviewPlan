package RewriteEquals;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: hot
 * Date: 17/12/28
 * Time: 上午10:23
 */
public class EqualsTest {

    /**
     * 重写equals方法的要求:
     * a.自反性：对于任何非空的x,x.equals(x)都应该返回true
     * b.对称性：对于任何引用x和y，当且仅当x.equals(y)返回true时，y.equals(x)也应该返回true
     * c.传递性：对于任何引用x,y,z，如果x.equals(y)返回true，y.equals(z)返回true，那么x.equals(z)也应该返回true
     * d.一致性：如果x和y的引用没有发生变化，那么反复调用x.equals(y)的结果应该相同
     * e.对于任何非空的引用x,x.equals(null)应该返回false
     */

    public EqualsTest(String id) {
        this.id = id;
    }

    private String id = null;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object otherObject) {
        //测试两个对象是否是同一个对象，是的话返回true
        if (this == otherObject) return true;
        //测试检测的对象是否为空，是就返回false
        if (otherObject == null) return false;
        //测试两个对象所属的类是否相同，否则返回false
        if (getClass() != otherObject.getClass()) return false;
        //对otherObject进行类型转换以便和类A的对象进行比较
        EqualsTest other = (EqualsTest) otherObject;
        //对于值可能为null的属性，检测时应使用Object的equals方法，不为null的可以直接使用==检测
        return other.id == id;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + id.hashCode();
        return result;

    }


    public static void main(String[] args) {
        EqualsTest n1 = new EqualsTest("1");
        EqualsTest n2 = new EqualsTest("2");

        Collection c = new HashSet();
        c.add(n1);
        System.out.println("------------");
        c.add(n2);
        System.out.println("------------");
        System.out.println(n1.equals(n2));
        System.out.println("------------");
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(c);

    }
}
