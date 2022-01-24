package self_Study.object_oriented.reweirt;

public class Student extends Person{
    private  int ID;
    private  String score;

    public Student(String name, int age, int ID, String score) {
        super(name, age);
        this.ID = ID;
        this.score = score;
    }

    public Student() {
    }
    public String say(){
        return super.say()+"  "+"id："+ID+"  " + "分数： " + score;
    }
}
