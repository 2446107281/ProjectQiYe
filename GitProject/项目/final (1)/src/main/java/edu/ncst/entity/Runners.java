package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name="runner_table")
public class Runners {
    @Id    //主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动递增
    private Integer runner_id;     //跑腿小哥id

    private String publicName;     //跑腿小哥用户名

    private Integer userName;     //跑腿小哥账号

    private String password;     //跑腿小哥密码

    private String contact;//跑腿小哥联系方式

    public Integer getRunner_id() {
        return runner_id;
    }

    public void setRunner_id(Integer runner_id) {
        this.runner_id = runner_id;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
