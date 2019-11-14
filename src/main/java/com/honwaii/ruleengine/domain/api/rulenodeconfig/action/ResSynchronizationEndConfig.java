package com.honwaii.ruleengine.domain.api.rulenodeconfig.action;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.action.SynchronizationEndConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResSynchronizationEndConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 20:11
 * @Version 1.0
 **/
@Data
public class ResSynchronizationEndConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private SynchronizationEndConfig data;
}
