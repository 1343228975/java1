package self_Study.phase2.interface_;
class Test01{
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Competer competer = new Competer();
        competer.work(phone);

    }
}
class Competer{
    public void work(Inter01 inter01){
        inter01.satrt();
        inter01.stop();
    }
}
interface Inter01 {
    public abstract void satrt();

    public abstract void stop();

}
class Phone implements Inter01{
    @Override
    public void satrt() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作...");

    }
}
class Camera implements Inter01{
    @Override
    public void satrt() {
        System.out.println("相机开始了工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止了工作...");

    }
}