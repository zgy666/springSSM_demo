package api.user;

import java.io.Serializable;


public class SaveLoginNameRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String loginName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
