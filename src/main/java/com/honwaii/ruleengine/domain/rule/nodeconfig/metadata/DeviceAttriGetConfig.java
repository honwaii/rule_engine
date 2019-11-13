package com.honwaii.ruleengine.domain.rule.nodeconfig.metadata;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class DeviceAttriGetConfig extends BaseNodeConfig {
    @ApiModelProperty("需要添加到消息中的属性名")
    private List<String> attributeNames;
    @ApiModelProperty("只要有一个属性不存在，则将消息发送到失败链")
    private boolean tellFailureIfAbsent;
    @ApiModelProperty("指定设备的查找方向，仅有From和To两个值可选")
    private String direction;
    @ApiModelProperty("设备查找的最大深度/高度")
    private int maxLevel = 1;
    @ApiModelProperty("关联类型")
    private String relationType;
    @ApiModelProperty("设备类型")
    private List<String> deviceTypes;
//    @ApiModelProperty("需要添加到消息中的属性名")
//    private boolean fetchLastLevelOnly;
}
