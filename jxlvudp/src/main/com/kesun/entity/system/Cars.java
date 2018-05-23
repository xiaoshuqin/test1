package kesun.entity.system;

import kesun.entity.AbsBusinessTreeNode;
import kesun.entity.web.WebSite;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 付佳鸿 on 2018/5/16.
 */
public class Cars extends AbsBusinessTreeNode {
    private String color="";//颜色
    private Date product_date = new Date();//出厂日期
    private String purchase_price="";//进价
    private String sale_price="";//出售价格
    private Vender vender=null;//厂家

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProduct_date() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(product_date);
        return dateString;
    }

    public void setProduct_date(Date product_date) {
        this.product_date = product_date;
    }

    public String getPurchase_price() {

        return purchase_price;
    }

    public void setPurchase_price(String purchase_price) {
        this.purchase_price = purchase_price;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public Vender getVender() {
        return vender;
    }

    public void setVender(Vender vender) {
        this.vender = vender;
    }


}
