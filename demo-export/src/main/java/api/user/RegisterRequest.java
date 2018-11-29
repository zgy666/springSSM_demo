package api.user;

import java.io.Serializable;


public class RegisterRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mobile;

    private String verCode;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerCode() {
        return verCode;
    }

    public void setVerCode(String verCode) {
        this.verCode = verCode;
    }
}
