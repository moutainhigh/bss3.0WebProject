package generator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BussihallChargeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BussihallChargeRecordExample() {
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

        public Criteria andPaymentIdIsNull() {
            addCriterion("PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_ID =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_ID <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT_ID >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_ID >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(BigDecimal value) {
            addCriterion("PAYMENT_ID <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_ID <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_ID in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_ID not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_ID between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_ID not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdIsNull() {
            addCriterion("OTHER_PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdIsNotNull() {
            addCriterion("OTHER_PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdEqualTo(String value) {
            addCriterion("OTHER_PAYMENT_ID =", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdNotEqualTo(String value) {
            addCriterion("OTHER_PAYMENT_ID <>", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdGreaterThan(String value) {
            addCriterion("OTHER_PAYMENT_ID >", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_PAYMENT_ID >=", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdLessThan(String value) {
            addCriterion("OTHER_PAYMENT_ID <", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("OTHER_PAYMENT_ID <=", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdLike(String value) {
            addCriterion("OTHER_PAYMENT_ID like", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdNotLike(String value) {
            addCriterion("OTHER_PAYMENT_ID not like", value, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdIn(List<String> values) {
            addCriterion("OTHER_PAYMENT_ID in", values, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdNotIn(List<String> values) {
            addCriterion("OTHER_PAYMENT_ID not in", values, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdBetween(String value1, String value2) {
            addCriterion("OTHER_PAYMENT_ID between", value1, value2, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIdNotBetween(String value1, String value2) {
            addCriterion("OTHER_PAYMENT_ID not between", value1, value2, "otherPaymentId");
            return (Criteria) this;
        }

        public Criteria andAccNbrIsNull() {
            addCriterion("ACC_NBR is null");
            return (Criteria) this;
        }

        public Criteria andAccNbrIsNotNull() {
            addCriterion("ACC_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andAccNbrEqualTo(String value) {
            addCriterion("ACC_NBR =", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotEqualTo(String value) {
            addCriterion("ACC_NBR <>", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrGreaterThan(String value) {
            addCriterion("ACC_NBR >", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NBR >=", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrLessThan(String value) {
            addCriterion("ACC_NBR <", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrLessThanOrEqualTo(String value) {
            addCriterion("ACC_NBR <=", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrLike(String value) {
            addCriterion("ACC_NBR like", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotLike(String value) {
            addCriterion("ACC_NBR not like", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrIn(List<String> values) {
            addCriterion("ACC_NBR in", values, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotIn(List<String> values) {
            addCriterion("ACC_NBR not in", values, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrBetween(String value1, String value2) {
            addCriterion("ACC_NBR between", value1, value2, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotBetween(String value1, String value2) {
            addCriterion("ACC_NBR not between", value1, value2, "accNbr");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("BILL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("BILL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("BILL_TYPE =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("BILL_TYPE <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("BILL_TYPE >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_TYPE >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("BILL_TYPE <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_TYPE <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("BILL_TYPE in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("BILL_TYPE not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("BILL_TYPE between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_TYPE not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("PAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("PAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("PAYMENT_DATE =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PAYMENT_DATE <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PAYMENT_DATE >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAYMENT_DATE >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("PAYMENT_DATE <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAYMENT_DATE <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("PAYMENT_DATE in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PAYMENT_DATE not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAYMENT_DATE between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAYMENT_DATE not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
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

        public Criteria andStateEqualTo(Short value) {
            addCriterion("`STATE` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("`STATE` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("`STATE` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("`STATE` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("`STATE` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("`STATE` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("`STATE` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("`STATE` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("`STATE` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("`STATE` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeIsNull() {
            addCriterion("SO_REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeIsNotNull() {
            addCriterion("SO_REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeEqualTo(String value) {
            addCriterion("SO_REGION_CODE =", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeNotEqualTo(String value) {
            addCriterion("SO_REGION_CODE <>", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeGreaterThan(String value) {
            addCriterion("SO_REGION_CODE >", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SO_REGION_CODE >=", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeLessThan(String value) {
            addCriterion("SO_REGION_CODE <", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("SO_REGION_CODE <=", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeLike(String value) {
            addCriterion("SO_REGION_CODE like", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeNotLike(String value) {
            addCriterion("SO_REGION_CODE not like", value, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeIn(List<String> values) {
            addCriterion("SO_REGION_CODE in", values, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeNotIn(List<String> values) {
            addCriterion("SO_REGION_CODE not in", values, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeBetween(String value1, String value2) {
            addCriterion("SO_REGION_CODE between", value1, value2, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andSoRegionCodeNotBetween(String value1, String value2) {
            addCriterion("SO_REGION_CODE not between", value1, value2, "soRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeIsNull() {
            addCriterion("IS_REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeIsNotNull() {
            addCriterion("IS_REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeEqualTo(String value) {
            addCriterion("IS_REGION_CODE =", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeNotEqualTo(String value) {
            addCriterion("IS_REGION_CODE <>", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeGreaterThan(String value) {
            addCriterion("IS_REGION_CODE >", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REGION_CODE >=", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeLessThan(String value) {
            addCriterion("IS_REGION_CODE <", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("IS_REGION_CODE <=", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeLike(String value) {
            addCriterion("IS_REGION_CODE like", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeNotLike(String value) {
            addCriterion("IS_REGION_CODE not like", value, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeIn(List<String> values) {
            addCriterion("IS_REGION_CODE in", values, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeNotIn(List<String> values) {
            addCriterion("IS_REGION_CODE not in", values, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeBetween(String value1, String value2) {
            addCriterion("IS_REGION_CODE between", value1, value2, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andIsRegionCodeNotBetween(String value1, String value2) {
            addCriterion("IS_REGION_CODE not between", value1, value2, "isRegionCode");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("STAFF_ID like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("STAFF_ID not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNull() {
            addCriterion("BUSI_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNotNull() {
            addCriterion("BUSI_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeEqualTo(String value) {
            addCriterion("BUSI_CODE =", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotEqualTo(String value) {
            addCriterion("BUSI_CODE <>", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThan(String value) {
            addCriterion("BUSI_CODE >", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_CODE >=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThan(String value) {
            addCriterion("BUSI_CODE <", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_CODE <=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLike(String value) {
            addCriterion("BUSI_CODE like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotLike(String value) {
            addCriterion("BUSI_CODE not like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIn(List<String> values) {
            addCriterion("BUSI_CODE in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotIn(List<String> values) {
            addCriterion("BUSI_CODE not in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeBetween(String value1, String value2) {
            addCriterion("BUSI_CODE between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_CODE not between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("MSG is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("MSG =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("MSG <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("MSG >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("MSG >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("MSG <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("MSG <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("MSG like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("MSG not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("MSG in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("MSG not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("MSG between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("MSG not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdIsNull() {
            addCriterion("UNPAY_PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdIsNotNull() {
            addCriterion("UNPAY_PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdEqualTo(String value) {
            addCriterion("UNPAY_PAYMENT_ID =", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdNotEqualTo(String value) {
            addCriterion("UNPAY_PAYMENT_ID <>", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdGreaterThan(String value) {
            addCriterion("UNPAY_PAYMENT_ID >", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNPAY_PAYMENT_ID >=", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdLessThan(String value) {
            addCriterion("UNPAY_PAYMENT_ID <", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("UNPAY_PAYMENT_ID <=", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdLike(String value) {
            addCriterion("UNPAY_PAYMENT_ID like", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdNotLike(String value) {
            addCriterion("UNPAY_PAYMENT_ID not like", value, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdIn(List<String> values) {
            addCriterion("UNPAY_PAYMENT_ID in", values, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdNotIn(List<String> values) {
            addCriterion("UNPAY_PAYMENT_ID not in", values, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdBetween(String value1, String value2) {
            addCriterion("UNPAY_PAYMENT_ID between", value1, value2, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayPaymentIdNotBetween(String value1, String value2) {
            addCriterion("UNPAY_PAYMENT_ID not between", value1, value2, "unpayPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdIsNull() {
            addCriterion("UNPAY_OTHER_PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdIsNotNull() {
            addCriterion("UNPAY_OTHER_PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdEqualTo(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID =", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdNotEqualTo(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID <>", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdGreaterThan(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID >", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID >=", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdLessThan(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID <", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID <=", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdLike(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID like", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdNotLike(String value) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID not like", value, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdIn(List<String> values) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID in", values, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdNotIn(List<String> values) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID not in", values, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdBetween(String value1, String value2) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID between", value1, value2, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andUnpayOtherPaymentIdNotBetween(String value1, String value2) {
            addCriterion("UNPAY_OTHER_PAYMENT_ID not between", value1, value2, "unpayOtherPaymentId");
            return (Criteria) this;
        }

        public Criteria andStsDateIsNull() {
            addCriterion("STS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStsDateIsNotNull() {
            addCriterion("STS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStsDateEqualTo(String value) {
            addCriterion("STS_DATE =", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateNotEqualTo(String value) {
            addCriterion("STS_DATE <>", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateGreaterThan(String value) {
            addCriterion("STS_DATE >", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateGreaterThanOrEqualTo(String value) {
            addCriterion("STS_DATE >=", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateLessThan(String value) {
            addCriterion("STS_DATE <", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateLessThanOrEqualTo(String value) {
            addCriterion("STS_DATE <=", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateLike(String value) {
            addCriterion("STS_DATE like", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateNotLike(String value) {
            addCriterion("STS_DATE not like", value, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateIn(List<String> values) {
            addCriterion("STS_DATE in", values, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateNotIn(List<String> values) {
            addCriterion("STS_DATE not in", values, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateBetween(String value1, String value2) {
            addCriterion("STS_DATE between", value1, value2, "stsDate");
            return (Criteria) this;
        }

        public Criteria andStsDateNotBetween(String value1, String value2) {
            addCriterion("STS_DATE not between", value1, value2, "stsDate");
            return (Criteria) this;
        }

        public Criteria andRem1IsNull() {
            addCriterion("REM1 is null");
            return (Criteria) this;
        }

        public Criteria andRem1IsNotNull() {
            addCriterion("REM1 is not null");
            return (Criteria) this;
        }

        public Criteria andRem1EqualTo(String value) {
            addCriterion("REM1 =", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotEqualTo(String value) {
            addCriterion("REM1 <>", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1GreaterThan(String value) {
            addCriterion("REM1 >", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1GreaterThanOrEqualTo(String value) {
            addCriterion("REM1 >=", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1LessThan(String value) {
            addCriterion("REM1 <", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1LessThanOrEqualTo(String value) {
            addCriterion("REM1 <=", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1Like(String value) {
            addCriterion("REM1 like", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotLike(String value) {
            addCriterion("REM1 not like", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1In(List<String> values) {
            addCriterion("REM1 in", values, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotIn(List<String> values) {
            addCriterion("REM1 not in", values, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1Between(String value1, String value2) {
            addCriterion("REM1 between", value1, value2, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotBetween(String value1, String value2) {
            addCriterion("REM1 not between", value1, value2, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem2IsNull() {
            addCriterion("REM2 is null");
            return (Criteria) this;
        }

        public Criteria andRem2IsNotNull() {
            addCriterion("REM2 is not null");
            return (Criteria) this;
        }

        public Criteria andRem2EqualTo(String value) {
            addCriterion("REM2 =", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2NotEqualTo(String value) {
            addCriterion("REM2 <>", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2GreaterThan(String value) {
            addCriterion("REM2 >", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2GreaterThanOrEqualTo(String value) {
            addCriterion("REM2 >=", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2LessThan(String value) {
            addCriterion("REM2 <", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2LessThanOrEqualTo(String value) {
            addCriterion("REM2 <=", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2Like(String value) {
            addCriterion("REM2 like", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2NotLike(String value) {
            addCriterion("REM2 not like", value, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2In(List<String> values) {
            addCriterion("REM2 in", values, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2NotIn(List<String> values) {
            addCriterion("REM2 not in", values, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2Between(String value1, String value2) {
            addCriterion("REM2 between", value1, value2, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem2NotBetween(String value1, String value2) {
            addCriterion("REM2 not between", value1, value2, "rem2");
            return (Criteria) this;
        }

        public Criteria andRem3IsNull() {
            addCriterion("REM3 is null");
            return (Criteria) this;
        }

        public Criteria andRem3IsNotNull() {
            addCriterion("REM3 is not null");
            return (Criteria) this;
        }

        public Criteria andRem3EqualTo(String value) {
            addCriterion("REM3 =", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3NotEqualTo(String value) {
            addCriterion("REM3 <>", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3GreaterThan(String value) {
            addCriterion("REM3 >", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3GreaterThanOrEqualTo(String value) {
            addCriterion("REM3 >=", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3LessThan(String value) {
            addCriterion("REM3 <", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3LessThanOrEqualTo(String value) {
            addCriterion("REM3 <=", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3Like(String value) {
            addCriterion("REM3 like", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3NotLike(String value) {
            addCriterion("REM3 not like", value, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3In(List<String> values) {
            addCriterion("REM3 in", values, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3NotIn(List<String> values) {
            addCriterion("REM3 not in", values, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3Between(String value1, String value2) {
            addCriterion("REM3 between", value1, value2, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem3NotBetween(String value1, String value2) {
            addCriterion("REM3 not between", value1, value2, "rem3");
            return (Criteria) this;
        }

        public Criteria andRem4IsNull() {
            addCriterion("REM4 is null");
            return (Criteria) this;
        }

        public Criteria andRem4IsNotNull() {
            addCriterion("REM4 is not null");
            return (Criteria) this;
        }

        public Criteria andRem4EqualTo(String value) {
            addCriterion("REM4 =", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4NotEqualTo(String value) {
            addCriterion("REM4 <>", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4GreaterThan(String value) {
            addCriterion("REM4 >", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4GreaterThanOrEqualTo(String value) {
            addCriterion("REM4 >=", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4LessThan(String value) {
            addCriterion("REM4 <", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4LessThanOrEqualTo(String value) {
            addCriterion("REM4 <=", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4Like(String value) {
            addCriterion("REM4 like", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4NotLike(String value) {
            addCriterion("REM4 not like", value, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4In(List<String> values) {
            addCriterion("REM4 in", values, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4NotIn(List<String> values) {
            addCriterion("REM4 not in", values, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4Between(String value1, String value2) {
            addCriterion("REM4 between", value1, value2, "rem4");
            return (Criteria) this;
        }

        public Criteria andRem4NotBetween(String value1, String value2) {
            addCriterion("REM4 not between", value1, value2, "rem4");
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