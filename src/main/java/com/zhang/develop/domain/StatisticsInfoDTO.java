package com.zhang.develop.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: zhangguowen
 * @Title: StatisticsinfoDTO
 * @ProjectName: empi
 * @Description:
 * @date: 2021/6/23 14:04
 */
@Data
@TableName(value = "statistics_info")
public class StatisticsInfoDTO {

    /**
     * 患者信息数量
     */
    private Integer patientCount;
    /**
     * 合规身份证号数量
     */
    private Integer legalIdcardCount;
    /**
     * 姓名、性别、出生年月等其他合规信息数量
     */
    private Integer legalNameSexBirthCount;
    /**
     * 患者主索引数量
     */
    private Integer patientMainIndexCount;
    /**
     * 身份证合并主索引数量
     */
    private Integer idcardCombineMainIndexCount;
    /**
     * 其他信息合并主索引数量
     */
    private Integer otherCombineMainIndexCount;
    /**
     * 创建日期
     */
    private String createDate;




}