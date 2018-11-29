package api.user;

import java.io.Serializable;

/**
 * 保存用户信息请求
 */
public class SaveUserInfoRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;
    /** 系统用户名 */
    private String username;
    /** 手机号 */
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
    /** 前端操作状态 */
    private String operStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus;
    }
}
