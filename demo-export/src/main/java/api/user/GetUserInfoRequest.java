package api.user;

import java.io.Serializable;

public class GetUserInfoRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
