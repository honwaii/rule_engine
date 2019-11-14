package com.honwaii.ruleengine.domain.rule;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class TestScript {
    @ApiModelProperty(value = "所属的项目的id", required = true)
    private String projectId;
    @ApiModelProperty(value = "带调试的脚本", required = true)
    private String script;
    @ApiModelProperty(value = "脚本的类型: Filter、Transform等等", required = true)
    private String scriptType;
    @ApiModelProperty(value = "函数入参，默认是:\"msg\", \"metadata\", \"msgType\"", required = true)
    private String argNames;
    @ApiModelProperty(value = "函数名称: 如filter、transform等等")
    private String functionName;
    @ApiModelProperty(value = "元数据，由用户自定义添加的键-值，以json格式提交")
    private String metadata;
    @ApiModelProperty(value = "消息体，由用户自定义设定，以json格式提交")
    private String msg;
    @ApiModelProperty(value = "消息类型:Post attributes,Connect Event等等，由用户选择", required = true)
    private String msgType;
    @ApiModelProperty(value = "所有的消息类型")
    private List<String> msgTypes;
}
