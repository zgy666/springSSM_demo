package dto;

import java.io.Serializable;

/**
 * 光大短信平台返回参数
 */
public class EbyfSMSResponseDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 响应吗
     */
    private String resp_code;

    /**
     * 响应信息
     */
    private String resp_message;

    public String getResp_code() {
        return resp_code;
    }

    public void setResp_code(String resp_code) {
        this.resp_code = resp_code;
    }

    public String getResp_message() {
        return resp_message;
    }

    public void setResp_message(String resp_message) {
        this.resp_message = resp_message;
    }
}
