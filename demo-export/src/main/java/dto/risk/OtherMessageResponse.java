package dto.risk;

import java.io.Serializable;

/**
 * 风控系统-客户其他信息推送-返回参数
 */
public class OtherMessageResponse extends BaseResponse implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 处理结果
     */
    private String Result;

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }
}
