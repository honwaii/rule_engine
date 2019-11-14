package com.honwaii.ruleengine.domain.api.rulenodeconfig.action;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.action.MsgCountConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResMsgCountConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:05
 * @Version 1.0
 **/
@Data
public class ResMsgCountConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private MsgCountConfig data;
}
