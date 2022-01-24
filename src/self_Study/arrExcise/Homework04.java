package self_Study.arrExcise;



import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;

import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        A03 a = new A03();
        String[] arr3 = a.assignment();
        String[] carr = a.copy(arr3);
        System.out.println("================旧数组==============");
        a.printArr(arr3);
        System.out.println("================新数组==============");
        a.printArr(carr);
        /*char key;
        boolean loop = true;
        while (loop) {
            System.out.println("n->创建数组");
            System.out.println("a->插入数据");
            System.out.println("c->复制数组");
            System.out.println("p->显示数组");
            System.out.println("e->退出");
            key = input.next().charAt(0);
            switch (key) {

                case 'n':
                     String[] arr3 = a.assignment();
                    break;

                case 'c':
                    String[] carr = a.copy(arr3);
                    System.out.println("=========旧数组=========");
                    a.printArr(arr3);
                    System.out.println("=========新数组=========");
                    a.printArr(carr);
                    break;
                case 'p':
                   *//* System.out.println("显示：1->老数组  2->新数组");
                    char l = input.next().charAt(0);
                    if (l == 1) {
                        a.printArr(arr3);
                    } else if (l == 2) {
                        a.printArr(carr);
                    } else {
                        System.out.println("输入错误！！");
                    }*//*
                    break;
                case 'e':
                    loop = false;
                    break;
                default:
                    break;
            }

        }*/
    }

}

class A03 {
    public String[] copy(String[] arr) {
        if (arr != null) {
            String[] arr1 = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            return arr1;
        } else {
            return null;
        }
    }

    public void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }



    public String[] assignment() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int length = input.nextInt();
        String[] arr2 = new String[length];

        for (int i = 0; i < arr2.length; i++) {

            System.out.println("请输入第" + (i + 1) + "个元素，总元素（" + (arr2.length ) + "个)");
            arr2[i] = input.next();
        }
        return arr2;
    }
}
