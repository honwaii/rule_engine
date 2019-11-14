package com.honwaii.ruleengine.domain.rule.nodeconfig.external;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @ClassName RabbitMqConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 10:16
 * @Version 1.0
 **/
@Data
public class RabbitMqConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "交换器名称")
    private String exchangeNamePattern;
    @ApiModelProperty(value = "路由键")
    private String routingKeyPattern;
    @ApiModelProperty(value = "消息属性，有null,\"BASIC\",\"TEXT_PLAIN\",\"MINIMAL_BASIC\",\"MINIMAL_PERSISTENT_BASIC\"," +
            "\"PERSISTENT_BASIC\",\"PERSISTENT_TEXT_PLAIN\"可选")
    private String messageProperties;
    @ApiModelProperty(value = "服务器ip", required = true)
    private String host;
    @ApiModelProperty(value = "端口", required = true)
    private int port;
    @ApiModelProperty(value = "设置虚拟主机 Virtual host, 默认为\"/\"")
    private String virtualHost = "/";
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "自动恢复")
    private boolean automaticRecoveryEnabled;
    @ApiModelProperty(value = "连接超时(ms)，默认10000ms")
    private int connectionTimeout;
    @ApiModelProperty(value = "握手超时(ms), 默认10000ms")
    private int handshakeTimeout;
    @ApiModelProperty(value = "客户端属性")
    private Map<String, String> clientProperties;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
