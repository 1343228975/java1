package self_Study.phase2.interface_;

/**
 * 演示接口的多太数组
 */

class Test {
    public static void main(String[] args) {
        Interface03[] interface03s = new Interface03[2];
        interface03s[0]= new Camera1();
        interface03s[1] = new Phone1();
        for (int i = 0; i < interface03s.length; i++) {
            interface03s[i].work();
            if (interface03s[i] instanceof Phone1){
                ((Phone1)interface03s[i]).hi();
            }
        }
    }

}

public interface Interface03 {
    public void work();
}

class Phone1 implements Interface03 {

    @Override
    public void work() {
        System.out.println("手机正在工作中...");
    }

    public void hi() {
        System.out.println("手机可以打电话...");
    }
}

class Camera1 implements Interface03 {
    @Override
    public void work() {
        System.out.println("相机正在工作中..");
    }
}