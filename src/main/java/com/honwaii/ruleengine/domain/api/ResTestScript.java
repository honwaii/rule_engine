package com.honwaii.ruleengine.domain.api;

import com.honwaii.ruleengine.domain.rule.TestScript;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResTestScript extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private TestScript data;
}
