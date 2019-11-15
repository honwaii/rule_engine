package com.honwaii.ruleengine.domain.dashboard;

import com.honwaii.ruleengine.domain.api.ResponseMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @ClassName ResAddRuleChainDTO
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/12 10:53
 * @Version 1.0
 **/
@ApiModel
@Data
public class ResDashboard extends ResponseMsg {
    @ApiModelProperty(value = "返回数据", required = true)
    private Dashboard data;
}
