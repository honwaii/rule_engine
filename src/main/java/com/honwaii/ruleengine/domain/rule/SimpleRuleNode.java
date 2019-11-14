package com.honwaii.ruleengine.domain.rule;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SimpleRuleNode {
    @ApiModelProperty(value = "规则节点名称")
    private String name;
    @ApiModelProperty(value = "规则节点类型")
    private String type;
    @ApiModelProperty(value = "规则节点所分组，过滤、转换、动作等")
    private String group;
}
