package com.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息类
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 系统用户ID */
    private Long id;
    /** 系统用户名 */
    private String username;
    /** 手机号码 */
    private String mobile;
    /** 人行征信系统登录用户名 */
    private String rhLoginName;
    /** 人行征信系统登录密码 */
    private String rhLoginPassword;
    /** 人行征信验证码 */
    private String rhMessageCode;
    /** 身份证号 */
    private String idCard;
    /** 真实姓名 */
    private String realName;
    /** 社保用户ID */
    private String insureUserId;
    /** 社保状态ID */
    private String insureStatusId;
    /** 公积金用户ID */
    private String fundUserId;
    /** 公积金状态ID */
    private String fundStatusId;
    /** 状态 */
    private String status;
    /** 前端操作状态 */
    private String operStatus;
    /** 创建时间 */
    private Date created;
    /** 修改时间 */
    private Date modified;
    /** 是否有效 */
    private int yn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRhLoginName() {
        return rhLoginName;
    }

    public void setRhLoginName(String rhLoginName) {
        this.rhLoginName = rhLoginName;
    }

    public String getRhLoginPassword() {
        return rhLoginPassword;
    }

    public void setRhLoginPassword(String rhLoginPassword) {
        this.rhLoginPassword = rhLoginPassword;
    }

    public String getRhMessageCode() {
        return rhMessageCode;
    }

    public void setRhMessageCode(String rhMessageCode) {
        this.rhMessageCode = rhMessageCode;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getInsureUserId() {
        return insureUserId;
    }

    public void setInsureUserId(String insureUserId) {
        this.insureUserId = insureUserId;
    }

    public String getInsureStatusId() {
        return insureStatusId;
    }

    public void setInsureStatusId(String insureStatusId) {
        this.insureStatusId = insureStatusId;
    }

    public String getFundUserId() {
        return fundUserId;
    }

    public void setFundUserId(String fundUserId) {
        this.fundUserId = fundUserId;
    }

    public String getFundStatusId() {
        return fundStatusId;
    }

    public void setFundStatusId(String fundStatusId) {
        this.fundStatusId = fundStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }
}
