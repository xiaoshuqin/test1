package kesun.entity.system;

import kesun.entity.AbsBusinessTreeNode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 肖淑琴 on 2018/5/21.
 */
public class Orders extends AbsBusinessTreeNode {
    private Employee employee = null; //员工（负责人）
    private Date date = new Date(); //下单时间
    private String number=""; //购买数量
    private String address=""; //送货地址
    private String payment=""; //付款方式
    private String money="";  //总金额
    private String status="";  //状态
    private CarUser carUser=null; //用户
    private Cars cars=null; //汽车信息

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(date);
        return dateString;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public CarUser getCarUser() {
        return carUser;
    }

    public void setCarUser(CarUser carUser) {
        this.carUser = carUser;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }
}
