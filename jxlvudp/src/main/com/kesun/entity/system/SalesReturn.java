package kesun.entity.system;

import kesun.entity.AbsBusinessTreeNode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 肖淑琴 on 2018/5/24.
 */
public class SalesReturn extends AbsBusinessTreeNode {
    private Orders orders = null; //订单号
    private Employee employee = null; //退货负责人
    private Date return_time = new Date();  //退货时间
    private String return_resourse; //退货原因

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getReturn_time() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(return_time);
        return dateString;
    }

    public void setReturn_time(Date return_time) {
        this.return_time = return_time;
    }

    public String getReturn_resourse() {
        return return_resourse;
    }

    public void setReturn_resourse(String return_resourse) {
        this.return_resourse = return_resourse;
    }
}
