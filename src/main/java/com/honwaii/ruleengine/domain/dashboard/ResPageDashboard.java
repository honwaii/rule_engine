package com.honwaii.ruleengine.domain.dashboard;

import com.honwaii.ruleengine.domain.api.PageData;
import com.honwaii.ruleengine.domain.api.ResponseMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


/**
 * @ClassName ResAddRuleChainDTO
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/12 10:53
 * @Version 1.0
 **/
@Data
public class ResPageDashboard extends ResponseMsg {
    @ApiModelProperty(value = "返回数据")
    private List<PageData<Dashboard>> data;
}
