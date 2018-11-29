package service;

import com.bjucloud.common.ExecuteResult;
import com.bjucloud.credit.dto.risk.OtherMessageRequest;
import com.bjucloud.credit.dto.risk.OtherMessageResponse;

/**
 * 风控系统接口调用服务
 */
public interface RiskService {

    /**
     * 客户其他信息推送
     * @return 调用结果
     */
    ExecuteResult<OtherMessageResponse> pushOtherMessage(OtherMessageRequest otherMessageRequest);

}
