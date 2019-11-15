package com.honwaii.ruleengine.controller;

import com.honwaii.ruleengine.domain.api.ResRuleNodeConfigs;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.action.*;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.external.*;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.filter.*;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata.ResDeviceAttrGetConfig;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata.ResOriginatorAttrGetConfig;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata.ResOriginatorFieldsConfig;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.metadata.ResOriginatorTsConfig;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.transform.ResMsgTransformConfig;
import com.honwaii.ruleengine.domain.api.rulenodeconfig.transform.ResOriginatorChangeConfig;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v2/ruleEngine")
public class RuleNodeConfigController {

    @ApiOperation(value = "获取所有规则节点的配置信息")
    @RequestMapping(value = "/ruleNode/ruleNodeConfigs", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResRuleNodeConfigs getRuleNodeConfigsByRuleChainId() {
        return null;
    }

    @ApiOperation(value = "获取\"消息属性检查节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/msgCheck", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResOriginatorFieldsConfig getMsgCheckConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"关联检查节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/relationCheck", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResRelationCheckConfig getRelationCheckConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息类型检查节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/msgTypeCheck", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgTypeCheckConfig getMsgTypeCheckConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"按消息类型路由节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/msgTypeSwitch", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgTypeSwitchConfig getMsgTypeSwitchConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息源类型检查节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/originatorTypeCheck", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResOriginatorFieldsConfig getOriginatorTypeCheckConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息源类型路由节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/originatorTypeSwitch", method = RequestMethod.GET)
    @ResponseBody
    public ResMsgOriginatorSwitchConfig getOriginatorTypeSwitchConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"自定义脚本检查节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/jsFilter", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResJsFilterConfig getJsFilterConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"自定义脚本路由节点\"的配置")
    @RequestMapping(value = "/ruleNode/filter/jsSwitch", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResJsSwitchConfig getJsSwitchConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"添加设备属性节点\"的配置")
    @RequestMapping(value = "/ruleNode/deviceAttr", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResDeviceAttrGetConfig getDeviceAttrConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"添加消息源属性节点\"的配置")
    @RequestMapping(value = "/ruleNode/originatorAttr", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResOriginatorAttrGetConfig getOriginatorAttrConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"指定消息源属性节点\"的配置")
    @RequestMapping(value = "/ruleNode/originatorFields", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResOriginatorAttrGetConfig getOriginatorFieldsConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"添加消息源遥测数据节点\"的配置")
    @RequestMapping(value = "/ruleNode/originatorTs", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResOriginatorTsConfig getOriginatorTsConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息源转换节点\"的配置")
    @RequestMapping(value = "/ruleNode/originatorChange", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResOriginatorChangeConfig getOriginatorChangeConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息转换节点\"的配置")
    @RequestMapping(value = "/ruleNode/msgTransform", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgTransformConfig getMsgTransformConfig() {
        return null;
    }


    @ApiOperation(value = "获取\"告警清除节点\"的配置")
    @RequestMapping(value = "/ruleNode/alarmClear", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResAlarmClearConfig getAlarmClearConfig() {
        return null;
    }


    @ApiOperation(value = "获取\"告警创建节点\"的配置")
    @RequestMapping(value = "/ruleNode/alarmCreate", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResAlarmCreateConfig getAlarmCreateConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息日志输出节点\"的配置")
    @RequestMapping(value = "/ruleNode/logOutput", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResLogNodeConfig getLogOutputConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"属性保存节点\"的配置")
    @RequestMapping(value = "/ruleNode/attributesSave", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgAttributesSaveConfig getAttributesSaveConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息统计节点\"的配置")
    @RequestMapping(value = "/ruleNode/msgCount", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgCountConfig getMsgCountConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"消息延迟节点\"的配置")
    @RequestMapping(value = "/ruleNode/msgDelay", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgDelayConfig getMsgDelayConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"自定义消息生成节点\"的配置")
    @RequestMapping(value = "/ruleNode/msgGenerator", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgGeneratorConfig getMsgGeneratorConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"时序数据保存节点\"的配置")
    @RequestMapping(value = "/ruleNode/msgTsSave", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMsgTsSaveConfig getMsgTsSaveConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"RPC响应发送节点\"的配置")
    @RequestMapping(value = "/ruleNode/rpcReplySend", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResRpcReplySendConfig getRpcReplySendConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"RPC请求与发送节点\"的配置")
    @RequestMapping(value = "/ruleNode/rpcRequestSend", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResRpcRequestSendConfig getRpcRequestSendConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"同步操作结束标志节点\"的配置")
    @RequestMapping(value = "/ruleNode/synchronizationEnd", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResSynchronizationEndConfig getSynchronizationEndConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"同步操作开始标志节点\"的配置")
    @RequestMapping(value = "/ruleNode/synchronizationStart", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResSynchronizationStartConfig getSynchronizationStartConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"邮件发送节点\"的配置")
    @RequestMapping(value = "/ruleNode/emailSend", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResEmailSendConfig getEmailSendConfig() {
        return null;
    }


    @ApiOperation(value = "获取\"kafka发送节点\"的配置")
    @RequestMapping(value = "/ruleNode/kafka", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResKafkaConfig getKafkaConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"mqtt推送节点\"的配置")
    @RequestMapping(value = "/ruleNode/mqtt", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResMqttConfig getMqttConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"rabbitMq推送节点\"的配置")
    @RequestMapping(value = "/ruleNode/rabbitMq", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResRabbitMqConfig getRabbitMqConfig() {
        return null;
    }

    @ApiOperation(value = "获取\"Rest Api节点\"的配置")
    @RequestMapping(value = "/ruleNode/restApi", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResRestAPIConfig getRestApiConfig() {
        return null;
    }
}
