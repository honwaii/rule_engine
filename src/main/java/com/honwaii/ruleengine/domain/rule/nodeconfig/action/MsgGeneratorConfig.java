package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName MsgGeneratorConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:02
 * @Version 1.0
 **/

@Data
public class MsgGeneratorConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "产生消息的数量设置，0 - 表示产生无限条消息", required = true)
    private int msgCount;
    @ApiModelProperty(value = "消息产生的时间间隔(秒)", required = true)
    private int periodInSeconds;
    @ApiModelProperty(value = "消息源id", required = true)
    private String originatorId;
    @ApiModelProperty(value = "消息源类型", required = true)
    private String originatorType;
    @ApiModelProperty(value = "产生消息的脚本定义", required = true)
    private String jsScript;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
