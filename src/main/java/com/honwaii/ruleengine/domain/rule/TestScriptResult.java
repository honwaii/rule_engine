package com.honwaii.ruleengine.domain.rule;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName TestScriptResult
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/14 16:08
 * @Version 1.0
 **/
@Data
public class TestScriptResult {
    @ApiModelProperty(value = "脚本调试的输出结果")
    private Boolean output;
    @ApiModelProperty(value = "脚本调试的错误输出")
    private String error;
}
