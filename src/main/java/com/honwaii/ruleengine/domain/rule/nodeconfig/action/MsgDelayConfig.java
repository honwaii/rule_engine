package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName MsgDelayConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 8:58
 * @Version 1.0
 **/
@Data
public class MsgDelayConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "延迟时间设定", required = true)
    private int periodInSeconds;
    @ApiModelProperty(value = "消息延迟队列大小设定", required = true)
    private int maxPendingMsgs;
}
