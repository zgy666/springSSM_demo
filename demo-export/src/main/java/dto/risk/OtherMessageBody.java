package dto.risk;

import java.io.Serializable;

/**
 * 风控系统接口-客户其他信息推荐-请求参数
 */
public class OtherMessageBody extends BaseRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String NameNum;

    private String SendTime;
    /**
     * 身份证编号
     */
    private String IdCard;
    /**
     * 客户姓名
     */
    private String CustomerName;

    private OtherMessageJSONData JsonData;

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public OtherMessageJSONData getJsonData() {
        return JsonData;
    }

    public void setJsonData(OtherMessageJSONData jsonData) {
        JsonData = jsonData;
    }

    public String getNameNum() {
        return NameNum;
    }

    public void setNameNum(String nameNum) {
        NameNum = nameNum;
    }

    public String getSendTime() {
        return SendTime;
    }

    public void setSendTime(String sendTime) {
        SendTime = sendTime;
    }
}
