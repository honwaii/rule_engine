package com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.metadata.OriginatorFieldsConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResOriginatorFieldsConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 19:54
 * @Version 1.0
 **/
@Data
public class ResOriginatorFieldsConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private OriginatorFieldsConfig data;
}
