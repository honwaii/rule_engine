package com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.metadata.DeviceAttriGetConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResDeviceAttriGetConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 19:31
 * @Version 1.0
 **/
@Data
public class ResDeviceAttrGetConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private DeviceAttriGetConfig data;
}
