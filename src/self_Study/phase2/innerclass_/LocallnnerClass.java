package self_Study.phase2.innerclass_;

import java.awt.desktop.OpenURIEvent;

public class LocallnnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.m1();

    }

}
class Outer01{
    private int n1 = 100;
      public void m1(){
          System.out.println("局部内部类");
          class Inner01{
              private int n1 = 800;
              public void f1(){
                  System.out.println("n1 = " + n1 + "外部类的n1" + Outer01.this.n1);
              }
          }
          Inner01 inner01 = new Inner01();
          inner01.f1();
      }
}