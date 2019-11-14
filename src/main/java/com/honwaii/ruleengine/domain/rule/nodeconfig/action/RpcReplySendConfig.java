package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName RpcReplySendConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:16
 * @Version 1.0
 **/
@Data
public class RpcReplySendConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "rpc请求id的名称设置，默认名称是requestId", required = true)
    private String requestIdMetaDataAttribute;
}
