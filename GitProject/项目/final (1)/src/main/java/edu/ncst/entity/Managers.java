package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name="manager_table")
public class Managers {
    @Id    //主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动递增
    private Integer manager_id;     //管理者id

    private String publicName;     //管理者用户名

    private Integer userName;     //管理者账号

    private String password;     //管理者密码

    private String contact;//管理者联系方式

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
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
