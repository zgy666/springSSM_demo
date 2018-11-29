package dto.risk;

import java.io.Serializable;


public class OtherMessageJSONData implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private String RHUserId;
    /**
     * 人行征信登录名
     */
    private String RHLoginName;
    /**
     * 人行征信验证码
     */
    private String RHMessageCode;
    /**
     * 社保用户id
     */
    private String InsureUserId;
    /**
     * 社保状态id
     */
    private String InsureStatusId;
    /**
     * 公积金用户id
     */
    private String FundUserId;
    /**
     * 公积金状态id
     */
    private String FundStatusId;


    public String getRHUserId() {
        return RHUserId;
    }

    public void setRHUserId(String RHUserId) {
        this.RHUserId = RHUserId;
    }

    public String getRHLoginName() {
        return RHLoginName;
    }

    public void setRHLoginName(String RHLoginName) {
        this.RHLoginName = RHLoginName;
    }

    public String getRHMessageCode() {
        return RHMessageCode;
    }

    public void setRHMessageCode(String RHMessageCode) {
        this.RHMessageCode = RHMessageCode;
    }

    public String getInsureUserId() {
        return InsureUserId;
    }

    public void setInsureUserId(String insureUserId) {
        InsureUserId = insureUserId;
    }

    public String getInsureStatusId() {
        return InsureStatusId;
    }

    public void setInsureStatusId(String insureStatusId) {
        InsureStatusId = insureStatusId;
    }

    public String getFundUserId() {
        return FundUserId;
    }

    public void setFundUserId(String fundUserId) {
        FundUserId = fundUserId;
    }

    public String getFundStatusId() {
        return FundStatusId;
    }

    public void setFundStatusId(String fundStatusId) {
        FundStatusId = fundStatusId;
    }
}
