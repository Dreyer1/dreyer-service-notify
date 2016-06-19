package com.dreyer.facade.notify.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotifyRecordCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public NotifyRecordCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version_ is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version_ is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Short value) {
            addCriterion("version_ =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Short value) {
            addCriterion("version_ <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Short value) {
            addCriterion("version_ >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("version_ >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Short value) {
            addCriterion("version_ <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Short value) {
            addCriterion("version_ <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Short> values) {
            addCriterion("version_ in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Short> values) {
            addCriterion("version_ not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Short value1, Short value2) {
            addCriterion("version_ between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Short value1, Short value2) {
            addCriterion("version_ not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time_ is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time_ =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time_ <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time_ >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time_ >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time_ <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time_ <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time_ in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time_ not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time_ between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time_ not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNull() {
            addCriterion("last_notify_time_ is null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNotNull() {
            addCriterion("last_notify_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeEqualTo(Date value) {
            addCriterion("last_notify_time_ =", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotEqualTo(Date value) {
            addCriterion("last_notify_time_ <>", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThan(Date value) {
            addCriterion("last_notify_time_ >", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_notify_time_ >=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThan(Date value) {
            addCriterion("last_notify_time_ <", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_notify_time_ <=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIn(List<Date> values) {
            addCriterion("last_notify_time_ in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotIn(List<Date> values) {
            addCriterion("last_notify_time_ not in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_notify_time_ between", value1, value2, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_notify_time_ not between", value1, value2, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNull() {
            addCriterion("notify_times_ is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNotNull() {
            addCriterion("notify_times_ is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesEqualTo(Short value) {
            addCriterion("notify_times_ =", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotEqualTo(Short value) {
            addCriterion("notify_times_ <>", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThan(Short value) {
            addCriterion("notify_times_ >", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("notify_times_ >=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThan(Short value) {
            addCriterion("notify_times_ <", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThanOrEqualTo(Short value) {
            addCriterion("notify_times_ <=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIn(List<Short> values) {
            addCriterion("notify_times_ in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotIn(List<Short> values) {
            addCriterion("notify_times_ not in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesBetween(Short value1, Short value2) {
            addCriterion("notify_times_ between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotBetween(Short value1, Short value2) {
            addCriterion("notify_times_ not between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesIsNull() {
            addCriterion("limit_notify_times_ is null");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesIsNotNull() {
            addCriterion("limit_notify_times_ is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesEqualTo(Short value) {
            addCriterion("limit_notify_times_ =", value, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesNotEqualTo(Short value) {
            addCriterion("limit_notify_times_ <>", value, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesGreaterThan(Short value) {
            addCriterion("limit_notify_times_ >", value, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("limit_notify_times_ >=", value, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesLessThan(Short value) {
            addCriterion("limit_notify_times_ <", value, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesLessThanOrEqualTo(Short value) {
            addCriterion("limit_notify_times_ <=", value, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesIn(List<Short> values) {
            addCriterion("limit_notify_times_ in", values, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesNotIn(List<Short> values) {
            addCriterion("limit_notify_times_ not in", values, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesBetween(Short value1, Short value2) {
            addCriterion("limit_notify_times_ between", value1, value2, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andLimitNotifyTimesNotBetween(Short value1, Short value2) {
            addCriterion("limit_notify_times_ not between", value1, value2, "limitNotifyTimes");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url_ is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url_ is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url_ =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url_ <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url_ >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url_ >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url_ <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url_ <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url_ like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url_ not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url_ in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url_ not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url_ between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url_ not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNull() {
            addCriterion("merchant_order_no_ is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNotNull() {
            addCriterion("merchant_order_no_ is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoEqualTo(String value) {
            addCriterion("merchant_order_no_ =", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotEqualTo(String value) {
            addCriterion("merchant_order_no_ <>", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThan(String value) {
            addCriterion("merchant_order_no_ >", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_order_no_ >=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThan(String value) {
            addCriterion("merchant_order_no_ <", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_order_no_ <=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLike(String value) {
            addCriterion("merchant_order_no_ like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotLike(String value) {
            addCriterion("merchant_order_no_ not like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIn(List<String> values) {
            addCriterion("merchant_order_no_ in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotIn(List<String> values) {
            addCriterion("merchant_order_no_ not in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoBetween(String value1, String value2) {
            addCriterion("merchant_order_no_ between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotBetween(String value1, String value2) {
            addCriterion("merchant_order_no_ not between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no_ is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no_ is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no_ =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no_ <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no_ >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no_ >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no_ <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no_ <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no_ like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no_ not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no_ in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no_ not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no_ between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no_ not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status_ is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status_ is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status_ =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status_ <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status_ >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status_ >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status_ <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status_ <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status_ in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status_ not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status_ between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status_ not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNull() {
            addCriterion("notify_type_ is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNotNull() {
            addCriterion("notify_type_ is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeEqualTo(Short value) {
            addCriterion("notify_type_ =", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotEqualTo(Short value) {
            addCriterion("notify_type_ <>", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThan(Short value) {
            addCriterion("notify_type_ >", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("notify_type_ >=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThan(Short value) {
            addCriterion("notify_type_ <", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThanOrEqualTo(Short value) {
            addCriterion("notify_type_ <=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIn(List<Short> values) {
            addCriterion("notify_type_ in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotIn(List<Short> values) {
            addCriterion("notify_type_ not in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeBetween(Short value1, Short value2) {
            addCriterion("notify_type_ between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotBetween(Short value1, Short value2) {
            addCriterion("notify_type_ not between", value1, value2, "notifyType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}