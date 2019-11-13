package com.honwaii.ruleengine.domain.api;

import com.honwaii.ruleengine.domain.rule.RuleChain;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResponsePageRuleChain extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private PageData<RuleChain> data;
}
