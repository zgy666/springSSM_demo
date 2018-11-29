package service;

import com.bjucloud.common.ExecuteResult;

/**
 * 验证码服务
 */
public interface VerCodeService {

    /**
     * 短信验证码发送
     * @param mobile 手机号
     * @return 发送结果
     * @see ExecuteResult
     */
    ExecuteResult<String> sendSms(String mobile);
}
