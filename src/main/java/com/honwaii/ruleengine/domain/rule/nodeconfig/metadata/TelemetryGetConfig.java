package com.honwaii.ruleengine.domain.rule.nodeconfig.metadata;

import com.honwaii.ruleengine.domain.rule.nodeconfig.BaseNodeConfig;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class TelemetryGetConfig extends BaseNodeConfig {
    @ApiModelProperty(value = "开始时间间隔", required = true)
    private int startInterval;
    @ApiModelProperty(value = "结束时间间隔", required = true)
    private int endInterval;
    @ApiModelProperty(value = "开始时间间隔单位", required = true)
    private String startIntervalTimeUnit;
    @ApiModelProperty(value = "结束时间间隔单位", required = true)
    private String endIntervalTimeUnit;
    @ApiModelProperty(value = "数据获取模式", required = true)
    private String fetchMode; //FIRST, LAST, ALL
    @ApiModelProperty(value = "返回数据排序方式", required = true)
    private String orderBy; //ASC, DESC,
    @ApiModelProperty(value = "需要返回时序数据的名称", required = false)
    private List<String> latestTsKeyNames;
}
