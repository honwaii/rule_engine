package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName AlarmCreateConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 8:49
 * @Version 1.0
 **/

@Data
public class AlarmClearConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "告警类型", required = true)
    private String alarmType;
    @ApiModelProperty(value = "根据脚本定义告警清除的详情")
    private String alarmDetailsBuildJs;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
