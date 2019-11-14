package com.honwaii.ruleengine.domain.rule.nodeconfig.transform;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MsgToEmailConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "发件人", required = true)
    private String fromTemplate;
    @ApiModelProperty(value = "收件人", required = true)
    private String toTemplate;
    @ApiModelProperty(value = "抄送")
    private String ccTemplate;
    @ApiModelProperty(value = "暗抄送")
    private String bccTemplate;
    @ApiModelProperty(value = "邮件主题", required = true)
    private String subjectTemplate;
    @ApiModelProperty(value = "邮件内容", required = true)
    private String bodyTemplate;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
