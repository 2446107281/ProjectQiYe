package edu.ncst.entity;

import javax.persistence.*;
import java.io.PrintWriter;

@Entity
@Table(name="task_table")
public class Tasks {
    @Id    //主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动递增
    private Integer task_id;//任务id

    private String taskProfile;//任务概要

    private String taskContent;//任务内容

    private Integer taskCost;//任务金额

    private Integer taskState;//任务状态

    private Integer taskPublicState;//任务发布状态

    private Integer publisher_id;//发布者

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public String getTaskProfile() {
        return taskProfile;
    }

    public void setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public Integer getTaskCost() {
        return taskCost;
    }

    public void setTaskCost(Integer taskCost) {
        this.taskCost = taskCost;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public Integer getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(Integer publisher_id) {
        this.publisher_id = publisher_id;
    }

    public Integer getTaskPublicState() {
        return taskPublicState;
    }

    public void setTaskPublicState(Integer taskPublicState) {
        this.taskPublicState = taskPublicState;
    }
}
