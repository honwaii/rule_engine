package com.honwaii.ruleengine.domain.api;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResTestScriptResult extends ResponseMsg {
    @ApiModelProperty(value = "脚本调试的输出结果")
    private Boolean output;
    @ApiModelProperty(value = "脚本调试的错误输出")
    private String error;
}
