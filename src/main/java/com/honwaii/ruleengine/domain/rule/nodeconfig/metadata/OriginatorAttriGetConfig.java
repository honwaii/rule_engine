package com.honwaii.ruleengine.domain.rule.nodeconfig.metadata;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class OriginatorAttriGetConfig extends BaseNodeConfig {
    @ApiModelProperty("需要添加到消息中的属性名")
    private List<String> attributeNames;
    @ApiModelProperty("只要有一个属性不存在，则将消息发送到失败链")
    private boolean tellFailureIfAbsent;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
