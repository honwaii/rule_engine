package com.honwaii.ruleengine.domain.rule;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RuleChainConnectionInfo {
    @ApiModelProperty(value = "规则节点的起始索引")
    private int fromIndex;
    @ApiModelProperty(value = "目标规则链的id")
    private String targetRuleChainId;
    @ApiModelProperty(value = "附属信息(比如节点的放置位置，可由前端自行约定)")
    private JsonNode additionalInfo;
    @ApiModelProperty(value = "关联类型")
    private String type;
}
