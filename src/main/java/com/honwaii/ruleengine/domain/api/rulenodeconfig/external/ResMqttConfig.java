package com.honwaii.ruleengine.domain.api.rulenodeconfig.external;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.external.MqttConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResMqttConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private MqttConfig data;
}
