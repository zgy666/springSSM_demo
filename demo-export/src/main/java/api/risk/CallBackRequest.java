package api.risk;

import java.io.Serializable;

/**
 * 融360回调请求
 */
public class CallBackRequest implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 模块名称 insure：社保
     */
    private String module;
    /**
     * 用户id
     */
    private String user_id;
    /**
     * 抓取状态 1=抓取中，2=抓取成功，3=抓取失败
     */
    private String status;
    /**
     * 状态id
     */
    private String status_id;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_id() {
        return status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }
}
