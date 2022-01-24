package self_Study.smallchange;

import java.util.Scanner;

public class SmallChange {
    public static void main(String[] args) {
        SmallChange smallChange = new SmallChange();

        smallChange.menu();
    }
    public void menu(){
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

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
                    break;
                case '2':
                    System.out.println("==================收益入账===================");
                    break;
                case '3':
                    System.out.println("====================消费=====================");
                    break;
                case '4':
                    System.out.println("你确定要退出吗？");
                    char ex = scanner.next().charAt(0);
                    if (ex == 'y'){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误");
                    break;
            }


        }while (loop);
        System.out.println("程序已退出");
    }


}
