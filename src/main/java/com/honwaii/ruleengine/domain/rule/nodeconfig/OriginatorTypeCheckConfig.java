package com.honwaii.ruleengine.domain.rule.nodeconfig;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class OriginatorTypeCheckConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "需检查的消息源类型", required = true)
    private List<String> originatorTypes;
}
