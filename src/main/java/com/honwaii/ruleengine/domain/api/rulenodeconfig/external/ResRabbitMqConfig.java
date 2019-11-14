package com.honwaii.ruleengine.domain.api.rulenodeconfig.external;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.external.RabbitMqConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResRabbitMqConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private RabbitMqConfig data;

}
