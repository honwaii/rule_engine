package com.honwaii.ruleengine.domain.rule;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RuleChain {
    @ApiModelProperty(value = "规则链id", required = false)
    private String id;
    @ApiModelProperty(value = "所属项目id", required = true)
    private String projectId;
    @ApiModelProperty(value = "规则链名称", required = true)
    private String name;
    @ApiModelProperty(value = "第一个规则节点索引", required = false)
    private String firstRuleNodeId;
    @ApiModelProperty(value = "是否为根节点", required = false)
    private boolean root;
    @ApiModelProperty(value = "是否开启调试模式", required = false)
    private boolean debugMode;
    @ApiModelProperty(value = "规则链配置", required = false)
    private transient JsonNode configuration;
    @JsonIgnore
    private byte[] configurationBytes;

}
