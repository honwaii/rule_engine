package com.honwaii.ruleengine.domain.api;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public abstract class ResponseMsg {
    @ApiModelProperty(value = "返回消息码")
    private int code;
    @ApiModelProperty(value = "提示信息")
    private String messages;
}
