package com.honwaii.ruleengine.domain.api.rulenodeconfig.filter;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.filter.JsSwitchConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResJsSwitchConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 19:24
 * @Version 1.0
 **/
@Data
public class ResJsSwitchConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private JsSwitchConfig data;
}
