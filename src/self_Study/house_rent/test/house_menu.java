package self_Study.house_rent.test;

import com.sun.java.accessibility.util.EventID;
import self_Study.house_rent.house.HouseDao;
import self_Study.house_rent.housedao.House;
import utils.Utils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class house_menu {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        Util util = new Util();

        do {
            util.printMenu();

            char key = scanner.next().charAt(0);
            switch (key) {
                case '1':
                    util.addHouse();
                    break;
                case '2':
                    System.out.println("===================查找房屋==================");
                    System.out.print("请输入id:");
                    int id = scanner.nextInt();
                    util.findHouse(id);
                    break;
                case '3':
                    util.delterHouse();
                    break;
                case '4':
                    System.out.println("==================修改房屋信息===================");
                    util.updadeHouse();
                    break;
                case '5':

                    util.listHouse();

                    break;
                case '6':
                    loop = Utils.exit(loop);

                    break;
                default:
                    System.out.println("选择有误");
                    break;
            }


        } while (loop);
        System.out.println("程序已退出");
    }
}

class Util {
    private int id;

    public void printMenu() {
        System.out.println();
        System.out.println("********************房屋出租系统*****************");
        System.out.println("         1.新增房源           ");
        System.out.println("         2.查找房屋           ");
        System.out.println("         3.删除房屋        ");
        System.out.println("         4.修改房屋信息        ");
        System.out.println("         5.房屋列表        ");
        System.out.println("         6.退出系统           ");
        System.out.println("*******************************************");
        System.out.print("请输入你的选择：");
    }

    public void addHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================新增房源===================");
        System.out.print("请输入房屋编号：");
        int num = scanner.nextInt();
        System.out.print("请输入房东姓名：");
        String name = scanner.next();
        System.out.print("请输入联系电话：");
        String iphone = scanner.next();
        System.out.print("请输入房屋地址：");
        String adress = scanner.next();
        System.out.print("请输入租金：");
        double mone = scanner.nextDouble();
        System.out.print("请输入状态：");
        String state = scanner.next();
        House house = new House();
        house.setNum(num);
        house.setName(name);
        house.setPhone(iphone);
        house.setAdress(adress);
        house.setMoner(mone);
        house.setState(state);
        HouseDao houseDao = new HouseDao();
        try {
            houseDao.addHouse(house);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void listHouse() {
        System.out.println("=====================房屋列表======================");
        System.out.println("序号\t\t编号\t\t姓名\t\t电话\t\t\t\t地址\t\t租金\t\t状态");
        HouseDao houseDao = new HouseDao();
        try {
            List<House> houses = houseDao.findAllOrder();
            for (int i = 0; i < houses.size(); i++) {
                System.out.println(houses.get(i).getId()
                        + "\t\t" + houses.get(i).getNum() + "\t\t"
                        + houses.get(i).getName() + "\t\t" +
                        houses.get(i).getPhone() + "\t\t" +
                        houses.get(i).getAdress() + "\t\t" +
                        houses.get(i).getMoner() + "\t\t" +
                        houses.get(i).getState());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findHouse(int id) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("序号\t\t编号\t\t姓名\t\t电话\t\t\t\t地址\t\t租金\t\t状态");
        HouseDao houseDao = new HouseDao();

        try {
            List<House> houses = houseDao.findAbyid(id);
            for (int i = 0; i < houses.size(); i++) {
                System.out.println(houses.get(i).getId()
                        + "\t\t" + houses.get(i).getNum() + "\t\t"
                        + houses.get(i).getName() + "\t\t" +
                        houses.get(i).getPhone() + "\t\t" +
                        houses.get(i).getAdress() + "\t\t" +
                        houses.get(i).getMoner() + "\t\t" +
                        houses.get(i).getState());
            }
        } catch (SQLException e) {
            throw new RuntimeException("id不存在");
        }

    }

    public void delterHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================删除房屋信息==================");
        System.out.print("请输入id:");
        int id = scanner.nextInt();
        HouseDao houseDao = new HouseDao();
        try {
            houseDao.delOrderById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.listHouse();
    }

    public void updateHouseNum() {
        HouseDao houseDao = new HouseDao();
        House house = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.print("你要把num修改为：");
        int num = scanner.nextInt();

        try {
            houseDao.updateHouseNum(id, num);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateHouseName() {
        HouseDao houseDao = new HouseDao();
        House house = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.print("你要把姓名修改为：");
        String name = scanner.next();

        try {
            houseDao.updateHouseName(id, name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateHousePhone() {
        HouseDao houseDao = new HouseDao();
        House house = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.print("你要把电话修改为：");

        String phone = scanner.next();

        try {
            houseDao.updateHousePhone(id, phone);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateHouseAdress() {
        HouseDao houseDao = new HouseDao();
        House house = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.print("你要把地址修改为：");

        String adress = scanner.next();

        try {
            houseDao.updateHouseAdress(id, adress);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateHouseMoney() {
        HouseDao houseDao = new HouseDao();
        House house = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.print("你要把租金修改为：");

        double money = scanner.nextDouble();

        try {
            houseDao.updateHouseMoney(id, money);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateHouseState() {
        HouseDao houseDao = new HouseDao();
        House house = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.print("你要把电话修改为：");

        String state = scanner.next();

        try {
            houseDao.updateHouseState(id, state);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updadeHouse() {
        System.out.print("请输入你要修改的房屋信息id:");
        Scanner scanner = new Scanner(System.in);

        this.id = scanner.nextInt();
        this.findHouse(id);
        boolean loop =true;
        do {
            System.out.println("请选择你要修改的项目（1->编号 2->姓名 3->电话号码 4->地址  5->租金 6->房屋状态");
            char key = scanner.next().charAt(0);
            switch (key) {
                case '1':
                    this.updateHouseNum();
                    break;
                case '2':
                    this.updateHouseName();
                    break;
                case '3':
                    this.updateHousePhone();
                    break;
                case '4':
                    this.updateHouseAdress();
                    break;
                case '5':
                    this.updateHouseMoney();
                    break;
                case '6':
                    this.updateHouseState();
                    break;
                case '7':
                    System.out.println("你确定要退出吗？y/n");
                    char ex = scanner.next().charAt(0);
                    if (ex == 'y') {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入错误请重新输入！！");
                    break;

            }
        }while (loop);


    }


}
