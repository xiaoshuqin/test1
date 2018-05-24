package kesun.entity.system;

import kesun.entity.AbsBusinessTreeNode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 销售表
 * Created by 付佳鸿 on 2018/5/23.
 */
public class Sell extends AbsBusinessTreeNode {
    private Date sale_time = new Date();//销售日期
    private String counts="";//销售量
    private String sale_counts="";//销售总额
    private Cars cars = null;//汽车信息（外键）
    private CarUser car_users=null;//用户编号（外键）

    public String getSale_time() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(sale_time);
        return dateString;
    }

    public void setSale_time(Date sale_time) {
        this.sale_time = sale_time;
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getSale_counts() {
        return sale_counts;
    }

    public void setSale_counts(String sale_counts) {
        this.sale_counts = sale_counts;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public CarUser getCar_users() {
        return car_users;
    }

    public void setCar_users(CarUser car_users) {
        this.car_users = car_users;
    }
}
