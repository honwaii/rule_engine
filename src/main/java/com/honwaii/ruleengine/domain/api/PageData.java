package com.honwaii.ruleengine.domain.api;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class PageData<T> {
    @ApiModelProperty(value = "页面大小")
    private Integer pageSize;
    @ApiModelProperty(value = "当前页数")
    private Integer pageNum;
    @ApiModelProperty(value = "页面总数")
    private Integer totalCount;
    @ApiModelProperty(value = "返回数据")
    private List<T> list;
}
