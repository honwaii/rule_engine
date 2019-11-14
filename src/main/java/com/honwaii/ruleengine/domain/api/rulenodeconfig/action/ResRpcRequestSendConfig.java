package com.honwaii.ruleengine.domain.api.rulenodeconfig.action;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.action.RpcRequestSendConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResRpcRequestSendConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:10
 * @Version 1.0
 **/
@Data
public class ResRpcRequestSendConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private RpcRequestSendConfig data;
}
