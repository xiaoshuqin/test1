package kesun.entity.system;

import kesun.entity.AbsSuperObject;

/**
 * Created by 付佳鸿 on 2018/5/16.
 */
public class Vender extends AbsSuperObject{
    private String tel="";//电话号码
    private String address="";//地址

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
