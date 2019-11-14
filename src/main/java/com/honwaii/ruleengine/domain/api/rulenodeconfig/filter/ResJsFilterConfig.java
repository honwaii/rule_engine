package com.honwaii.ruleengine.domain.api.rulenodeconfig.filter;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import com.honwaii.ruleengine.domain.rule.nodeconfig.filter.JsFilterConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ResJsFilterConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 19:23
 * @Version 1.0
 **/
@Data
public class ResJsFilterConfig extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private JsFilterConfig data;
}
