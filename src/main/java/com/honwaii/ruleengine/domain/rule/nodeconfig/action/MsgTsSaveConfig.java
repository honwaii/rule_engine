package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName MsgTsSaveConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:28
 * @Version 1.0
 **/
@Data
public class MsgTsSaveConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "时序数据的过期时间(秒)，0 - 表示不过期)")
    private long defaultTTL;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
