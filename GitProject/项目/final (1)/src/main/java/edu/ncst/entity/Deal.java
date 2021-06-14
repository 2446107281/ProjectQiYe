package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name="deal_table")
public class Deal {
    @Id    //主键
    private Integer task_id;//任务id

    private Integer runner_id;     //跑腿小哥id

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getRunner_id() {
        return runner_id;
    }

    public void setRunner_id(Integer runner_id) {
        this.runner_id = runner_id;
    }
}
