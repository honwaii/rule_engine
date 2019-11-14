package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName RpcRequestSendConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:18
 * @Version 1.0
 **/
@Data
public class RpcRequestSendConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "请求的超时时间设置(秒)")
    private int timeoutInSeconds;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
