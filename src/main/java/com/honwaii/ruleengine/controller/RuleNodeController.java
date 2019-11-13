package com.honwaii.ruleengine.controller;

import com.honwaii.ruleengine.domain.rule.nodeconfig.metadata.OriginatorFieldsConfig;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v2")
public class RuleNodeController {
    @ApiOperation(value = "根据id获取规则链")
    @RequestMapping(value = "/ruleNode/", method = RequestMethod.GET)
    @ResponseBody
    public OriginatorFieldsConfig getRuleChainById(
            @ApiParam(name = "ruleChainId", value = "规则链id", required = true)
            @PathVariable(value = "ruleNodeId") String strRuleChainId) {
        return null;
    }

}
