package generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProdInstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdInstExample() {
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

        public Criteria andProdInstIdIsNull() {
            addCriterion("PROD_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdInstIdIsNotNull() {
            addCriterion("PROD_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdInstIdEqualTo(Long value) {
            addCriterion("PROD_INST_ID =", value, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdNotEqualTo(Long value) {
            addCriterion("PROD_INST_ID <>", value, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdGreaterThan(Long value) {
            addCriterion("PROD_INST_ID >", value, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROD_INST_ID >=", value, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdLessThan(Long value) {
            addCriterion("PROD_INST_ID <", value, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdLessThanOrEqualTo(Long value) {
            addCriterion("PROD_INST_ID <=", value, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdIn(List<Long> values) {
            addCriterion("PROD_INST_ID in", values, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdNotIn(List<Long> values) {
            addCriterion("PROD_INST_ID not in", values, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdBetween(Long value1, Long value2) {
            addCriterion("PROD_INST_ID between", value1, value2, "prodInstId");
            return (Criteria) this;
        }

        public Criteria andProdInstIdNotBetween(Long value1, Long value2) {
            addCriterion("PROD_INST_ID not between", value1, value2, "prodInstId");
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

        public Criteria andProdIdEqualTo(Integer value) {
            addCriterion("PROD_ID =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Integer value) {
            addCriterion("PROD_ID <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Integer value) {
            addCriterion("PROD_ID >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROD_ID >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Integer value) {
            addCriterion("PROD_ID <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROD_ID <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Integer> values) {
            addCriterion("PROD_ID in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Integer> values) {
            addCriterion("PROD_ID not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Integer value1, Integer value2) {
            addCriterion("PROD_ID between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROD_ID not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdIsNull() {
            addCriterion("ACC_PROD_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdIsNotNull() {
            addCriterion("ACC_PROD_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdEqualTo(Long value) {
            addCriterion("ACC_PROD_INST_ID =", value, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdNotEqualTo(Long value) {
            addCriterion("ACC_PROD_INST_ID <>", value, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdGreaterThan(Long value) {
            addCriterion("ACC_PROD_INST_ID >", value, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACC_PROD_INST_ID >=", value, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdLessThan(Long value) {
            addCriterion("ACC_PROD_INST_ID <", value, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdLessThanOrEqualTo(Long value) {
            addCriterion("ACC_PROD_INST_ID <=", value, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdIn(List<Long> values) {
            addCriterion("ACC_PROD_INST_ID in", values, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdNotIn(List<Long> values) {
            addCriterion("ACC_PROD_INST_ID not in", values, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdBetween(Long value1, Long value2) {
            addCriterion("ACC_PROD_INST_ID between", value1, value2, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andAccProdInstIdNotBetween(Long value1, Long value2) {
            addCriterion("ACC_PROD_INST_ID not between", value1, value2, "accProdInstId");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeIsNull() {
            addCriterion("PROD_USE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeIsNotNull() {
            addCriterion("PROD_USE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeEqualTo(String value) {
            addCriterion("PROD_USE_TYPE =", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeNotEqualTo(String value) {
            addCriterion("PROD_USE_TYPE <>", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeGreaterThan(String value) {
            addCriterion("PROD_USE_TYPE >", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_USE_TYPE >=", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeLessThan(String value) {
            addCriterion("PROD_USE_TYPE <", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeLessThanOrEqualTo(String value) {
            addCriterion("PROD_USE_TYPE <=", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeLike(String value) {
            addCriterion("PROD_USE_TYPE like", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeNotLike(String value) {
            addCriterion("PROD_USE_TYPE not like", value, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeIn(List<String> values) {
            addCriterion("PROD_USE_TYPE in", values, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeNotIn(List<String> values) {
            addCriterion("PROD_USE_TYPE not in", values, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeBetween(String value1, String value2) {
            addCriterion("PROD_USE_TYPE between", value1, value2, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andProdUseTypeNotBetween(String value1, String value2) {
            addCriterion("PROD_USE_TYPE not between", value1, value2, "prodUseType");
            return (Criteria) this;
        }

        public Criteria andAccNumIsNull() {
            addCriterion("ACC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAccNumIsNotNull() {
            addCriterion("ACC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAccNumEqualTo(String value) {
            addCriterion("ACC_NUM =", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotEqualTo(String value) {
            addCriterion("ACC_NUM <>", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThan(String value) {
            addCriterion("ACC_NUM >", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NUM >=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThan(String value) {
            addCriterion("ACC_NUM <", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThanOrEqualTo(String value) {
            addCriterion("ACC_NUM <=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLike(String value) {
            addCriterion("ACC_NUM like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotLike(String value) {
            addCriterion("ACC_NUM not like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumIn(List<String> values) {
            addCriterion("ACC_NUM in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotIn(List<String> values) {
            addCriterion("ACC_NUM not in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumBetween(String value1, String value2) {
            addCriterion("ACC_NUM between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotBetween(String value1, String value2) {
            addCriterion("ACC_NUM not between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdIsNull() {
            addCriterion("PAYMENT_MODE_CD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdIsNotNull() {
            addCriterion("PAYMENT_MODE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdEqualTo(String value) {
            addCriterion("PAYMENT_MODE_CD =", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdNotEqualTo(String value) {
            addCriterion("PAYMENT_MODE_CD <>", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdGreaterThan(String value) {
            addCriterion("PAYMENT_MODE_CD >", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_MODE_CD >=", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdLessThan(String value) {
            addCriterion("PAYMENT_MODE_CD <", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_MODE_CD <=", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdLike(String value) {
            addCriterion("PAYMENT_MODE_CD like", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdNotLike(String value) {
            addCriterion("PAYMENT_MODE_CD not like", value, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdIn(List<String> values) {
            addCriterion("PAYMENT_MODE_CD in", values, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdNotIn(List<String> values) {
            addCriterion("PAYMENT_MODE_CD not in", values, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdBetween(String value1, String value2) {
            addCriterion("PAYMENT_MODE_CD between", value1, value2, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andPaymentModeCdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_MODE_CD not between", value1, value2, "paymentModeCd");
            return (Criteria) this;
        }

        public Criteria andAddressDescIsNull() {
            addCriterion("ADDRESS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAddressDescIsNotNull() {
            addCriterion("ADDRESS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDescEqualTo(String value) {
            addCriterion("ADDRESS_DESC =", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotEqualTo(String value) {
            addCriterion("ADDRESS_DESC <>", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescGreaterThan(String value) {
            addCriterion("ADDRESS_DESC >", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DESC >=", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescLessThan(String value) {
            addCriterion("ADDRESS_DESC <", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DESC <=", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescLike(String value) {
            addCriterion("ADDRESS_DESC like", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotLike(String value) {
            addCriterion("ADDRESS_DESC not like", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescIn(List<String> values) {
            addCriterion("ADDRESS_DESC in", values, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotIn(List<String> values) {
            addCriterion("ADDRESS_DESC not in", values, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescBetween(String value1, String value2) {
            addCriterion("ADDRESS_DESC between", value1, value2, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_DESC not between", value1, value2, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdIsNull() {
            addCriterion("OWNER_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdIsNotNull() {
            addCriterion("OWNER_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdEqualTo(Long value) {
            addCriterion("OWNER_CUST_ID =", value, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdNotEqualTo(Long value) {
            addCriterion("OWNER_CUST_ID <>", value, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdGreaterThan(Long value) {
            addCriterion("OWNER_CUST_ID >", value, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OWNER_CUST_ID >=", value, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdLessThan(Long value) {
            addCriterion("OWNER_CUST_ID <", value, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdLessThanOrEqualTo(Long value) {
            addCriterion("OWNER_CUST_ID <=", value, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdIn(List<Long> values) {
            addCriterion("OWNER_CUST_ID in", values, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdNotIn(List<Long> values) {
            addCriterion("OWNER_CUST_ID not in", values, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdBetween(Long value1, Long value2) {
            addCriterion("OWNER_CUST_ID between", value1, value2, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andOwnerCustIdNotBetween(Long value1, Long value2) {
            addCriterion("OWNER_CUST_ID not between", value1, value2, "ownerCustId");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdIsNull() {
            addCriterion("PROD_INST_PWD is null");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdIsNotNull() {
            addCriterion("PROD_INST_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdEqualTo(String value) {
            addCriterion("PROD_INST_PWD =", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdNotEqualTo(String value) {
            addCriterion("PROD_INST_PWD <>", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdGreaterThan(String value) {
            addCriterion("PROD_INST_PWD >", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_INST_PWD >=", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdLessThan(String value) {
            addCriterion("PROD_INST_PWD <", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdLessThanOrEqualTo(String value) {
            addCriterion("PROD_INST_PWD <=", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdLike(String value) {
            addCriterion("PROD_INST_PWD like", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdNotLike(String value) {
            addCriterion("PROD_INST_PWD not like", value, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdIn(List<String> values) {
            addCriterion("PROD_INST_PWD in", values, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdNotIn(List<String> values) {
            addCriterion("PROD_INST_PWD not in", values, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdBetween(String value1, String value2) {
            addCriterion("PROD_INST_PWD between", value1, value2, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andProdInstPwdNotBetween(String value1, String value2) {
            addCriterion("PROD_INST_PWD not between", value1, value2, "prodInstPwd");
            return (Criteria) this;
        }

        public Criteria andExchIdIsNull() {
            addCriterion("EXCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andExchIdIsNotNull() {
            addCriterion("EXCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExchIdEqualTo(Integer value) {
            addCriterion("EXCH_ID =", value, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdNotEqualTo(Integer value) {
            addCriterion("EXCH_ID <>", value, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdGreaterThan(Integer value) {
            addCriterion("EXCH_ID >", value, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCH_ID >=", value, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdLessThan(Integer value) {
            addCriterion("EXCH_ID <", value, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXCH_ID <=", value, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdIn(List<Integer> values) {
            addCriterion("EXCH_ID in", values, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdNotIn(List<Integer> values) {
            addCriterion("EXCH_ID not in", values, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdBetween(Integer value1, Integer value2) {
            addCriterion("EXCH_ID between", value1, value2, "exchId");
            return (Criteria) this;
        }

        public Criteria andExchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCH_ID not between", value1, value2, "exchId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("ADDRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("ADDRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(String value) {
            addCriterion("ADDRESS_ID =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(String value) {
            addCriterion("ADDRESS_ID <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(String value) {
            addCriterion("ADDRESS_ID >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_ID >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(String value) {
            addCriterion("ADDRESS_ID <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_ID <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLike(String value) {
            addCriterion("ADDRESS_ID like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotLike(String value) {
            addCriterion("ADDRESS_ID not like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<String> values) {
            addCriterion("ADDRESS_ID in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<String> values) {
            addCriterion("ADDRESS_ID not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(String value1, String value2) {
            addCriterion("ADDRESS_ID between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_ID not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("REGION_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("REGION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Long value) {
            addCriterion("REGION_ID =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Long value) {
            addCriterion("REGION_ID <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Long value) {
            addCriterion("REGION_ID >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REGION_ID >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Long value) {
            addCriterion("REGION_ID <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Long value) {
            addCriterion("REGION_ID <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Long> values) {
            addCriterion("REGION_ID in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Long> values) {
            addCriterion("REGION_ID not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Long value1, Long value2) {
            addCriterion("REGION_ID between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Long value1, Long value2) {
            addCriterion("REGION_ID not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andLanIdIsNull() {
            addCriterion("LAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLanIdIsNotNull() {
            addCriterion("LAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLanIdEqualTo(Long value) {
            addCriterion("LAN_ID =", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdNotEqualTo(Long value) {
            addCriterion("LAN_ID <>", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdGreaterThan(Long value) {
            addCriterion("LAN_ID >", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAN_ID >=", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdLessThan(Long value) {
            addCriterion("LAN_ID <", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdLessThanOrEqualTo(Long value) {
            addCriterion("LAN_ID <=", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdIn(List<Long> values) {
            addCriterion("LAN_ID in", values, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdNotIn(List<Long> values) {
            addCriterion("LAN_ID not in", values, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdBetween(Long value1, Long value2) {
            addCriterion("LAN_ID between", value1, value2, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdNotBetween(Long value1, Long value2) {
            addCriterion("LAN_ID not between", value1, value2, "lanId");
            return (Criteria) this;
        }

        public Criteria andActDateIsNull() {
            addCriterion("ACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActDateIsNotNull() {
            addCriterion("ACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DATE =", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DATE <>", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACT_DATE >", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DATE >=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThan(Date value) {
            addCriterionForJDBCDate("ACT_DATE <", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DATE <=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACT_DATE in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACT_DATE not in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACT_DATE between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACT_DATE not between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateIsNull() {
            addCriterion("BEGIN_RENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateIsNotNull() {
            addCriterion("BEGIN_RENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE =", value, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE <>", value, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE >", value, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE >=", value, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateLessThan(Date value) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE <", value, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE <=", value, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateIn(List<Date> values) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE in", values, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE not in", values, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE between", value1, value2, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andBeginRentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGIN_RENT_DATE not between", value1, value2, "beginRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateIsNull() {
            addCriterion("STOP_RENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStopRentDateIsNotNull() {
            addCriterion("STOP_RENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStopRentDateEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_RENT_DATE =", value, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_RENT_DATE <>", value, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STOP_RENT_DATE >", value, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_RENT_DATE >=", value, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateLessThan(Date value) {
            addCriterionForJDBCDate("STOP_RENT_DATE <", value, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_RENT_DATE <=", value, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateIn(List<Date> values) {
            addCriterionForJDBCDate("STOP_RENT_DATE in", values, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STOP_RENT_DATE not in", values, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STOP_RENT_DATE between", value1, value2, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStopRentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STOP_RENT_DATE not between", value1, value2, "stopRentDate");
            return (Criteria) this;
        }

        public Criteria andStatusCdIsNull() {
            addCriterion("STATUS_CD is null");
            return (Criteria) this;
        }

        public Criteria andStatusCdIsNotNull() {
            addCriterion("STATUS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCdEqualTo(String value) {
            addCriterion("STATUS_CD =", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotEqualTo(String value) {
            addCriterion("STATUS_CD <>", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdGreaterThan(String value) {
            addCriterion("STATUS_CD >", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_CD >=", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLessThan(String value) {
            addCriterion("STATUS_CD <", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLessThanOrEqualTo(String value) {
            addCriterion("STATUS_CD <=", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLike(String value) {
            addCriterion("STATUS_CD like", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotLike(String value) {
            addCriterion("STATUS_CD not like", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdIn(List<String> values) {
            addCriterion("STATUS_CD in", values, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotIn(List<String> values) {
            addCriterion("STATUS_CD not in", values, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdBetween(String value1, String value2) {
            addCriterion("STATUS_CD between", value1, value2, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotBetween(String value1, String value2) {
            addCriterion("STATUS_CD not between", value1, value2, "statusCd");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdIsNull() {
            addCriterion("CREATE_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdIsNotNull() {
            addCriterion("CREATE_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdEqualTo(Long value) {
            addCriterion("CREATE_ORG_ID =", value, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdNotEqualTo(Long value) {
            addCriterion("CREATE_ORG_ID <>", value, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdGreaterThan(Long value) {
            addCriterion("CREATE_ORG_ID >", value, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_ORG_ID >=", value, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdLessThan(Long value) {
            addCriterion("CREATE_ORG_ID <", value, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_ORG_ID <=", value, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdIn(List<Long> values) {
            addCriterion("CREATE_ORG_ID in", values, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdNotIn(List<Long> values) {
            addCriterion("CREATE_ORG_ID not in", values, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_ORG_ID between", value1, value2, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_ORG_ID not between", value1, value2, "createOrgId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNull() {
            addCriterion("CREATE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNotNull() {
            addCriterion("CREATE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffEqualTo(Long value) {
            addCriterion("CREATE_STAFF =", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotEqualTo(Long value) {
            addCriterion("CREATE_STAFF <>", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThan(Long value) {
            addCriterion("CREATE_STAFF >", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_STAFF >=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThan(Long value) {
            addCriterion("CREATE_STAFF <", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_STAFF <=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIn(List<Long> values) {
            addCriterion("CREATE_STAFF in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotIn(List<Long> values) {
            addCriterion("CREATE_STAFF not in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffBetween(Long value1, Long value2) {
            addCriterion("CREATE_STAFF between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_STAFF not between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNull() {
            addCriterion("UPDATE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNotNull() {
            addCriterion("UPDATE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffEqualTo(Long value) {
            addCriterion("UPDATE_STAFF =", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotEqualTo(Long value) {
            addCriterion("UPDATE_STAFF <>", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThan(Long value) {
            addCriterion("UPDATE_STAFF >", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_STAFF >=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThan(Long value) {
            addCriterion("UPDATE_STAFF <", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_STAFF <=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIn(List<Long> values) {
            addCriterion("UPDATE_STAFF in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotIn(List<Long> values) {
            addCriterion("UPDATE_STAFF not in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffBetween(Long value1, Long value2) {
            addCriterion("UPDATE_STAFF between", value1, value2, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_STAFF not between", value1, value2, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateIsNull() {
            addCriterion("STATUS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStatusDateIsNotNull() {
            addCriterion("STATUS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDateEqualTo(Date value) {
            addCriterionForJDBCDate("STATUS_DATE =", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STATUS_DATE <>", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STATUS_DATE >", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STATUS_DATE >=", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateLessThan(Date value) {
            addCriterionForJDBCDate("STATUS_DATE <", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STATUS_DATE <=", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateIn(List<Date> values) {
            addCriterionForJDBCDate("STATUS_DATE in", values, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STATUS_DATE not in", values, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STATUS_DATE between", value1, value2, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STATUS_DATE not between", value1, value2, "statusDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateIsNull() {
            addCriterion("FIRST_FINISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateIsNotNull() {
            addCriterion("FIRST_FINISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE =", value, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE <>", value, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE >", value, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE >=", value, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateLessThan(Date value) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE <", value, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE <=", value, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateIn(List<Date> values) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE in", values, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE not in", values, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE between", value1, value2, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andFirstFinishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRST_FINISH_DATE not between", value1, value2, "firstFinishDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateIsNull() {
            addCriterion("BUSI_MOD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBusiModDateIsNotNull() {
            addCriterion("BUSI_MOD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiModDateEqualTo(Date value) {
            addCriterionForJDBCDate("BUSI_MOD_DATE =", value, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BUSI_MOD_DATE <>", value, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BUSI_MOD_DATE >", value, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BUSI_MOD_DATE >=", value, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateLessThan(Date value) {
            addCriterionForJDBCDate("BUSI_MOD_DATE <", value, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BUSI_MOD_DATE <=", value, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateIn(List<Date> values) {
            addCriterionForJDBCDate("BUSI_MOD_DATE in", values, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BUSI_MOD_DATE not in", values, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BUSI_MOD_DATE between", value1, value2, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andBusiModDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BUSI_MOD_DATE not between", value1, value2, "busiModDate");
            return (Criteria) this;
        }

        public Criteria andUseCustIdIsNull() {
            addCriterion("USE_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andUseCustIdIsNotNull() {
            addCriterion("USE_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUseCustIdEqualTo(Long value) {
            addCriterion("USE_CUST_ID =", value, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdNotEqualTo(Long value) {
            addCriterion("USE_CUST_ID <>", value, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdGreaterThan(Long value) {
            addCriterion("USE_CUST_ID >", value, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USE_CUST_ID >=", value, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdLessThan(Long value) {
            addCriterion("USE_CUST_ID <", value, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdLessThanOrEqualTo(Long value) {
            addCriterion("USE_CUST_ID <=", value, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdIn(List<Long> values) {
            addCriterion("USE_CUST_ID in", values, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdNotIn(List<Long> values) {
            addCriterion("USE_CUST_ID not in", values, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdBetween(Long value1, Long value2) {
            addCriterion("USE_CUST_ID between", value1, value2, "useCustId");
            return (Criteria) this;
        }

        public Criteria andUseCustIdNotBetween(Long value1, Long value2) {
            addCriterion("USE_CUST_ID not between", value1, value2, "useCustId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdIsNull() {
            addCriterion("LAST_ORDER_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdIsNotNull() {
            addCriterion("LAST_ORDER_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdEqualTo(Long value) {
            addCriterion("LAST_ORDER_ITEM_ID =", value, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdNotEqualTo(Long value) {
            addCriterion("LAST_ORDER_ITEM_ID <>", value, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdGreaterThan(Long value) {
            addCriterion("LAST_ORDER_ITEM_ID >", value, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_ORDER_ITEM_ID >=", value, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdLessThan(Long value) {
            addCriterion("LAST_ORDER_ITEM_ID <", value, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdLessThanOrEqualTo(Long value) {
            addCriterion("LAST_ORDER_ITEM_ID <=", value, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdIn(List<Long> values) {
            addCriterion("LAST_ORDER_ITEM_ID in", values, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdNotIn(List<Long> values) {
            addCriterion("LAST_ORDER_ITEM_ID not in", values, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdBetween(Long value1, Long value2) {
            addCriterion("LAST_ORDER_ITEM_ID between", value1, value2, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andLastOrderItemIdNotBetween(Long value1, Long value2) {
            addCriterion("LAST_ORDER_ITEM_ID not between", value1, value2, "lastOrderItemId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdIsNull() {
            addCriterion("POINT_OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdIsNotNull() {
            addCriterion("POINT_OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdEqualTo(Long value) {
            addCriterion("POINT_OWNER_ID =", value, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdNotEqualTo(Long value) {
            addCriterion("POINT_OWNER_ID <>", value, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdGreaterThan(Long value) {
            addCriterion("POINT_OWNER_ID >", value, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POINT_OWNER_ID >=", value, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdLessThan(Long value) {
            addCriterion("POINT_OWNER_ID <", value, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("POINT_OWNER_ID <=", value, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdIn(List<Long> values) {
            addCriterion("POINT_OWNER_ID in", values, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdNotIn(List<Long> values) {
            addCriterion("POINT_OWNER_ID not in", values, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdBetween(Long value1, Long value2) {
            addCriterion("POINT_OWNER_ID between", value1, value2, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andPointOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("POINT_OWNER_ID not between", value1, value2, "pointOwnerId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdIsNull() {
            addCriterion("EXT_PROD_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdIsNotNull() {
            addCriterion("EXT_PROD_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdEqualTo(String value) {
            addCriterion("EXT_PROD_INST_ID =", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdNotEqualTo(String value) {
            addCriterion("EXT_PROD_INST_ID <>", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdGreaterThan(String value) {
            addCriterion("EXT_PROD_INST_ID >", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_PROD_INST_ID >=", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdLessThan(String value) {
            addCriterion("EXT_PROD_INST_ID <", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdLessThanOrEqualTo(String value) {
            addCriterion("EXT_PROD_INST_ID <=", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdLike(String value) {
            addCriterion("EXT_PROD_INST_ID like", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdNotLike(String value) {
            addCriterion("EXT_PROD_INST_ID not like", value, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdIn(List<String> values) {
            addCriterion("EXT_PROD_INST_ID in", values, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdNotIn(List<String> values) {
            addCriterion("EXT_PROD_INST_ID not in", values, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdBetween(String value1, String value2) {
            addCriterion("EXT_PROD_INST_ID between", value1, value2, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andExtProdInstIdNotBetween(String value1, String value2) {
            addCriterion("EXT_PROD_INST_ID not between", value1, value2, "extProdInstId");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrIsNull() {
            addCriterion("GRP_PROD_NBR is null");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrIsNotNull() {
            addCriterion("GRP_PROD_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrEqualTo(String value) {
            addCriterion("GRP_PROD_NBR =", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrNotEqualTo(String value) {
            addCriterion("GRP_PROD_NBR <>", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrGreaterThan(String value) {
            addCriterion("GRP_PROD_NBR >", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrGreaterThanOrEqualTo(String value) {
            addCriterion("GRP_PROD_NBR >=", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrLessThan(String value) {
            addCriterion("GRP_PROD_NBR <", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrLessThanOrEqualTo(String value) {
            addCriterion("GRP_PROD_NBR <=", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrLike(String value) {
            addCriterion("GRP_PROD_NBR like", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrNotLike(String value) {
            addCriterion("GRP_PROD_NBR not like", value, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrIn(List<String> values) {
            addCriterion("GRP_PROD_NBR in", values, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrNotIn(List<String> values) {
            addCriterion("GRP_PROD_NBR not in", values, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrBetween(String value1, String value2) {
            addCriterion("GRP_PROD_NBR between", value1, value2, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andGrpProdNbrNotBetween(String value1, String value2) {
            addCriterion("GRP_PROD_NBR not between", value1, value2, "grpProdNbr");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("ROUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("ROUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Long value) {
            addCriterion("ROUTE_ID =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Long value) {
            addCriterion("ROUTE_ID <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Long value) {
            addCriterion("ROUTE_ID >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROUTE_ID >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Long value) {
            addCriterion("ROUTE_ID <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Long value) {
            addCriterion("ROUTE_ID <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Long> values) {
            addCriterion("ROUTE_ID in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Long> values) {
            addCriterion("ROUTE_ID not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Long value1, Long value2) {
            addCriterion("ROUTE_ID between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Long value1, Long value2) {
            addCriterion("ROUTE_ID not between", value1, value2, "routeId");
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