package com.zhang.develop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.develop.domain.StatisticsInfoDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zhangguowen
 * @Title: HomePageMapper
 * @ProjectName: empi
 * @Description:
 * @date: 2021/6/23 13:27
 */
@Mapper
public interface HomePageMapper extends BaseMapper<StatisticsInfoDTO> {

    StatisticsInfoDTO queryAllCountData();

}
