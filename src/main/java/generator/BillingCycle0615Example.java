package generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillingCycle0615Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillingCycle0615Example() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBillingCycleIdIsNull() {
            addCriterion("BILLING_CYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdIsNotNull() {
            addCriterion("BILLING_CYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_ID =", value, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdNotEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_ID <>", value, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdGreaterThan(Integer value) {
            addCriterion("BILLING_CYCLE_ID >", value, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_ID >=", value, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdLessThan(Integer value) {
            addCriterion("BILLING_CYCLE_ID <", value, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_ID <=", value, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdIn(List<Integer> values) {
            addCriterion("BILLING_CYCLE_ID in", values, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdNotIn(List<Integer> values) {
            addCriterion("BILLING_CYCLE_ID not in", values, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdBetween(Integer value1, Integer value2) {
            addCriterion("BILLING_CYCLE_ID between", value1, value2, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILLING_CYCLE_ID not between", value1, value2, "billingCycleId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdIsNull() {
            addCriterion("BILLING_CYCLE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdIsNotNull() {
            addCriterion("BILLING_CYCLE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_TYPE_ID =", value, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdNotEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_TYPE_ID <>", value, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdGreaterThan(Integer value) {
            addCriterion("BILLING_CYCLE_TYPE_ID >", value, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_TYPE_ID >=", value, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdLessThan(Integer value) {
            addCriterion("BILLING_CYCLE_TYPE_ID <", value, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILLING_CYCLE_TYPE_ID <=", value, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdIn(List<Integer> values) {
            addCriterion("BILLING_CYCLE_TYPE_ID in", values, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdNotIn(List<Integer> values) {
            addCriterion("BILLING_CYCLE_TYPE_ID not in", values, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("BILLING_CYCLE_TYPE_ID between", value1, value2, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andBillingCycleTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILLING_CYCLE_TYPE_ID not between", value1, value2, "billingCycleTypeId");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateIsNull() {
            addCriterion("CYCLE_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateIsNotNull() {
            addCriterion("CYCLE_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE =", value, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE <>", value, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE >", value, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE >=", value, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateLessThan(Date value) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE <", value, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE <=", value, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateIn(List<Date> values) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE in", values, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE not in", values, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE between", value1, value2, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleBeginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CYCLE_BEGIN_DATE not between", value1, value2, "cycleBeginDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateIsNull() {
            addCriterion("CYCLE_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateIsNotNull() {
            addCriterion("CYCLE_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_END_DATE =", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_END_DATE <>", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CYCLE_END_DATE >", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_END_DATE >=", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateLessThan(Date value) {
            addCriterionForJDBCDate("CYCLE_END_DATE <", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CYCLE_END_DATE <=", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("CYCLE_END_DATE in", values, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CYCLE_END_DATE not in", values, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CYCLE_END_DATE between", value1, value2, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CYCLE_END_DATE not between", value1, value2, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DUE_DATE >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(Date value) {
            addCriterionForJDBCDate("DUE_DATE <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DATE in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DATE not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DATE between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DATE not between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateIsNull() {
            addCriterion("BLOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBlockDateIsNotNull() {
            addCriterion("BLOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBlockDateEqualTo(Date value) {
            addCriterionForJDBCDate("BLOCK_DATE =", value, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BLOCK_DATE <>", value, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BLOCK_DATE >", value, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BLOCK_DATE >=", value, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateLessThan(Date value) {
            addCriterionForJDBCDate("BLOCK_DATE <", value, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BLOCK_DATE <=", value, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateIn(List<Date> values) {
            addCriterionForJDBCDate("BLOCK_DATE in", values, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BLOCK_DATE not in", values, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BLOCK_DATE between", value1, value2, "blockDate");
            return (Criteria) this;
        }

        public Criteria andBlockDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BLOCK_DATE not between", value1, value2, "blockDate");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdIsNull() {
            addCriterion("LAST_BILLING_CYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdIsNotNull() {
            addCriterion("LAST_BILLING_CYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdEqualTo(Integer value) {
            addCriterion("LAST_BILLING_CYCLE_ID =", value, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdNotEqualTo(Integer value) {
            addCriterion("LAST_BILLING_CYCLE_ID <>", value, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdGreaterThan(Integer value) {
            addCriterion("LAST_BILLING_CYCLE_ID >", value, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_BILLING_CYCLE_ID >=", value, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdLessThan(Integer value) {
            addCriterion("LAST_BILLING_CYCLE_ID <", value, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_BILLING_CYCLE_ID <=", value, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdIn(List<Integer> values) {
            addCriterion("LAST_BILLING_CYCLE_ID in", values, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdNotIn(List<Integer> values) {
            addCriterion("LAST_BILLING_CYCLE_ID not in", values, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdBetween(Integer value1, Integer value2) {
            addCriterion("LAST_BILLING_CYCLE_ID between", value1, value2, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andLastBillingCycleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_BILLING_CYCLE_ID not between", value1, value2, "lastBillingCycleId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`STATE` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`STATE` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`STATE` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`STATE` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`STATE` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`STATE` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`STATE` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`STATE` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`STATE` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`STATE` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`STATE` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`STATE` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`STATE` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`STATE` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateDateIsNull() {
            addCriterion("STATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStateDateIsNotNull() {
            addCriterion("STATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateDateEqualTo(Date value) {
            addCriterionForJDBCDate("STATE_DATE =", value, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STATE_DATE <>", value, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STATE_DATE >", value, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STATE_DATE >=", value, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateLessThan(Date value) {
            addCriterionForJDBCDate("STATE_DATE <", value, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STATE_DATE <=", value, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateIn(List<Date> values) {
            addCriterionForJDBCDate("STATE_DATE in", values, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STATE_DATE not in", values, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STATE_DATE between", value1, value2, "stateDate");
            return (Criteria) this;
        }

        public Criteria andStateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STATE_DATE not between", value1, value2, "stateDate");
            return (Criteria) this;
        }
    }

    /**
     */
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