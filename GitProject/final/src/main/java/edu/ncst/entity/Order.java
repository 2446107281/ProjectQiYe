package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name="t_order")

public class Order {
    @Id    //主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动递增
    private Integer id;

    private Integer count;

    @ManyToOne(cascade = CascadeType.DETACH)//表示多对一的关系
    @JoinColumn(name = "product_id",nullable = true)
    private Product product;

    private Float price;

    @ManyToOne(cascade = CascadeType.DETACH)//表示多对一的关系
    @JoinColumn(name = "customer_id",nullable = true)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
