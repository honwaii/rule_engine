package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName LogNodeConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:07
 * @Version 1.0
 **/
@Data
public class LogNodeConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "消息日志的脚本定义(将消息经脚本处理后写入到终端管理的日志中)", required = true)
    private String jsScript;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
