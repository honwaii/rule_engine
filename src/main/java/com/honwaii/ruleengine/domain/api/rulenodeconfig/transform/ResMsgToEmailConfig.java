package com.honwaii.ruleengine.domain.api.rulenodeconfig.transform;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.transform.MsgToEmailConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResMsgToEmailConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:14
 * @Version 1.0
 **/
@Data
public class ResMsgToEmailConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private MsgToEmailConfig data;
}
