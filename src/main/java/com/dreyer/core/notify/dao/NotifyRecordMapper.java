package com.dreyer.core.notify.dao;

import com.dreyer.facade.notify.criteria.NotifyRecordCriteria;
import com.dreyer.facade.notify.entity.NotifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface NotifyRecordMapper {
    int countByCondition(NotifyRecordCriteria condition);

    int deleteByCondition(NotifyRecordCriteria condition);

    int deleteByPrimaryKey(Long id);

    int insert(NotifyRecord record);

    int insertSelective(NotifyRecord record);

    List<NotifyRecord> selectByCondition(NotifyRecordCriteria condition);

    NotifyRecord selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") NotifyRecord record, @Param("condition") NotifyRecordCriteria condition);

    int updateByCondition(@Param("record") NotifyRecord record, @Param("condition") NotifyRecordCriteria condition);

    int updateByPrimaryKeySelective(NotifyRecord record);

    int updateByPrimaryKey(NotifyRecord record);

    List<NotifyRecord> listPage(Map<String, Object> param);

    long listPageCount(Map<String, Object> param);

}