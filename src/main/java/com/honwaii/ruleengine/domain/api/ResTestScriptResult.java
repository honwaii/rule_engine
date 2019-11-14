package com.honwaii.ruleengine.domain.api;

import com.honwaii.ruleengine.domain.rule.TestScriptResult;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResTestScriptResult extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private TestScriptResult data;
}
