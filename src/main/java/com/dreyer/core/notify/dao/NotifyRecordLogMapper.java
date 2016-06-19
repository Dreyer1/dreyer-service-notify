package com.dreyer.core.notify.dao;

import com.dreyer.facade.notify.criteria.NotifyRecordLogCriteria;
import com.dreyer.facade.notify.entity.NotifyRecordLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NotifyRecordLogMapper {
    int countByCondition(NotifyRecordLogCriteria condition);

    int deleteByCondition(NotifyRecordLogCriteria condition);

    int deleteByPrimaryKey(Long id);

    int insert(NotifyRecordLog record);

    int insertSelective(NotifyRecordLog record);

    List<NotifyRecordLog> selectByCondition(NotifyRecordLogCriteria condition);

    NotifyRecordLog selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") NotifyRecordLog record, @Param("condition") NotifyRecordLogCriteria condition);

    int updateByCondition(@Param("record") NotifyRecordLog record, @Param("condition") NotifyRecordLogCriteria condition);

    int updateByPrimaryKeySelective(NotifyRecordLog record);

    int updateByPrimaryKey(NotifyRecordLog record);
}