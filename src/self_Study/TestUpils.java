package self_Study;

import utils.Utils;

public class TestUpils {
    public static void main(String[] args) {
     /*   *//*String b = Utils.inputString("请输入一个字符串：");
        int a = Utils.inputInt("请输入一个整数:");*//*
        char key = Utils.inputChar("请输入一个两位数字符");
       *//* System.out.println(a);
        System.out.println(b);*//*
        System.out.println(key);*/
        int[] arr = {1,3,5,9,3,4,6};
       Utils.printArr(arr);
       int[] a = Utils.sortArrBig(arr);
       Utils.printArr(a);
       int[] arrSmall = Utils.sortArrSmall(arr);
        Utils.printArr(arrSmall);

    }

}