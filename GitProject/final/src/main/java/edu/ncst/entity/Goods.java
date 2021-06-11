package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_goods")
public class Goods {

    @Id//该注释表示主键
    private Integer id;

    private String name;

    private String type;

    private String sort;

    private String meas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getMeas() {
        return meas;
    }

    public void setMeas(String meas) {
        this.meas = meas;
    }
}
