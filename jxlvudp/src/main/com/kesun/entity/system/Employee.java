package kesun.entity.system;

import kesun.entity.AbsSuperObject;

/**
 * Created by 肖淑琴 on 2018/5/15.
 */
public class Employee extends AbsSuperObject {
    private String password="";  //密码
    private String age="";  //年龄
    private String sex="";  //性别
    private String education=""; //学历
    private String post=""; //职位
    private String salary="";  //工资
    private String tel=""; //电话
    private String address=""; //地址


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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
}
