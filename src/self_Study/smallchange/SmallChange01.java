package self_Study.smallchange;

import utils.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class SmallChange01 {
    public static void main(String[] args) {
        SmallChange01 smallChange01 = new SmallChange01();
        smallChange01.menu();
    }
    public void menu(){
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        Money money = new Money();
        do {
            System.out.println();
            System.out.println("********************零钱通*****************");
            System.out.println("         1.零钱明细           ");
            System.out.println("         2.收益入账           ");
            System.out.println("         3.消费           ");
            System.out.println("         4.退出系统           ");
            System.out.println("*******************************************");
            System.out.println("请输入你的选择：");
            char key = scanner.next().charAt(0);
            switch (key){
                case '1':
                    System.out.println("==================零钱明细===================");
                    System.out.println(money.getData());
                    break;
                case '2':
                    System.out.println("==================收益入账===================");
                    IntMoney intMoney = new IntMoney();
                    System.out.println(intMoney.intMoney(money));
                    break;
                case '3':
                    System.out.println("====================消费=====================");

                    OutMoney outMoney = new OutMoney();
                    System.out.println(outMoney.outMoney(money));
                    break;
                case '4':
                    Utils.exit(loop);
                    break;
                default:
                    System.out.println("选择有误");
                    break;
            }


        }while (loop);
        System.out.println("程序已退出");
    }


}
class Money{

    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {

        this.data += data;
    }

    private double balance  = 1000;
    private Date date = null;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
class OutMoney extends Money{
    private double out_money  ;

/**
*
* */
    public String outMoney(Money money){
         Date date = null;

         String b;
        Scanner a = new Scanner(System.in);
        System.out.print("消费项目：");
        String item = a.next();

        System.out.println("消费金额：");

        out_money = a.nextDouble();
        date = new Date();
        if (money.getBalance()>=out_money){
            money.setBalance(money.getBalance() - out_money);
            b=money.getData();

            money.setData(b = item +"： -" + out_money + "\t" + money.getSdf().format(date) + "\t余额"+money.getBalance()+"\n");

        return  item +"： -" + out_money + "\t" + money.getSdf().format(date) + "\t余额"+money.getBalance()+"\n";

    }else {
            return "你的余额不足!";
        }

    }

}
class IntMoney extends Money{
    private double int_money;

    public double getInt_money() {
        return int_money;
    }

    public void setInt_money(double int_money) {
        this.int_money = int_money;
    }
    public String intMoney(Money money){
        Date date = null;

        String b;
        Scanner a = new Scanner(System.in);
        System.out.print("收益入账：");
        date = new Date();
        int_money = a.nextDouble();

            money.setBalance(money.getBalance()  + int_money);
            b=money.getData();

            money.setData(b = "收益入账： +" + int_money + "\t" + money.getSdf().format(date) + "\t余额"+money.getBalance()+"\n");

            return "收益入账： +" + int_money + "\t" + money.getSdf().format(date) + "\t余额"+money.getBalance()+"\n";




    }
}