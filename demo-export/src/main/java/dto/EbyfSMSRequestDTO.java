package dto;

import java.io.Serializable;

/**
 * 光大短信平台发送参数
 */
public class EbyfSMSRequestDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 发送渠道
     */
    private String channel;
    /**
     * 发送类型
     */
    private String sms_type;
    /**
     * 目标手机号列表
     */
    private String[] mobile_phones;
    /**
     * 短信内容
     */
    private String sms_content;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSms_type() {
        return sms_type;
    }

    public void setSms_type(String sms_type) {
        this.sms_type = sms_type;
    }

    public String[] getMobile_phones() {
        return mobile_phones;
    }

    public void setMobile_phones(String[] mobile_phones) {
        this.mobile_phones = mobile_phones;
    }

    public String getSms_content() {
        return sms_content;
    }

    public void setSms_content(String sms_content) {
        this.sms_content = sms_content;
    }
}
