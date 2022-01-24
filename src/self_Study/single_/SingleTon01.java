package self_Study.single_;

    /**
     * 单例模式
     * 饿汉式
     */
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getGf();
    }
}

class GirlFriend {
    private String namee;
    private static GirlFriend gf = new GirlFriend("小小");

    private GirlFriend(String namee) {
        this.namee = namee;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public static GirlFriend getGf() {
        return gf;
    }

    public static void setGf(GirlFriend gf) {
        GirlFriend.gf = gf;
    }
}