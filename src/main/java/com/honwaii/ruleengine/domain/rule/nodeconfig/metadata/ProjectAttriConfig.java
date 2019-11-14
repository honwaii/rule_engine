package com.honwaii.ruleengine.domain.rule.nodeconfig.metadata;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
public class ProjectAttriConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "项目属性与指定字段的映射关系", required = true)
    private Map<String, String> attrMapping;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
