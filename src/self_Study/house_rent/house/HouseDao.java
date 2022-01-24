package self_Study.house_rent.house;


import ch13.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import self_Study.house_rent.housedao.House;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HouseDao {
    public void addHouse(House house) throws SQLException {

        String sql = "insert into house(num,name,phone,adress,moner,state) values(?,?,?,?,?,?)";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql, house.getNum(), house.getName(), house.getPhone(), house.getAdress(), house.getMoner(), house.getState());
        {
            if (row == 0) {
                throw new RuntimeException();
            }
        }
    }

    public List<House> findAllOrder() throws SQLException {
        //1.创建sql
        String sql = "select * from house ";
        //2.创建QueryRunner对象
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        //3.返回QueryRunner对象query()方法的查询结果
        return runner.query(sql, new ResultSetHandler<List<House>>() {
            public List<House> handle(ResultSet rs) throws SQLException {
                //创建订单集合
                List<House> houses = new ArrayList<House>();
                //循环遍历订单和用户信息
                while (rs.next()) {
                    House house = new House();
                    house.setId(rs.getInt("house.id"));
                    house.setNum(rs.getInt("house.num"));
                    house.setName(rs.getString("house.name"));
                    house.setPhone(rs.getString("house.phone"));
                    house.setAdress(rs.getString("house.adress"));
                    house.setMoner(rs.getDouble("house.moner"));
                    house.setState(rs.getString("house.state"));
                    houses.add(house);


                }
                return houses;
            }
        });
    }

    public List<House> findAbyid(int id) throws SQLException {
        //1.创建sql
        String sql = "SELECT * FROM house WHERE id=" + id;
        //2.创建QueryRunner对象
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        //3.返回QueryRunner对象query()方法的查询结果
        return runner.query(sql, new ResultSetHandler<List<House>>() {
            public List<House> handle(ResultSet rs) throws SQLException {
                //创建订单集合
                List<House> houses = new ArrayList<House>();
                //循环遍历订单和用户信息
                while (rs.next()) {
                    House house = new House();
                    house.setId(rs.getInt("house.id"));
                    house.setNum(rs.getInt("house.num"));
                    house.setName(rs.getString("house.name"));
                    house.setPhone(rs.getString("house.phone"));
                    house.setAdress(rs.getString("house.adress"));
                    house.setMoner(rs.getDouble("house.moner"));
                    house.setState(rs.getString("house.state"));
                    houses.add(house);


                }
                return houses;
            }
        });
    }
    public void delOrderById(int id) throws SQLException {
        String sql = "delete from house where id=?";
        QueryRunner runner = new QueryRunner();
        runner.update(DataSourceUtils.getConnection(), sql, id);
    }
    public void updateHouseNum(int id,int num) throws SQLException{
        House house = new House();

        String sql = "update house set num= ? where id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql, num,id);
        System.out.println(runner.update(sql,num, id));





    }
    public void updateHouseName(int id,String name) throws SQLException{
        House house = new House();

        String sql = "update house set name= ? where id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql, name,id);
        System.out.println(runner.update(sql,name, id));





    }
    public void updateHousePhone(int id,String phone) throws SQLException{
        House house = new House();

        String sql = "update house set phone= ? where id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql, phone,id);
        System.out.println(runner.update(sql,phone, id));





    }
    public void updateHouseAdress(int id,String adress) throws SQLException{
        House house = new House();

        String sql = "update house set adress= ? where id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql, adress,id);
        System.out.println(runner.update(sql,adress, id));





    }
    public void updateHouseMoney(int id,double money) throws SQLException{
        House house = new House();

        String sql = "update house set moner= ? where id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql, money,id);
        System.out.println(runner.update(sql,money, id));





    }
    public void updateHouseState(int id,String state) throws SQLException{
        House house = new House();

        String sql = "update house set state= ? where id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql, state,id);
        System.out.println(runner.update(sql,state, id));





    }
}



