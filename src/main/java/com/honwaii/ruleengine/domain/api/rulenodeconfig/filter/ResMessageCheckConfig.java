package com.honwaii.ruleengine.domain.api.rulenodeconfig.filter;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.filter.MessageCheckConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResMessageCheckConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 16:14
 * @Version 1.0
 **/
@Data
public class ResMessageCheckConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private MessageCheckConfig data;
}
