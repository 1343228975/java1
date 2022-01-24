package utils;

import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 字符串输入
     **/
    public static String inputString(String types) {
        System.out.print(types);
        return scanner.next();
    }

    /**
     * 整数输入
     */
    public static int inputInt(String types) {
        System.out.print(types);
        return scanner.nextInt();
    }

    /**
     * 字符输入
     */

    public static char inputChar(String types) {
        System.out.print(types);
        return scanner.next().charAt(0);
    }

    /**
     * 数组从大到小逆向排序
     */
    public static int[] sortArrBig(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                int temp;
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 数组从小到大正向排序排序
     */
    public static int[] sortArrSmall(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 打印数组
     */
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个元素 ：" + arr[i]);
        }
        System.out.println();

    }

    /**
     * 退出菜单
     */
    public static boolean exit(boolean loop) {
        loop = true;
        System.out.println("退出-->y" +
                "不退出-->n");
        System.out.print("请输入你的选择：");
        do {
            char key = inputChar("");
            if (key != 'y' && key != 'n') {
                System.out.println("输入错误！！！");
                System.out.print("请重新输入：");
                System.out.println();

            }
            if (key == 'y') {
                loop = false;
            }
            if (key == 'n') {
                return true;
            }

        } while (loop);
     return loop;
    }

}
