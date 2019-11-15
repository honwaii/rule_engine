package com.honwaii.ruleengine.controller;

import com.honwaii.ruleengine.domain.api.ResponseDel;
import com.honwaii.ruleengine.domain.dashboard.Dashboard;
import com.honwaii.ruleengine.domain.dashboard.ResDashboard;
import com.honwaii.ruleengine.domain.dashboard.ResPageDashboard;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DashboardController
 * @Description TODO
 * @Author lys1874
 * @Date 2019/11/12 11:21
 * @Version 1.0
 **/

@Slf4j
@RestController
@RequestMapping("/v2")
@Api(tags = "Dashboard")
public class DashboardController {

    @ApiOperation("新增Dashboard信息")
    @PostMapping("/dashboard")
    @ResponseBody
    public ResDashboard saveDashboard(@RequestBody Dashboard dashboard) {
        return null;
    }

    @ApiOperation("更新Dashboard数据")
    @PutMapping("/dashboard")
    @ResponseBody
    public ResDashboard updateDashboard(@RequestBody Dashboard dashboard) {
        return null;
    }

    @ApiOperation("获取一条Dashboard数据")
    @GetMapping("/getDashboard/{dashboardId}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名,前端不传，从session中获取.,前端不传，从session中获取.", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResDashboard getDashboard(@PathVariable String dashboardId) {
        return null;
    }

    @ApiOperation(value = "删除dashboard")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    @RequestMapping(value = "/dashboard/{dashboardId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseDel deleteDashboard(@PathVariable String dashboardId) {
        return null;
    }

    @ApiOperation("分页获取dashboard数据")
    @GetMapping("/getDashboards")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户名", required = true, paramType = "query", dataType = "String"),
    })
    @ResponseBody
    public ResPageDashboard getDashboards(@ApiParam(name = "textSearch", value = "关键字搜索内容")
                                          @RequestParam(required = false) String textSearch,
                                          @ApiParam(name = "pageSize", value = "页面大小", required = true)
                                          @RequestParam(required = true) String pageSize,
                                          @ApiParam(name = "pageNum", value = "当前页数", required = true)
                                          @RequestParam(required = true) String pageNum) {
        return null;
    }
}
