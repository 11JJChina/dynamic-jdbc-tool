package com.zhang.develop.controller;

import com.zhang.develop.common.ResponseResult;
import com.zhang.develop.domain.StatisticsInfoDTO;
import com.zhang.develop.service.HomePageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhangguowen
 * @Title: HomePageController
 * @ProjectName: empi
 * @Description:
 * @date: 2021/6/23 13:25
 */
@RestController
@RequestMapping("/homepage")
public class HomePageController {

    @Resource
    private HomePageService homePageService;

    @GetMapping("/index")
    public ResponseResult totalDataCountMonitor(){
        StatisticsInfoDTO statisticsInfoDTO = homePageService.queryAllCountData();
        return ResponseResult.createSuccessResponse(statisticsInfoDTO);
    }


}
