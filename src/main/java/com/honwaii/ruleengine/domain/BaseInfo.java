package com.honwaii.ruleengine.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName BaseInfo
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/15 9:12
 * @Version 1.0
 **/
@Data
public abstract class BaseInfo {
    @ApiModelProperty(value = "用户名（必填）（前端不传，由webserver从session拼接）", required = true)
    private String userAccount;
}
