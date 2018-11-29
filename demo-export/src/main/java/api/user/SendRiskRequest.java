package api.user;

import java.io.Serializable;

/**
 * Created by thinkpad on 2017/2/22.
 */
public class SendRiskRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    /**
     * rh:人行
     * insure:社保
     * fund:公积金
     * */
    private String type;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
