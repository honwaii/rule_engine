package com.honwaii.ruleengine.domain.api;

import com.honwaii.ruleengine.domain.rule.RuleChainMetaData;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResponseRuleChainMetadata extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private RuleChainMetaData data;
}
