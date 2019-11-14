package com.honwaii.ruleengine.domain.rule.nodeconfig.action;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName MsgAttributesSaveConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:25
 * @Version 1.0
 **/
@Data
public class MsgAttributesSaveConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
