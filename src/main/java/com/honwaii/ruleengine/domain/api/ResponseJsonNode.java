package com.honwaii.ruleengine.domain.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.honwaii.ruleengine.domain.rule.RuleChain;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResponseJsonNode extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private JsonNode data;
}
