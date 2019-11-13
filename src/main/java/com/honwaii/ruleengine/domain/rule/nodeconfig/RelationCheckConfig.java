package com.honwaii.ruleengine.domain.rule.nodeconfig;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class RelationCheckConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "关联方向", required = true)
    private String direction;
    @ApiModelProperty(value = "实体Id（checkForSingleEntity为true时必填）")
    private String entityId;
    @ApiModelProperty(value = "实体类型，如设备、dashboard等checkForSingleEntity为true时必填")
    private String entityType;
    @ApiModelProperty(value = "关联类型", required = true)
    private String relationType;
    @ApiModelProperty(value = "是否检查定的实体")
    private boolean checkForSingleEntity;
}
