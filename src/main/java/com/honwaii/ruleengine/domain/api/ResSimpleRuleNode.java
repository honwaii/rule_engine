package com.honwaii.ruleengine.domain.api;

import com.honwaii.ruleengine.domain.rule.SimpleRuleNode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ResSimpleRuleNode extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private List<SimpleRuleNode> data;
}
