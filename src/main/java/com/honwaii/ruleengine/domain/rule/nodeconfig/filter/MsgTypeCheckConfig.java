package com.honwaii.ruleengine.domain.rule.nodeconfig.filter;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class MsgTypeCheckConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "需检查的消息类型", required = true)
    private List<String> messageTypes;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
