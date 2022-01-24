package self_Study.static_;


import utils.Utils;

class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        Stu tom1 = new Stu("tom1");
        tom.pay(100);
        tom1.pay(200);
        System.out.println(tom.fee);
        String test = Utils.inputString("请输入一句话");
        System.out.println(test);

    }
}
class Stu{
    public static double fee;
    public String name;

    public Stu(String name) {
        this.name = name;
    }
    public void pay(double monery){
        fee+=monery;

    }
    public static void Stativ_Method(){
        Stu name = new Stu("name");
        System.out.println(name.name);

    }
}
