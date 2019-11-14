package com.honwaii.ruleengine.domain.api.rulenodeconfig.action;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.action.LogNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResLogNodeConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:03
 * @Version 1.0
 **/
@Data
public class ResLogNodeConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private LogNodeConfig data;
}
