package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_product")
public class Product {

    @Id//该注释表示主键
    @GeneratedValue(strategy = GenerationType.AUTO)//表示自动递增
    private Integer id;

    private String productName;

    private Float price;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
