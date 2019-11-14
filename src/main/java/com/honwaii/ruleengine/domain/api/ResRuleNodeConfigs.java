package com.honwaii.ruleengine.domain.api;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName ResRuleNodeConfigs
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 15:58
 * @Version 1.0
 **/
@Data
public class ResRuleNodeConfigs extends ResponseMsg {
    @ApiModelProperty(value = "返回数据: 所有规则节点的信息，具体字段见各个规则节点获取的接口的定义.")
    List<BaseNodeConfig> data;
}
