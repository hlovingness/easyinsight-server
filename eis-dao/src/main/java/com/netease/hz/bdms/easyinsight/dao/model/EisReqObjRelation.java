package com.netease.hz.bdms.easyinsight.dao.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "eis_req_obj_relation")
public class EisReqObjRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "obj_id")
    private Long objId;

    @Column(name = "req_pool_id")
    private Long reqPoolId;

    @Column(name = "parent_obj_id")
    private Long parentObjId;

    @Column(name = "terminal_id")
    private Long terminalId;

    @Column(name = "app_id")
    private Long appId;

    @Column(name = "create_email")
    private String createEmail;

    @Column(name = "create_name")
    private String createName;

    @Column(name = "update_email")
    private String updateEmail;

    @Column(name = "update_name")
    private String updateName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return obj_id
     */
    public Long getObjId() {
        return objId;
    }

    /**
     * @param objId
     */
    public void setObjId(Long objId) {
        this.objId = objId;
    }

    /**
     * @return req_pool_id
     */
    public Long getReqPoolId() {
        return reqPoolId;
    }

    /**
     * @param reqPoolId
     */
    public void setReqPoolId(Long reqPoolId) {
        this.reqPoolId = reqPoolId;
    }

    /**
     * @return parent_obj_id
     */
    public Long getParentObjId() {
        return parentObjId;
    }

    /**
     * @param parentObjId
     */
    public void setParentObjId(Long parentObjId) {
        this.parentObjId = parentObjId;
    }

    public Long getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Long terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * @return app_id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * @return create_email
     */
    public String getCreateEmail() {
        return createEmail;
    }

    /**
     * @param createEmail
     */
    public void setCreateEmail(String createEmail) {
        this.createEmail = createEmail;
    }

    /**
     * @return create_name
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * @param createName
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * @return update_email
     */
    public String getUpdateEmail() {
        return updateEmail;
    }

    /**
     * @param updateEmail
     */
    public void setUpdateEmail(String updateEmail) {
        this.updateEmail = updateEmail;
    }

    /**
     * @return update_name
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * @param updateName
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}