package com.honwaii.ruleengine.domain.api.rulenodeconfig.action;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.action.SynchronizationStartConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResSynchronizationStartConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:11
 * @Version 1.0
 **/
@Data
public class ResSynchronizationStartConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private SynchronizationStartConfig data;
}
