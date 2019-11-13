package com.honwaii.ruleengine.domain.rule.nodeconfig;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JsSwitchConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "消息路由的脚本", required = true)
    private String jsScript;
}
