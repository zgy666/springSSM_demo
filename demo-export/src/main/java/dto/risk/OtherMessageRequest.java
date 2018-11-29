package dto.risk;

import java.io.Serializable;

/**
 * 风控系统接口-客户其他信息推荐-请求参数
 */
public class OtherMessageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private OtherMessageBody Body;

    private BaseRequest Info;


    public OtherMessageBody getBody() {
        return Body;
    }

    public void setBody(OtherMessageBody body) {
        Body = body;
    }

    public BaseRequest getInfo() {
        return Info;
    }

    public void setInfo(BaseRequest info) {
        Info = info;
    }
}
