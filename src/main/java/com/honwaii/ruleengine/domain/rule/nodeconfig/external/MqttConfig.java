package com.honwaii.ruleengine.domain.rule.nodeconfig.external;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName MqttConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 10:34
 * @Version 1.0
 **/
@Data
public class MqttConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "消息主题", required = true)
    private String topicPattern;
    @ApiModelProperty(value = "MQTT服务器地址, 默认选择绿洲的mqtt服务器", required = true)
    private String host;
    @ApiModelProperty(value = "端口", required = true)
    private int port;
    @ApiModelProperty(value = "连接超时时间", required = true)
    private int connectTimeoutSec;
    @ApiModelProperty(value = "客户端id")
    private String clientId;
    @ApiModelProperty(value = "用户名，为绿洲mqtt服务器时，不用填写")
    private String username;
    @ApiModelProperty(value = "密码，为绿洲mqtt服务器时，不用填写")
    private String password;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
