package com.honwaii.ruleengine.domain.rule;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class RuleChainMetaData {
    @ApiModelProperty(value = "所属规则链id")
    private String ruleChainId;
    @ApiModelProperty(value = "第一个规则节点的索引")
    private Integer firstNodeIndex;
    @ApiModelProperty(value = "规则节点列表")
    private List<RuleNode> nodes;
    @ApiModelProperty(value = "规则节点的连接信息")
    private List<NodeConnectionInfo> connections;
    @ApiModelProperty(value = "规则节点的配置信息")
    private List<RuleChainConnectionInfo> ruleChainConnections;
}


