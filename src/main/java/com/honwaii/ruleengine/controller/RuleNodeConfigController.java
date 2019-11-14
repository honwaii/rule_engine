package com.honwaii.ruleengine.controller;

import com.honwaii.ruleengine.domain.api.ResRuleNodeConfigs;
import com.honwaii.ruleengine.domain.rule.nodeconfig.metadata.OriginatorFieldsConfig;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v2")
public class RuleNodeConfigController {

    @ApiOperation(value = "根据规则链id获取所有节点规则节点信息")
    @RequestMapping(value = "/ruleChain/{ruleChainId}/ruleNodeConfigs", method = RequestMethod.GET)
    @ResponseBody
    public ResRuleNodeConfigs getRuleNodeConfigsByRuleChainId(
            @ApiParam(name = "ruleChainId", value = "规则链id", required = true)
            @PathVariable(value = "ruleChainId") String ruleChainId) {
        return null;
    }

    @ApiOperation(value = "根据ruleChainId获取消息属性检查节点的配置")
    @RequestMapping(value = "/{ruleChainId}/ruleNode/", method = RequestMethod.GET)
    @ResponseBody
    public OriginatorFieldsConfig getRuleChainById(
            @ApiParam(name = "ruleChainId", value = "规则链id", required = true)
            @PathVariable(value = "ruleChainId") String ruleChainId) {
        return null;
    }

}
