package com.honwaii.ruleengine.domain.rule.nodeconfig.transform;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MsgTransformConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "消息的转换脚本", required = true)
    private String jsScript;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
