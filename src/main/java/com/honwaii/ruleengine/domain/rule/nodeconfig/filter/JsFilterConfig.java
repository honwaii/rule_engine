package com.honwaii.ruleengine.domain.rule.nodeconfig.filter;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JsFilterConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "属性检查的脚本定义", required = true)
    private String jsScript;
}
