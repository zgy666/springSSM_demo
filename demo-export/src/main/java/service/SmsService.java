package service;


import com.demo.common.ExecuteResult;

/**
 * 短信发送服务
 */
public interface SmsService {

    /**
     * 光大短信网关
     * @param mobile 手机号
     * @param content 短信内容
     * @return 发送结果
     * @see ExecuteResult
     */
    ExecuteResult<String> ebyfSMS(String mobile, String content);
}
