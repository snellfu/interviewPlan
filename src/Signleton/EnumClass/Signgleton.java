package Signleton.EnumClass;

/**
 * Created with IntelliJ IDEA.
 * User: hot
 * Date: 17/12/21
 * Time: 下午5:02
 */
public enum Signgleton {
    INSTANCE;

    private  String stirng = "";

    public String getStirng() {
        return stirng;
    }

    public void setStirng(String stirng) {
        this.stirng = stirng;
    }

    public void print(){
        setStirng("sss");
        System.out.println(getStirng());
    }

}
