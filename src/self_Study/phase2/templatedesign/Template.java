package self_Study.phase2.templatedesign;
class Test{
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        aa.template();
        bb.template();
    }
}
abstract class Template {
    public abstract void job();
  public void template(){
      long start = System.currentTimeMillis();
      job();

      long end = System.currentTimeMillis();
      System.out.println("程序运行时间"+(end - start));
  }
}
class AA extends Template{
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 80000; i++) {
            num+=i;
        }
    }
}
class BB extends Template{
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 900000000; i++) {
            num+=i;
        }
    }
}