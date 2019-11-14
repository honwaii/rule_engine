package com.honwaii.ruleengine.domain.rule.nodeconfig.transform;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OriginatorChangeConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "消息中消息源类型转换的选择，如：项目，设备，告警等等", required = true)
    private String originatorSource;

    //    private RelationsQuery relationsQuery;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
