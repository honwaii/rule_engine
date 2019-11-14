package com.honwaii.ruleengine.domain.rule.nodeconfig.filter;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JsSwitchConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "消息路由的脚本", required = true)
    private String jsScript;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
