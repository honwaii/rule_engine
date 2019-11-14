package com.honwaii.ruleengine.controller;

import com.honwaii.ruleengine.domain.api.*;
import com.honwaii.ruleengine.domain.rule.RuleChain;
import com.honwaii.ruleengine.domain.rule.RuleChainMetaData;
import com.honwaii.ruleengine.domain.rule.TestScript;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v2/ruleEngine")
@Api
public class RuleChainController {
    private static final String RULE_CHAIN_ID = "ruleChainId";
    private static final String RULE_NODE_ID = "ruleNodeId";

    @ApiOperation(value = "根据id获取规则链")
    @RequestMapping(value = "/ruleChain/{ruleChainId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseRuleChain getRuleChainById(
            @ApiParam(name = "ruleChainId", value = "规则链id", required = true)
            @PathVariable(value = RULE_CHAIN_ID) String ruleChainId) {
        return null;
    }

    @ApiOperation(value = "获取一条规则链中的所有信息")
    @RequestMapping(value = "/ruleChain/{ruleChainId}/metadata", method = RequestMethod.GET)
    @ResponseBody
    public ResponseRuleChainMetadata getRuleChainMetaData(
            @ApiParam(name = "ruleChainId", value = "规则链id", required = true)
            @PathVariable(RULE_CHAIN_ID) String ruleChainId) {
        return null;
    }

    @ApiOperation(value = "保存一条规则链中的所有信息")
    @RequestMapping(value = "/ruleChain", method = RequestMethod.POST)
    @ResponseBody
    public ResponseRuleChain saveRuleChain(@RequestBody RuleChain ruleChain) {
        return null;
    }

    @ApiOperation(value = "设置某条规则链为根规则链")
    @RequestMapping(value = "/ruleChain/{ruleChainId}/root", method = RequestMethod.POST)
    @ResponseBody
    public ResponseRuleChain setRootRuleChain(
            @ApiParam(name = "ruleChainId", value = "规则链id", required = true)
            @PathVariable(RULE_CHAIN_ID) String ruleChainId) {
        return null;
    }

    @ApiOperation(value = "保存某条规则链的所有信息")
    @RequestMapping(value = "/ruleChain/metadata", method = RequestMethod.POST)
    @ResponseBody
    public ResponseRuleChainMetadata saveRuleChainMetaData(@RequestBody RuleChainMetaData ruleChainMetaData) {
        return null;
    }

    @ApiOperation(value = "分页获取规则链")
    @RequestMapping(value = "/ruleChains", method = RequestMethod.GET)
    @ResponseBody
    public ResponsePageRuleChain getRuleChains(
            @ApiParam(name = "textSearch", value = "关键字搜索内容")
            @RequestParam(required = false) String textSearch,
            @ApiParam(name = "pageSize", value = "页面大小", required = true)
            @RequestParam(required = true) String pageSize,
            @ApiParam(name = "pageNum", value = "当前页数", required = true)
            @RequestParam(required = true) String pageNum) {
        return null;
    }

    @ApiOperation(value = "删除某条规则链")
    @RequestMapping(value = "/ruleChain/{ruleChainId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseDel deleteRuleChain(
            @ApiParam(name = "ruleChainId", value = "规则链id", required = true)
            @PathVariable(RULE_CHAIN_ID) String ruleChainId) {
        return null;
    }

    @ApiOperation(value = "获取某个规则节点最新的调试信息")
    @RequestMapping(value = "/ruleNode/{ruleNodeId}/debugIn", method = RequestMethod.GET)
    @ResponseBody
    public ResponseJsonNode getLatestRuleNodeDebugInput(
            @ApiParam(name = "ruleNodeId", value = "规则节点id", required = true)
            @PathVariable(RULE_NODE_ID) String ruleChainId) {
        return null;
    }

    @ApiOperation(value = "提交规则节点的测试脚本，在线调试脚本时提交的脚本")
    @RequestMapping(value = "/ruleChain/testScript", method = RequestMethod.POST)
    @ResponseBody
    public ResTestScript testScript(
            @ApiParam(name = "inputParams", value = "调试脚本内容", required = true)
            @RequestBody TestScript inputParams) {
        return null;
    }

    @ApiOperation(value = "获取对应类型的脚本信息")
    @RequestMapping(value = "/ruleChain/testScript/{scriptType}", method = RequestMethod.GET)
    @ResponseBody
    public ResTestScript getTestScript(
            @ApiParam(name = "scriptType", value = "脚本类型", required = true)
            @PathVariable String scriptType) {
        return null;
    }

    @ApiOperation(value = "获取所有的规则节点类型")
    @RequestMapping(value = "/ruleChain/ruleNodes", method = RequestMethod.GET)
    @ResponseBody
    public ResSimpleRuleNode getRuleNodes() {
        return null;
    }

}
