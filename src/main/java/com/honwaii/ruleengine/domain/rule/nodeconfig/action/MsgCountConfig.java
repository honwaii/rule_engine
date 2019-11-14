package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName MsgCountConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:11
 * @Version 1.0
 **/

@Data
public class MsgCountConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "定义消息统计字段的前缀(多个节点运行时以作区分)", required = true)
    private String telemetryPrefix;
    @ApiModelProperty(value = "消息统计的时间间隔", required = true)
    private int interval;
}
