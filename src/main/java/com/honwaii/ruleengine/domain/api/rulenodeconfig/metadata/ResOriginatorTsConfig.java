package com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.metadata.TelemetryGetConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResTelemetryGetConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 19:55
 * @Version 1.0
 **/
@Data
public class ResOriginatorTsConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private TelemetryGetConfig data;
}
