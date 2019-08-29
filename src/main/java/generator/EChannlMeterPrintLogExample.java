package generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EChannlMeterPrintLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EChannlMeterPrintLogExample() {
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

        public Criteria andKeyIdIsNull() {
            addCriterion("KEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNotNull() {
            addCriterion("KEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIdEqualTo(String value) {
            addCriterion("KEY_ID =", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotEqualTo(String value) {
            addCriterion("KEY_ID <>", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThan(String value) {
            addCriterion("KEY_ID >", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_ID >=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThan(String value) {
            addCriterion("KEY_ID <", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThanOrEqualTo(String value) {
            addCriterion("KEY_ID <=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLike(String value) {
            addCriterion("KEY_ID like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotLike(String value) {
            addCriterion("KEY_ID not like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdIn(List<String> values) {
            addCriterion("KEY_ID in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotIn(List<String> values) {
            addCriterion("KEY_ID not in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdBetween(String value1, String value2) {
            addCriterion("KEY_ID between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotBetween(String value1, String value2) {
            addCriterion("KEY_ID not between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdIsNull() {
            addCriterion("PHONE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIdIsNotNull() {
            addCriterion("PHONE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneIdEqualTo(String value) {
            addCriterion("PHONE_ID =", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdNotEqualTo(String value) {
            addCriterion("PHONE_ID <>", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdGreaterThan(String value) {
            addCriterion("PHONE_ID >", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_ID >=", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdLessThan(String value) {
            addCriterion("PHONE_ID <", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdLessThanOrEqualTo(String value) {
            addCriterion("PHONE_ID <=", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdLike(String value) {
            addCriterion("PHONE_ID like", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdNotLike(String value) {
            addCriterion("PHONE_ID not like", value, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdIn(List<String> values) {
            addCriterion("PHONE_ID in", values, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdNotIn(List<String> values) {
            addCriterion("PHONE_ID not in", values, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdBetween(String value1, String value2) {
            addCriterion("PHONE_ID between", value1, value2, "phoneId");
            return (Criteria) this;
        }

        public Criteria andPhoneIdNotBetween(String value1, String value2) {
            addCriterion("PHONE_ID not between", value1, value2, "phoneId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("SYSTEM_ID like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("SYSTEM_ID not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("ACTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("ACTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(String value) {
            addCriterion("ACTION_TYPE =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(String value) {
            addCriterion("ACTION_TYPE <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(String value) {
            addCriterion("ACTION_TYPE >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(String value) {
            addCriterion("ACTION_TYPE <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLike(String value) {
            addCriterion("ACTION_TYPE like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotLike(String value) {
            addCriterion("ACTION_TYPE not like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<String> values) {
            addCriterion("ACTION_TYPE in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<String> values) {
            addCriterion("ACTION_TYPE not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionRemarkIsNull() {
            addCriterion("ACTION_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andActionRemarkIsNotNull() {
            addCriterion("ACTION_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andActionRemarkEqualTo(String value) {
            addCriterion("ACTION_REMARK =", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotEqualTo(String value) {
            addCriterion("ACTION_REMARK <>", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkGreaterThan(String value) {
            addCriterion("ACTION_REMARK >", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_REMARK >=", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkLessThan(String value) {
            addCriterion("ACTION_REMARK <", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkLessThanOrEqualTo(String value) {
            addCriterion("ACTION_REMARK <=", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkLike(String value) {
            addCriterion("ACTION_REMARK like", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotLike(String value) {
            addCriterion("ACTION_REMARK not like", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkIn(List<String> values) {
            addCriterion("ACTION_REMARK in", values, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotIn(List<String> values) {
            addCriterion("ACTION_REMARK not in", values, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkBetween(String value1, String value2) {
            addCriterion("ACTION_REMARK between", value1, value2, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotBetween(String value1, String value2) {
            addCriterion("ACTION_REMARK not between", value1, value2, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNull() {
            addCriterion("ACTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNotNull() {
            addCriterion("ACTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActionDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DATE =", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DATE <>", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTION_DATE >", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DATE >=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThan(Date value) {
            addCriterionForJDBCDate("ACTION_DATE <", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DATE <=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACTION_DATE in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTION_DATE not in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTION_DATE between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTION_DATE not between", value1, value2, "actionDate");
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

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("REGION_CODE =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("REGION_CODE <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("REGION_CODE >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("REGION_CODE <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("REGION_CODE like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("REGION_CODE not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("REGION_CODE in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("REGION_CODE not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("REGION_CODE between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("REGION_CODE not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andPrintMonthIsNull() {
            addCriterion("PRINT_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andPrintMonthIsNotNull() {
            addCriterion("PRINT_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andPrintMonthEqualTo(String value) {
            addCriterion("PRINT_MONTH =", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthNotEqualTo(String value) {
            addCriterion("PRINT_MONTH <>", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthGreaterThan(String value) {
            addCriterion("PRINT_MONTH >", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthGreaterThanOrEqualTo(String value) {
            addCriterion("PRINT_MONTH >=", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthLessThan(String value) {
            addCriterion("PRINT_MONTH <", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthLessThanOrEqualTo(String value) {
            addCriterion("PRINT_MONTH <=", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthLike(String value) {
            addCriterion("PRINT_MONTH like", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthNotLike(String value) {
            addCriterion("PRINT_MONTH not like", value, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthIn(List<String> values) {
            addCriterion("PRINT_MONTH in", values, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthNotIn(List<String> values) {
            addCriterion("PRINT_MONTH not in", values, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthBetween(String value1, String value2) {
            addCriterion("PRINT_MONTH between", value1, value2, "printMonth");
            return (Criteria) this;
        }

        public Criteria andPrintMonthNotBetween(String value1, String value2) {
            addCriterion("PRINT_MONTH not between", value1, value2, "printMonth");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("VALID_DATE >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Date value) {
            addCriterionForJDBCDate("VALID_DATE <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_DATE in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_DATE not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_DATE between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_DATE not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateIsNull() {
            addCriterion("EXPIR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpirDateIsNotNull() {
            addCriterion("EXPIR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpirDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIR_DATE =", value, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIR_DATE <>", value, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXPIR_DATE >", value, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIR_DATE >=", value, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateLessThan(Date value) {
            addCriterionForJDBCDate("EXPIR_DATE <", value, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIR_DATE <=", value, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIR_DATE in", values, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIR_DATE not in", values, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIR_DATE between", value1, value2, "expirDate");
            return (Criteria) this;
        }

        public Criteria andExpirDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIR_DATE not between", value1, value2, "expirDate");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("TERMINAL_ID =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("TERMINAL_ID <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("TERMINAL_ID >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("TERMINAL_ID <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("TERMINAL_ID like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("TERMINAL_ID not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("TERMINAL_ID in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("TERMINAL_ID not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNull() {
            addCriterion("OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(String value) {
            addCriterion("OP_ID =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(String value) {
            addCriterion("OP_ID <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(String value) {
            addCriterion("OP_ID >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(String value) {
            addCriterion("OP_ID >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(String value) {
            addCriterion("OP_ID <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(String value) {
            addCriterion("OP_ID <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLike(String value) {
            addCriterion("OP_ID like", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotLike(String value) {
            addCriterion("OP_ID not like", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<String> values) {
            addCriterion("OP_ID in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<String> values) {
            addCriterion("OP_ID not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(String value1, String value2) {
            addCriterion("OP_ID between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(String value1, String value2) {
            addCriterion("OP_ID not between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNull() {
            addCriterion("SERIAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNotNull() {
            addCriterion("SERIAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialIdEqualTo(String value) {
            addCriterion("SERIAL_ID =", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotEqualTo(String value) {
            addCriterion("SERIAL_ID <>", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThan(String value) {
            addCriterion("SERIAL_ID >", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_ID >=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThan(String value) {
            addCriterion("SERIAL_ID <", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_ID <=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLike(String value) {
            addCriterion("SERIAL_ID like", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotLike(String value) {
            addCriterion("SERIAL_ID not like", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdIn(List<String> values) {
            addCriterion("SERIAL_ID in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotIn(List<String> values) {
            addCriterion("SERIAL_ID not in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdBetween(String value1, String value2) {
            addCriterion("SERIAL_ID between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotBetween(String value1, String value2) {
            addCriterion("SERIAL_ID not between", value1, value2, "serialId");
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