package com.honwaii.ruleengine.domain.api.rulenodeconfig.action;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.action.AlarmCreateConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResAlarmCreateConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:01
 * @Version 1.0
 **/
@Data
public class ResAlarmCreateConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private AlarmCreateConfig data;
}
