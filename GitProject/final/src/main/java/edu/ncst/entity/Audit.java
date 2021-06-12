package edu.ncst.entity;

import javax.persistence.*;

@Entity
@Table(name="audit_table")
public class Audit {
    @Id    //主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动递增
    private Integer task_id;//任务id

    private Integer manager_id;     //管理者id

    private Integer taskPublicState;  //任务发布状态

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public Integer getTaskPublicState() {
        return taskPublicState;
    }

    public void setTaskPublicState(Integer taskPublicState) {
        this.taskPublicState = taskPublicState;
    }
}
