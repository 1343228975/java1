package self_Study.phase2.interface_;
/**
 * 接口的三大定义方法
 * JDK8.0后版本
 * */
public interface Interface02 {
    public void hi();
    default public void cry(){
        System.out.println("cry...");
    }
    public static void run(){
        System.out.println("run...");
    }
}
