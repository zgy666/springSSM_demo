package api.risk;

import java.io.Serializable;
import java.util.Map;

/**
 * 融360风控请求对象
 */
public class RiskRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 接口名称 */
    private String method;
    /** 签名 */
    private String sign;
    /** 签名类型 目前只支持RSA */
    private String signType;
    /** biz_data加密方式 0：不加密 1：DES加密 */
    private String bizEnc;
    /** bizEnc=1时 用RSA加密后的DES秘钥 */
    private String desKey;
    /** 应用唯一id */
    private String appId;
    /** 接口版本 */
    private String version;
    /** 相应格式 只支持JSON */
    private String format;
    /** 时间戳 */
    private String timestamp;
    /** 回调URL */
    private String returnUrl;
    /** 业务数据 */
    private Map<String,String> bizData;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getBizEnc() {
        return bizEnc;
    }

    public void setBizEnc(String bizEnc) {
        this.bizEnc = bizEnc;
    }

    public String getDesKey() {
        return desKey;
    }

    public void setDesKey(String desKey) {
        this.desKey = desKey;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public Map<String, String> getBizData() {
        return bizData;
    }

    public void setBizData(Map<String, String> bizData) {
        this.bizData = bizData;
    }
}
