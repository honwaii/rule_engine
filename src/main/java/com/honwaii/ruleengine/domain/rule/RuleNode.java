package com.honwaii.ruleengine.domain.rule;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RuleNode {
    @ApiModelProperty(value = "规则节点id", required = false)
    private String id;
    @ApiModelProperty(value = "规则链id", required = true)
    private String ruleChainId;
    @ApiModelProperty(value = "规则节点类型", required = true)
    private String type;
    @ApiModelProperty(value = "规则节点名称", required = true)
    private String name;
    @ApiModelProperty(value = "是否开启调试模式", required = false)
    private boolean debugMode;
    @ApiModelProperty(value = "规则节点配置信息(json格式：字段见各个规则节点的配置接口）", required = true)
    private transient JsonNode configuration;
    @ApiModelProperty(value = "附属信息(比如节点在页面放置的位置)", required = false)
    private transient JsonNode additionalInfo;
}
