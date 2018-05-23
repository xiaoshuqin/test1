package kesun.entity.system;

import kesun.entity.AbsBusinessTreeNode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 付佳鸿 on 2018/5/21.
 */
public class Store extends AbsBusinessTreeNode {
    private String counts;//库存量
    private Date entry_time;//入库时间
    private Date out_time;//出库时间
    private Cars cars=null;//汽车表（外键）
    private Employee employee=null;//员工表（外键）

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getEntry_time() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(entry_time);
        return dateString;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public String getOut_time() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(out_time);
        return dateString;
    }

    public void setOut_time(Date out_time) {
        this.out_time = out_time;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
