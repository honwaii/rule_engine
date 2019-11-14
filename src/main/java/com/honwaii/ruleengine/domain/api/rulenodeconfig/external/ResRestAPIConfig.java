package com.honwaii.ruleengine.domain.api.rulenodeconfig.external;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.external.RestAPIConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResRestAPIConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private RestAPIConfig data;
}
