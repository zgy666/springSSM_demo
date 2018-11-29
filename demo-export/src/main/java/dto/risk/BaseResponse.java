package dto.risk;

import java.io.Serializable;

/**
 * 风控系统-公共参数-返回
 */
public class BaseResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 交易编号
     */
    private String TrxCode;
    /**
     * 版本号
     */
    private String Version;
    /**
     * 交易批次号
     */
    private String ReqSn;
    /**
     * 返回错误码
     */
    private String RetCode;
    /**
     * 返回错误原因
     */
    private String RetMsg;

    public String getTrxCode() {
        return TrxCode;
    }

    public void setTrxCode(String trxCode) {
        TrxCode = trxCode;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getReqSn() {
        return ReqSn;
    }

    public void setReqSn(String reqSn) {
        ReqSn = reqSn;
    }

    public String getRetCode() {
        return RetCode;
    }

    public void setRetCode(String retCode) {
        RetCode = retCode;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }
}
