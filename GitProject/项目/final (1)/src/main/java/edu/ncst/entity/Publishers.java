package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name="publisher_table")
public class Publishers {
    @Id    //主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动递增
    private Integer publisher_id;     //发布者id

    private String publicName;     //发布者用户名

    private Integer userName;     //发布者账号

    private String password;     //发布者密码

    private String contact;//发布者联系方式

    public Integer getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(Integer publisher_id) {
        this.publisher_id = publisher_id;
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
