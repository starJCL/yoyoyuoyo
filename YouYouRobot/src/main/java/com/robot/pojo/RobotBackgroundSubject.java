package com.robot.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (RobotBackgroundSubject)后台课程表
 *
 * @author makejava
 * @since 2022-03-06 12:03:55
 */
public class RobotBackgroundSubject implements Serializable {
    private static final long serialVersionUID = -15347166004786810L;
    /**
     * 课程表id
     */
    private Integer sid;
    /**
     * 课程名称
     */
    private String sname;
    /**
     * 课程介绍
     */
    private String introduce;
    /**
     * 是否推荐  0代表推荐 1代表不推荐
     */
    private Integer recommend;
    /**
     * 课程图片
     */
    private String picture;
    /**
     * 创建人
     */
    private String createp;
    /**
     * 创建时间
     */
    private Date createt;
    /**
     * 备用字段1
     */
    private String backupone;
    /**
     * 备用字段2
     */
    private String backuptwo;
    /**
     * 备用字段3
     */
    private String backupthree;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCreatep() {
        return createp;
    }

    public void setCreatep(String createp) {
        this.createp = createp;
    }

    public Date getCreatet() {
        return createt;
    }

    public void setCreatet(Date createt) {
        this.createt = createt;
    }

    public String getBackupone() {
        return backupone;
    }

    public void setBackupone(String backupone) {
        this.backupone = backupone;
    }

    public String getBackuptwo() {
        return backuptwo;
    }

    public void setBackuptwo(String backuptwo) {
        this.backuptwo = backuptwo;
    }

    public String getBackupthree() {
        return backupthree;
    }

    public void setBackupthree(String backupthree) {
        this.backupthree = backupthree;
    }

}

