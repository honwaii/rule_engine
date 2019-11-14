package com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.metadata.ProjectAttriConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResProjectAttriConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 19:54
 * @Version 1.0
 **/
@Data
public class ResProjectAttrConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private ProjectAttriConfig data;
}
