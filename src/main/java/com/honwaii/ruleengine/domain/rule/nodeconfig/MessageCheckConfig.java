package com.honwaii.ruleengine.domain.rule.nodeconfig;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class MessageCheckConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "消息体中需要检查的属性名列表", required = true)
    private List<String> messageNames;
    @ApiModelProperty(value = "元数据中需要检查的属性名列表", required = true)
    private List<String> metadataNames;
    @ApiModelProperty(value = "是否检查所有的属性")
    private boolean checkAllKeys;
}
