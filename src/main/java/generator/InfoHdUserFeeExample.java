package generator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InfoHdUserFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoHdUserFeeExample() {
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

        public Criteria andOfferIdIsNull() {
            addCriterion("OFFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfferIdIsNotNull() {
            addCriterion("OFFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIdEqualTo(Long value) {
            addCriterion("OFFER_ID =", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotEqualTo(Long value) {
            addCriterion("OFFER_ID <>", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThan(Long value) {
            addCriterion("OFFER_ID >", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID >=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThan(Long value) {
            addCriterion("OFFER_ID <", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID <=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdIn(List<Long> values) {
            addCriterion("OFFER_ID in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotIn(List<Long> values) {
            addCriterion("OFFER_ID not in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdBetween(Long value1, Long value2) {
            addCriterion("OFFER_ID between", value1, value2, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotBetween(Long value1, Long value2) {
            addCriterion("OFFER_ID not between", value1, value2, "offerId");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Long value) {
            addCriterion("PROD_ID =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Long value) {
            addCriterion("PROD_ID <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Long value) {
            addCriterion("PROD_ID >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROD_ID >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Long value) {
            addCriterion("PROD_ID <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Long value) {
            addCriterion("PROD_ID <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Long> values) {
            addCriterion("PROD_ID in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Long> values) {
            addCriterion("PROD_ID not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Long value1, Long value2) {
            addCriterion("PROD_ID between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Long value1, Long value2) {
            addCriterion("PROD_ID not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIsNull() {
            addCriterion("OFFER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIsNotNull() {
            addCriterion("OFFER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOfferTypeEqualTo(String value) {
            addCriterion("OFFER_TYPE =", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotEqualTo(String value) {
            addCriterion("OFFER_TYPE <>", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeGreaterThan(String value) {
            addCriterion("OFFER_TYPE >", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFER_TYPE >=", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLessThan(String value) {
            addCriterion("OFFER_TYPE <", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLessThanOrEqualTo(String value) {
            addCriterion("OFFER_TYPE <=", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLike(String value) {
            addCriterion("OFFER_TYPE like", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotLike(String value) {
            addCriterion("OFFER_TYPE not like", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIn(List<String> values) {
            addCriterion("OFFER_TYPE in", values, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotIn(List<String> values) {
            addCriterion("OFFER_TYPE not in", values, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeBetween(String value1, String value2) {
            addCriterion("OFFER_TYPE between", value1, value2, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotBetween(String value1, String value2) {
            addCriterion("OFFER_TYPE not between", value1, value2, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateIsNull() {
            addCriterion("OFFER_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateIsNotNull() {
            addCriterion("OFFER_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("OFFER_START_DATE =", value, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OFFER_START_DATE <>", value, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("OFFER_START_DATE >", value, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OFFER_START_DATE >=", value, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateLessThan(Date value) {
            addCriterionForJDBCDate("OFFER_START_DATE <", value, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OFFER_START_DATE <=", value, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("OFFER_START_DATE in", values, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OFFER_START_DATE not in", values, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OFFER_START_DATE between", value1, value2, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andOfferStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OFFER_START_DATE not between", value1, value2, "offerStartDate");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeIsNull() {
            addCriterion("BILL_TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeIsNotNull() {
            addCriterion("BILL_TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeEqualTo(BigDecimal value) {
            addCriterion("BILL_TOTAL_FEE =", value, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("BILL_TOTAL_FEE <>", value, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("BILL_TOTAL_FEE >", value, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_TOTAL_FEE >=", value, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeLessThan(BigDecimal value) {
            addCriterion("BILL_TOTAL_FEE <", value, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_TOTAL_FEE <=", value, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeIn(List<BigDecimal> values) {
            addCriterion("BILL_TOTAL_FEE in", values, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("BILL_TOTAL_FEE not in", values, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_TOTAL_FEE between", value1, value2, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andBillTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_TOTAL_FEE not between", value1, value2, "billTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeIsNull() {
            addCriterion("CRM_TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeIsNotNull() {
            addCriterion("CRM_TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeEqualTo(String value) {
            addCriterion("CRM_TOTAL_FEE =", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeNotEqualTo(String value) {
            addCriterion("CRM_TOTAL_FEE <>", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeGreaterThan(String value) {
            addCriterion("CRM_TOTAL_FEE >", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeGreaterThanOrEqualTo(String value) {
            addCriterion("CRM_TOTAL_FEE >=", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeLessThan(String value) {
            addCriterion("CRM_TOTAL_FEE <", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeLessThanOrEqualTo(String value) {
            addCriterion("CRM_TOTAL_FEE <=", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeLike(String value) {
            addCriterion("CRM_TOTAL_FEE like", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeNotLike(String value) {
            addCriterion("CRM_TOTAL_FEE not like", value, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeIn(List<String> values) {
            addCriterion("CRM_TOTAL_FEE in", values, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeNotIn(List<String> values) {
            addCriterion("CRM_TOTAL_FEE not in", values, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeBetween(String value1, String value2) {
            addCriterion("CRM_TOTAL_FEE between", value1, value2, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andCrmTotalFeeNotBetween(String value1, String value2) {
            addCriterion("CRM_TOTAL_FEE not between", value1, value2, "crmTotalFee");
            return (Criteria) this;
        }

        public Criteria andEndTypeIsNull() {
            addCriterion("END_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEndTypeIsNotNull() {
            addCriterion("END_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEndTypeEqualTo(String value) {
            addCriterion("END_TYPE =", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotEqualTo(String value) {
            addCriterion("END_TYPE <>", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeGreaterThan(String value) {
            addCriterion("END_TYPE >", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TYPE >=", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeLessThan(String value) {
            addCriterion("END_TYPE <", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeLessThanOrEqualTo(String value) {
            addCriterion("END_TYPE <=", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeLike(String value) {
            addCriterion("END_TYPE like", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotLike(String value) {
            addCriterion("END_TYPE not like", value, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeIn(List<String> values) {
            addCriterion("END_TYPE in", values, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotIn(List<String> values) {
            addCriterion("END_TYPE not in", values, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeBetween(String value1, String value2) {
            addCriterion("END_TYPE between", value1, value2, "endType");
            return (Criteria) this;
        }

        public Criteria andEndTypeNotBetween(String value1, String value2) {
            addCriterion("END_TYPE not between", value1, value2, "endType");
            return (Criteria) this;
        }

        public Criteria andRentMonthIsNull() {
            addCriterion("RENT_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andRentMonthIsNotNull() {
            addCriterion("RENT_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andRentMonthEqualTo(Short value) {
            addCriterion("RENT_MONTH =", value, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthNotEqualTo(Short value) {
            addCriterion("RENT_MONTH <>", value, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthGreaterThan(Short value) {
            addCriterion("RENT_MONTH >", value, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthGreaterThanOrEqualTo(Short value) {
            addCriterion("RENT_MONTH >=", value, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthLessThan(Short value) {
            addCriterion("RENT_MONTH <", value, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthLessThanOrEqualTo(Short value) {
            addCriterion("RENT_MONTH <=", value, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthIn(List<Short> values) {
            addCriterion("RENT_MONTH in", values, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthNotIn(List<Short> values) {
            addCriterion("RENT_MONTH not in", values, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthBetween(Short value1, Short value2) {
            addCriterion("RENT_MONTH between", value1, value2, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andRentMonthNotBetween(Short value1, Short value2) {
            addCriterion("RENT_MONTH not between", value1, value2, "rentMonth");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdIsNull() {
            addCriterion("OFFER_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdIsNotNull() {
            addCriterion("OFFER_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdEqualTo(Long value) {
            addCriterion("OFFER_SPEC_ID =", value, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdNotEqualTo(Long value) {
            addCriterion("OFFER_SPEC_ID <>", value, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdGreaterThan(Long value) {
            addCriterion("OFFER_SPEC_ID >", value, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_SPEC_ID >=", value, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdLessThan(Long value) {
            addCriterion("OFFER_SPEC_ID <", value, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdLessThanOrEqualTo(Long value) {
            addCriterion("OFFER_SPEC_ID <=", value, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdIn(List<Long> values) {
            addCriterion("OFFER_SPEC_ID in", values, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdNotIn(List<Long> values) {
            addCriterion("OFFER_SPEC_ID not in", values, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdBetween(Long value1, Long value2) {
            addCriterion("OFFER_SPEC_ID between", value1, value2, "offerSpecId");
            return (Criteria) this;
        }

        public Criteria andOfferSpecIdNotBetween(Long value1, Long value2) {
            addCriterion("OFFER_SPEC_ID not between", value1, value2, "offerSpecId");
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