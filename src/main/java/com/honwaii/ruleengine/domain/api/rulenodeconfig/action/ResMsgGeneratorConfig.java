package com.honwaii.ruleengine.domain.api.rulenodeconfig.action;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.action.MsgGeneratorConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResMsgGeneratorConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:07
 * @Version 1.0
 **/
@Data
public class ResMsgGeneratorConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private MsgGeneratorConfig data;
}
