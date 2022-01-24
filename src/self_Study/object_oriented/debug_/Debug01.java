package self_Study.object_oriented.debug_;

public class Debug01 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += i;
            System.out.println("i= "+i);
            System.out.println("sum= " + i);
        }
    }
}
