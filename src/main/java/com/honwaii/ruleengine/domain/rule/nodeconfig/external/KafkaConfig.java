package com.honwaii.ruleengine.domain.rule.nodeconfig.external;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @ClassName KafkaConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 9:34
 * @Version 1.0
 **/
@Data
public class KafkaConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "kafka消息推送的topic", required = true)
    private String topicPattern;
    @ApiModelProperty(value = "kafka服务器地址", required = true)
    private String bootstrapServers;
    @ApiModelProperty(value = "消息推送失败时的重试次数", required = true)
    private int retries = 0;
    @ApiModelProperty(value = "消息批量发送到kafka的大小,")
    private int batchSize = 16384;
    @ApiModelProperty(value = "消息发送延迟设置(ms)，默认0ms")
    private int linger = 0;
    @ApiModelProperty(value = "消息在本地缓存的大小(bytes)，设置默认值33554432")
    private int bufferMemory = 33554432;
    @ApiModelProperty(value = "消息确认模式，只有-1，0，1，all四种可选", required = true)
    private String acks = "-1";
    @ApiModelProperty(value = "键的序列化类型，默认org.apache.kafka.common.serialization.StringSerializer", required = true)
    private String keySerializer;
    @ApiModelProperty(value = "值的序列化类型，默认org.apache.kafka.common.serialization.StringSerializer", required = true)
    private String valueSerializer;
    @ApiModelProperty(value = "kafka生产者的其他配置")
    private Map<String, String> otherProperties;
    @ApiModelProperty(value = "当前规则节点的类型")
    private String type;
}
