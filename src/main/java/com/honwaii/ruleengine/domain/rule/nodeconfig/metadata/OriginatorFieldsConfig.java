package com.honwaii.ruleengine.domain.rule.nodeconfig.metadata;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
public class OriginatorFieldsConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "需要添加的字段属性的映射关系", required = true)
    private Map<String, String> fieldsMapping;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
