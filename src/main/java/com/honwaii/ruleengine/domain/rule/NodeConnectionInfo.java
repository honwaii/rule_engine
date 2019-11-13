package com.honwaii.ruleengine.domain.rule;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NodeConnectionInfo {
    @ApiModelProperty(value = "规则节点的起始索引")
    private int fromIndex;
    @ApiModelProperty(value = "规则节点的终止索引")
    private int toIndex;
    @ApiModelProperty(value = "规则节点间的关联类型")
    private String type;
}