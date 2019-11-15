package com.honwaii.ruleengine.domain.dashboard;

import com.honwaii.ruleengine.domain.BaseInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName DashBoard
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/12 11:41
 * @Version 1.0
 **/
@Data
@ApiModel
public class Dashboard extends BaseInfo {
    @ApiModelProperty(value = "dashboardId", required = true)
    private String dashboardId;
    @ApiModelProperty(value = "dashboard名称", required = true)
    private String name;
    @ApiModelProperty(value = "描述信息")
    private String description;
    @ApiModelProperty(value = "配置信息")
    private String config;
    @ApiModelProperty(value = "元数据")
    private String metadata;
}
