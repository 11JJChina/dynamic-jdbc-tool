package com.zhang.develop.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.zhang.develop.domain.StatisticsInfoDTO;
import com.zhang.develop.mapper.HomePageMapper;
import com.zhang.develop.service.HomePageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: ZhangGuowen
 * @Title: HomePageServiceImpl
 * @ProjectName: dynamic-jdbc-tool
 * @Description:
 * @date: 2021/6/30 23:16
 */
@DS("presto")
@Service
public class HomePageServiceImpl implements HomePageService {

    @Resource
    private HomePageMapper homePageMapper;

    @Override
    public StatisticsInfoDTO queryAllCountData() {
        return homePageMapper.queryAllCountData();
    }
}
