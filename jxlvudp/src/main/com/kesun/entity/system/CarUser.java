package kesun.entity.system;

import kesun.entity.AbsSuperObject;

import java.util.List;

/**
 * 用户实体类
 * Created by wph-pc on 2017/5/29.
 */
public class CarUser extends AbsSuperObject {
    private String realName="";//真实姓名
    private String password="";//登录密码
    private String sex="";//用户性别
    private String tel="";//用户电话
    private String address="";//用户地址
    private String email="";//E-mail
    private String qq="";//QQ

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

}
