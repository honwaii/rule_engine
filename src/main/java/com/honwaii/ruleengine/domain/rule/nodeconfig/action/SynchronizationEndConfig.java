package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName SynchronizationEndConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:32
 * @Version 1.0
 **/
public class SynchronizationEndConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
