package generator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IfUserMeterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IfUserMeterExample() {
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

        public Criteria andServIdIsNull() {
            addCriterion("SERV_ID is null");
            return (Criteria) this;
        }

        public Criteria andServIdIsNotNull() {
            addCriterion("SERV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServIdEqualTo(BigDecimal value) {
            addCriterion("SERV_ID =", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotEqualTo(BigDecimal value) {
            addCriterion("SERV_ID <>", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThan(BigDecimal value) {
            addCriterion("SERV_ID >", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERV_ID >=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThan(BigDecimal value) {
            addCriterion("SERV_ID <", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERV_ID <=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdIn(List<BigDecimal> values) {
            addCriterion("SERV_ID in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotIn(List<BigDecimal> values) {
            addCriterion("SERV_ID not in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERV_ID between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERV_ID not between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(BigDecimal value) {
            addCriterion("REGION_CODE =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(BigDecimal value) {
            addCriterion("REGION_CODE <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(BigDecimal value) {
            addCriterion("REGION_CODE >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGION_CODE >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(BigDecimal value) {
            addCriterion("REGION_CODE <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGION_CODE <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<BigDecimal> values) {
            addCriterion("REGION_CODE in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<BigDecimal> values) {
            addCriterion("REGION_CODE not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGION_CODE between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGION_CODE not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andForbidStatusIsNull() {
            addCriterion("FORBID_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andForbidStatusIsNotNull() {
            addCriterion("FORBID_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andForbidStatusEqualTo(BigDecimal value) {
            addCriterion("FORBID_STATUS =", value, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusNotEqualTo(BigDecimal value) {
            addCriterion("FORBID_STATUS <>", value, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusGreaterThan(BigDecimal value) {
            addCriterion("FORBID_STATUS >", value, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORBID_STATUS >=", value, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusLessThan(BigDecimal value) {
            addCriterion("FORBID_STATUS <", value, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORBID_STATUS <=", value, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusIn(List<BigDecimal> values) {
            addCriterion("FORBID_STATUS in", values, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusNotIn(List<BigDecimal> values) {
            addCriterion("FORBID_STATUS not in", values, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORBID_STATUS between", value1, value2, "forbidStatus");
            return (Criteria) this;
        }

        public Criteria andForbidStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORBID_STATUS not between", value1, value2, "forbidStatus");
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