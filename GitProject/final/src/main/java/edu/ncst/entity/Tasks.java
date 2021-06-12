package edu.ncst.entity;

import javax.persistence.*;
import java.io.PrintWriter;

@Entity
@Table(name="task_table")
public class Tasks {
    private Integer task_id;//任务id
    private String taskProfile;//任务概要
    private String taskConten;//任务内容
    private Integer taskCost;//任务金额
    private Integer taskState;//任务状态

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

    public String getTaskConten() {
        return taskConten;
    }

    public void setTaskConten(String taskConten) {
        this.taskConten = taskConten;
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
}
