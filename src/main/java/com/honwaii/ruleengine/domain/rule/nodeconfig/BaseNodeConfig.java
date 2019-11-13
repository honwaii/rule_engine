package com.honwaii.ruleengine.domain.rule.nodeconfig;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public abstract class BaseNodeConfig {
    @ApiModelProperty(value = "规则节点名称", required = true)
    private String name;
    @ApiModelProperty(value = "是否开启调试模式")
    private Boolean debugMode;
    @ApiModelProperty(value = "规则节点描述信息")
    private String description;
}
