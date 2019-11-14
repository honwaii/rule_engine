package com.honwaii.ruleengine.domain.rule.nodeconfig.external;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @ClassName RestAPIConfig
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 15:41
 * @Version 1.0
 **/
@Data
public class RestAPIConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "REST API 调用的URL", required = true)
    private String restEndpointUrlPattern;
    @ApiModelProperty(value = "REST API 调用方式: GET/PUT/POST/DELETE", required = true)
    private String requestMethod;
    @ApiModelProperty(value = "请求头定义")
    private Map<String, String> headers;
//    private boolean useSimpleClientHttpFactory;
}
