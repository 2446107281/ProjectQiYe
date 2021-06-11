package edu.ncst.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_numgoods")
public class Numgoods {

    @Id//该注释表示主键
    private Integer id;

    private Integer rcount;

    private float rsum;

    private String warehouse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRcount() {
        return rcount;
    }

    public void setRcount(Integer rcount) {
        this.rcount = rcount;
    }

    public float getRsum() {
        return rsum;
    }

    public void setRsum(float rsum) {
        this.rsum = rsum;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
}
