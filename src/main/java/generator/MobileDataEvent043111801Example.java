package generator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MobileDataEvent043111801Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MobileDataEvent043111801Example() {
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

        public Criteria andImsiIsNull() {
            addCriterion("IMSI is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("IMSI is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("IMSI =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("IMSI <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("IMSI >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("IMSI >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("IMSI <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("IMSI <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("IMSI like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("IMSI not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("IMSI in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("IMSI not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("IMSI between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("IMSI not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andNaiIsNull() {
            addCriterion("NAI is null");
            return (Criteria) this;
        }

        public Criteria andNaiIsNotNull() {
            addCriterion("NAI is not null");
            return (Criteria) this;
        }

        public Criteria andNaiEqualTo(String value) {
            addCriterion("NAI =", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiNotEqualTo(String value) {
            addCriterion("NAI <>", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiGreaterThan(String value) {
            addCriterion("NAI >", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiGreaterThanOrEqualTo(String value) {
            addCriterion("NAI >=", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiLessThan(String value) {
            addCriterion("NAI <", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiLessThanOrEqualTo(String value) {
            addCriterion("NAI <=", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiLike(String value) {
            addCriterion("NAI like", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiNotLike(String value) {
            addCriterion("NAI not like", value, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiIn(List<String> values) {
            addCriterion("NAI in", values, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiNotIn(List<String> values) {
            addCriterion("NAI not in", values, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiBetween(String value1, String value2) {
            addCriterion("NAI between", value1, value2, "nai");
            return (Criteria) this;
        }

        public Criteria andNaiNotBetween(String value1, String value2) {
            addCriterion("NAI not between", value1, value2, "nai");
            return (Criteria) this;
        }

        public Criteria andNasIpIsNull() {
            addCriterion("NAS_IP is null");
            return (Criteria) this;
        }

        public Criteria andNasIpIsNotNull() {
            addCriterion("NAS_IP is not null");
            return (Criteria) this;
        }

        public Criteria andNasIpEqualTo(String value) {
            addCriterion("NAS_IP =", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpNotEqualTo(String value) {
            addCriterion("NAS_IP <>", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpGreaterThan(String value) {
            addCriterion("NAS_IP >", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpGreaterThanOrEqualTo(String value) {
            addCriterion("NAS_IP >=", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpLessThan(String value) {
            addCriterion("NAS_IP <", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpLessThanOrEqualTo(String value) {
            addCriterion("NAS_IP <=", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpLike(String value) {
            addCriterion("NAS_IP like", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpNotLike(String value) {
            addCriterion("NAS_IP not like", value, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpIn(List<String> values) {
            addCriterion("NAS_IP in", values, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpNotIn(List<String> values) {
            addCriterion("NAS_IP not in", values, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpBetween(String value1, String value2) {
            addCriterion("NAS_IP between", value1, value2, "nasIp");
            return (Criteria) this;
        }

        public Criteria andNasIpNotBetween(String value1, String value2) {
            addCriterion("NAS_IP not between", value1, value2, "nasIp");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("SESSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("SESSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("SESSION_ID =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("SESSION_ID <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("SESSION_ID >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SESSION_ID >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("SESSION_ID <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("SESSION_ID <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("SESSION_ID like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("SESSION_ID not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("SESSION_ID in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("SESSION_ID not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("SESSION_ID between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("SESSION_ID not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andPppIdIsNull() {
            addCriterion("PPP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPppIdIsNotNull() {
            addCriterion("PPP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPppIdEqualTo(String value) {
            addCriterion("PPP_ID =", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdNotEqualTo(String value) {
            addCriterion("PPP_ID <>", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdGreaterThan(String value) {
            addCriterion("PPP_ID >", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdGreaterThanOrEqualTo(String value) {
            addCriterion("PPP_ID >=", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdLessThan(String value) {
            addCriterion("PPP_ID <", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdLessThanOrEqualTo(String value) {
            addCriterion("PPP_ID <=", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdLike(String value) {
            addCriterion("PPP_ID like", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdNotLike(String value) {
            addCriterion("PPP_ID not like", value, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdIn(List<String> values) {
            addCriterion("PPP_ID in", values, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdNotIn(List<String> values) {
            addCriterion("PPP_ID not in", values, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdBetween(String value1, String value2) {
            addCriterion("PPP_ID between", value1, value2, "pppId");
            return (Criteria) this;
        }

        public Criteria andPppIdNotBetween(String value1, String value2) {
            addCriterion("PPP_ID not between", value1, value2, "pppId");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressIsNull() {
            addCriterion("PDSN_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressIsNotNull() {
            addCriterion("PDSN_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressEqualTo(String value) {
            addCriterion("PDSN_ADDRESS =", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressNotEqualTo(String value) {
            addCriterion("PDSN_ADDRESS <>", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressGreaterThan(String value) {
            addCriterion("PDSN_ADDRESS >", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PDSN_ADDRESS >=", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressLessThan(String value) {
            addCriterion("PDSN_ADDRESS <", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressLessThanOrEqualTo(String value) {
            addCriterion("PDSN_ADDRESS <=", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressLike(String value) {
            addCriterion("PDSN_ADDRESS like", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressNotLike(String value) {
            addCriterion("PDSN_ADDRESS not like", value, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressIn(List<String> values) {
            addCriterion("PDSN_ADDRESS in", values, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressNotIn(List<String> values) {
            addCriterion("PDSN_ADDRESS not in", values, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressBetween(String value1, String value2) {
            addCriterion("PDSN_ADDRESS between", value1, value2, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPdsnAddressNotBetween(String value1, String value2) {
            addCriterion("PDSN_ADDRESS not between", value1, value2, "pdsnAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressIsNull() {
            addCriterion("PCF_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPcfAddressIsNotNull() {
            addCriterion("PCF_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPcfAddressEqualTo(String value) {
            addCriterion("PCF_ADDRESS =", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressNotEqualTo(String value) {
            addCriterion("PCF_ADDRESS <>", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressGreaterThan(String value) {
            addCriterion("PCF_ADDRESS >", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PCF_ADDRESS >=", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressLessThan(String value) {
            addCriterion("PCF_ADDRESS <", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressLessThanOrEqualTo(String value) {
            addCriterion("PCF_ADDRESS <=", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressLike(String value) {
            addCriterion("PCF_ADDRESS like", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressNotLike(String value) {
            addCriterion("PCF_ADDRESS not like", value, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressIn(List<String> values) {
            addCriterion("PCF_ADDRESS in", values, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressNotIn(List<String> values) {
            addCriterion("PCF_ADDRESS not in", values, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressBetween(String value1, String value2) {
            addCriterion("PCF_ADDRESS between", value1, value2, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andPcfAddressNotBetween(String value1, String value2) {
            addCriterion("PCF_ADDRESS not between", value1, value2, "pcfAddress");
            return (Criteria) this;
        }

        public Criteria andBsidIsNull() {
            addCriterion("BSID is null");
            return (Criteria) this;
        }

        public Criteria andBsidIsNotNull() {
            addCriterion("BSID is not null");
            return (Criteria) this;
        }

        public Criteria andBsidEqualTo(String value) {
            addCriterion("BSID =", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotEqualTo(String value) {
            addCriterion("BSID <>", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThan(String value) {
            addCriterion("BSID >", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThanOrEqualTo(String value) {
            addCriterion("BSID >=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThan(String value) {
            addCriterion("BSID <", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThanOrEqualTo(String value) {
            addCriterion("BSID <=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLike(String value) {
            addCriterion("BSID like", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotLike(String value) {
            addCriterion("BSID not like", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidIn(List<String> values) {
            addCriterion("BSID in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotIn(List<String> values) {
            addCriterion("BSID not in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidBetween(String value1, String value2) {
            addCriterion("BSID between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotBetween(String value1, String value2) {
            addCriterion("BSID not between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andSendAmountIsNull() {
            addCriterion("SEND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSendAmountIsNotNull() {
            addCriterion("SEND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSendAmountEqualTo(Long value) {
            addCriterion("SEND_AMOUNT =", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountNotEqualTo(Long value) {
            addCriterion("SEND_AMOUNT <>", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountGreaterThan(Long value) {
            addCriterion("SEND_AMOUNT >", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("SEND_AMOUNT >=", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountLessThan(Long value) {
            addCriterion("SEND_AMOUNT <", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountLessThanOrEqualTo(Long value) {
            addCriterion("SEND_AMOUNT <=", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountIn(List<Long> values) {
            addCriterion("SEND_AMOUNT in", values, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountNotIn(List<Long> values) {
            addCriterion("SEND_AMOUNT not in", values, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountBetween(Long value1, Long value2) {
            addCriterion("SEND_AMOUNT between", value1, value2, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountNotBetween(Long value1, Long value2) {
            addCriterion("SEND_AMOUNT not between", value1, value2, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountIsNull() {
            addCriterion("RECV_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRecvAmountIsNotNull() {
            addCriterion("RECV_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRecvAmountEqualTo(Long value) {
            addCriterion("RECV_AMOUNT =", value, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountNotEqualTo(Long value) {
            addCriterion("RECV_AMOUNT <>", value, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountGreaterThan(Long value) {
            addCriterion("RECV_AMOUNT >", value, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("RECV_AMOUNT >=", value, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountLessThan(Long value) {
            addCriterion("RECV_AMOUNT <", value, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountLessThanOrEqualTo(Long value) {
            addCriterion("RECV_AMOUNT <=", value, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountIn(List<Long> values) {
            addCriterion("RECV_AMOUNT in", values, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountNotIn(List<Long> values) {
            addCriterion("RECV_AMOUNT not in", values, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountBetween(Long value1, Long value2) {
            addCriterion("RECV_AMOUNT between", value1, value2, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andRecvAmountNotBetween(Long value1, Long value2) {
            addCriterion("RECV_AMOUNT not between", value1, value2, "recvAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNull() {
            addCriterion("SUM_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNotNull() {
            addCriterion("SUM_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmountEqualTo(Long value) {
            addCriterion("SUM_AMOUNT =", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotEqualTo(Long value) {
            addCriterion("SUM_AMOUNT <>", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThan(Long value) {
            addCriterion("SUM_AMOUNT >", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_AMOUNT >=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThan(Long value) {
            addCriterion("SUM_AMOUNT <", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThanOrEqualTo(Long value) {
            addCriterion("SUM_AMOUNT <=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountIn(List<Long> values) {
            addCriterion("SUM_AMOUNT in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotIn(List<Long> values) {
            addCriterion("SUM_AMOUNT not in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountBetween(Long value1, Long value2) {
            addCriterion("SUM_AMOUNT between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotBetween(Long value1, Long value2) {
            addCriterion("SUM_AMOUNT not between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Long value) {
            addCriterion("EVENT_ID =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Long value) {
            addCriterion("EVENT_ID <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Long value) {
            addCriterion("EVENT_ID >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Long value) {
            addCriterion("EVENT_ID <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Long> values) {
            addCriterion("EVENT_ID in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Long> values) {
            addCriterion("EVENT_ID not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdIsNull() {
            addCriterion("SWITCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSwitchIdIsNotNull() {
            addCriterion("SWITCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchIdEqualTo(Integer value) {
            addCriterion("SWITCH_ID =", value, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdNotEqualTo(Integer value) {
            addCriterion("SWITCH_ID <>", value, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdGreaterThan(Integer value) {
            addCriterion("SWITCH_ID >", value, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SWITCH_ID >=", value, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdLessThan(Integer value) {
            addCriterion("SWITCH_ID <", value, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdLessThanOrEqualTo(Integer value) {
            addCriterion("SWITCH_ID <=", value, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdIn(List<Integer> values) {
            addCriterion("SWITCH_ID in", values, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdNotIn(List<Integer> values) {
            addCriterion("SWITCH_ID not in", values, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdBetween(Integer value1, Integer value2) {
            addCriterion("SWITCH_ID between", value1, value2, "switchId");
            return (Criteria) this;
        }

        public Criteria andSwitchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SWITCH_ID not between", value1, value2, "switchId");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Long value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Long value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Long value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Long value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Long value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Long> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Long> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Long value1, Long value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Long value1, Long value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
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

        public Criteria andEventSourceTypeIsNull() {
            addCriterion("EVENT_SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeIsNotNull() {
            addCriterion("EVENT_SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeEqualTo(Short value) {
            addCriterion("EVENT_SOURCE_TYPE =", value, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeNotEqualTo(Short value) {
            addCriterion("EVENT_SOURCE_TYPE <>", value, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeGreaterThan(Short value) {
            addCriterion("EVENT_SOURCE_TYPE >", value, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("EVENT_SOURCE_TYPE >=", value, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeLessThan(Short value) {
            addCriterion("EVENT_SOURCE_TYPE <", value, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeLessThanOrEqualTo(Short value) {
            addCriterion("EVENT_SOURCE_TYPE <=", value, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeIn(List<Short> values) {
            addCriterion("EVENT_SOURCE_TYPE in", values, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeNotIn(List<Short> values) {
            addCriterion("EVENT_SOURCE_TYPE not in", values, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeBetween(Short value1, Short value2) {
            addCriterion("EVENT_SOURCE_TYPE between", value1, value2, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andEventSourceTypeNotBetween(Short value1, Short value2) {
            addCriterion("EVENT_SOURCE_TYPE not between", value1, value2, "eventSourceType");
            return (Criteria) this;
        }

        public Criteria andMscIsNull() {
            addCriterion("MSC is null");
            return (Criteria) this;
        }

        public Criteria andMscIsNotNull() {
            addCriterion("MSC is not null");
            return (Criteria) this;
        }

        public Criteria andMscEqualTo(String value) {
            addCriterion("MSC =", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscNotEqualTo(String value) {
            addCriterion("MSC <>", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscGreaterThan(String value) {
            addCriterion("MSC >", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscGreaterThanOrEqualTo(String value) {
            addCriterion("MSC >=", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscLessThan(String value) {
            addCriterion("MSC <", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscLessThanOrEqualTo(String value) {
            addCriterion("MSC <=", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscLike(String value) {
            addCriterion("MSC like", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscNotLike(String value) {
            addCriterion("MSC not like", value, "msc");
            return (Criteria) this;
        }

        public Criteria andMscIn(List<String> values) {
            addCriterion("MSC in", values, "msc");
            return (Criteria) this;
        }

        public Criteria andMscNotIn(List<String> values) {
            addCriterion("MSC not in", values, "msc");
            return (Criteria) this;
        }

        public Criteria andMscBetween(String value1, String value2) {
            addCriterion("MSC between", value1, value2, "msc");
            return (Criteria) this;
        }

        public Criteria andMscNotBetween(String value1, String value2) {
            addCriterion("MSC not between", value1, value2, "msc");
            return (Criteria) this;
        }

        public Criteria andLacIsNull() {
            addCriterion("LAC is null");
            return (Criteria) this;
        }

        public Criteria andLacIsNotNull() {
            addCriterion("LAC is not null");
            return (Criteria) this;
        }

        public Criteria andLacEqualTo(String value) {
            addCriterion("LAC =", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotEqualTo(String value) {
            addCriterion("LAC <>", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThan(String value) {
            addCriterion("LAC >", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThanOrEqualTo(String value) {
            addCriterion("LAC >=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThan(String value) {
            addCriterion("LAC <", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThanOrEqualTo(String value) {
            addCriterion("LAC <=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLike(String value) {
            addCriterion("LAC like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotLike(String value) {
            addCriterion("LAC not like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacIn(List<String> values) {
            addCriterion("LAC in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotIn(List<String> values) {
            addCriterion("LAC not in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacBetween(String value1, String value2) {
            addCriterion("LAC between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotBetween(String value1, String value2) {
            addCriterion("LAC not between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNull() {
            addCriterion("CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNotNull() {
            addCriterion("CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCellIdEqualTo(String value) {
            addCriterion("CELL_ID =", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotEqualTo(String value) {
            addCriterion("CELL_ID <>", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThan(String value) {
            addCriterion("CELL_ID >", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThanOrEqualTo(String value) {
            addCriterion("CELL_ID >=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThan(String value) {
            addCriterion("CELL_ID <", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThanOrEqualTo(String value) {
            addCriterion("CELL_ID <=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLike(String value) {
            addCriterion("CELL_ID like", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotLike(String value) {
            addCriterion("CELL_ID not like", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdIn(List<String> values) {
            addCriterion("CELL_ID in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotIn(List<String> values) {
            addCriterion("CELL_ID not in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdBetween(String value1, String value2) {
            addCriterion("CELL_ID between", value1, value2, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotBetween(String value1, String value2) {
            addCriterion("CELL_ID not between", value1, value2, "cellId");
            return (Criteria) this;
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

        public Criteria andEventTypeIdIsNull() {
            addCriterion("EVENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdIsNotNull() {
            addCriterion("EVENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdEqualTo(Integer value) {
            addCriterion("EVENT_TYPE_ID =", value, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdNotEqualTo(Integer value) {
            addCriterion("EVENT_TYPE_ID <>", value, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdGreaterThan(Integer value) {
            addCriterion("EVENT_TYPE_ID >", value, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EVENT_TYPE_ID >=", value, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdLessThan(Integer value) {
            addCriterion("EVENT_TYPE_ID <", value, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("EVENT_TYPE_ID <=", value, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdIn(List<Integer> values) {
            addCriterion("EVENT_TYPE_ID in", values, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdNotIn(List<Integer> values) {
            addCriterion("EVENT_TYPE_ID not in", values, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("EVENT_TYPE_ID between", value1, value2, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EVENT_TYPE_ID not between", value1, value2, "eventTypeId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdIsNull() {
            addCriterion("BILL_FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdIsNotNull() {
            addCriterion("BILL_FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdEqualTo(Integer value) {
            addCriterion("BILL_FLOW_ID =", value, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdNotEqualTo(Integer value) {
            addCriterion("BILL_FLOW_ID <>", value, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdGreaterThan(Integer value) {
            addCriterion("BILL_FLOW_ID >", value, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_FLOW_ID >=", value, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdLessThan(Integer value) {
            addCriterion("BILL_FLOW_ID <", value, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_FLOW_ID <=", value, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdIn(List<Integer> values) {
            addCriterion("BILL_FLOW_ID in", values, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdNotIn(List<Integer> values) {
            addCriterion("BILL_FLOW_ID not in", values, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("BILL_FLOW_ID between", value1, value2, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andBillFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_FLOW_ID not between", value1, value2, "billFlowId");
            return (Criteria) this;
        }

        public Criteria andServIdIsNull() {
            addCriterion("SERV_ID is null");
            return (Criteria) this;
        }

        public Criteria andServIdIsNotNull() {
            addCriterion("SERV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServIdEqualTo(Long value) {
            addCriterion("SERV_ID =", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotEqualTo(Long value) {
            addCriterion("SERV_ID <>", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThan(Long value) {
            addCriterion("SERV_ID >", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SERV_ID >=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThan(Long value) {
            addCriterion("SERV_ID <", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThanOrEqualTo(Long value) {
            addCriterion("SERV_ID <=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdIn(List<Long> values) {
            addCriterion("SERV_ID in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotIn(List<Long> values) {
            addCriterion("SERV_ID not in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdBetween(Long value1, Long value2) {
            addCriterion("SERV_ID between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotBetween(Long value1, Long value2) {
            addCriterion("SERV_ID not between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Long value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Long value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Long value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Long value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Long value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Long> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Long> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Long value1, Long value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Long value1, Long value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeIsNull() {
            addCriterion("BILLING_VISIT_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeIsNotNull() {
            addCriterion("BILLING_VISIT_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeEqualTo(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE =", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeNotEqualTo(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE <>", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeGreaterThan(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE >", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE >=", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeLessThan(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE <", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE <=", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeLike(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE like", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeNotLike(String value) {
            addCriterion("BILLING_VISIT_AREA_CODE not like", value, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeIn(List<String> values) {
            addCriterion("BILLING_VISIT_AREA_CODE in", values, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeNotIn(List<String> values) {
            addCriterion("BILLING_VISIT_AREA_CODE not in", values, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeBetween(String value1, String value2) {
            addCriterion("BILLING_VISIT_AREA_CODE between", value1, value2, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingVisitAreaCodeNotBetween(String value1, String value2) {
            addCriterion("BILLING_VISIT_AREA_CODE not between", value1, value2, "billingVisitAreaCode");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdIsNull() {
            addCriterion("ROAM_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdIsNotNull() {
            addCriterion("ROAM_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdEqualTo(Integer value) {
            addCriterion("ROAM_TYPE_ID =", value, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdNotEqualTo(Integer value) {
            addCriterion("ROAM_TYPE_ID <>", value, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdGreaterThan(Integer value) {
            addCriterion("ROAM_TYPE_ID >", value, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROAM_TYPE_ID >=", value, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdLessThan(Integer value) {
            addCriterion("ROAM_TYPE_ID <", value, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROAM_TYPE_ID <=", value, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdIn(List<Integer> values) {
            addCriterion("ROAM_TYPE_ID in", values, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdNotIn(List<Integer> values) {
            addCriterion("ROAM_TYPE_ID not in", values, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ROAM_TYPE_ID between", value1, value2, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andRoamTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROAM_TYPE_ID not between", value1, value2, "roamTypeId");
            return (Criteria) this;
        }

        public Criteria andOfferId1IsNull() {
            addCriterion("OFFER_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andOfferId1IsNotNull() {
            addCriterion("OFFER_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferId1EqualTo(Long value) {
            addCriterion("OFFER_ID1 =", value, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1NotEqualTo(Long value) {
            addCriterion("OFFER_ID1 <>", value, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1GreaterThan(Long value) {
            addCriterion("OFFER_ID1 >", value, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1GreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID1 >=", value, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1LessThan(Long value) {
            addCriterion("OFFER_ID1 <", value, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1LessThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID1 <=", value, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1In(List<Long> values) {
            addCriterion("OFFER_ID1 in", values, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1NotIn(List<Long> values) {
            addCriterion("OFFER_ID1 not in", values, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1Between(Long value1, Long value2) {
            addCriterion("OFFER_ID1 between", value1, value2, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId1NotBetween(Long value1, Long value2) {
            addCriterion("OFFER_ID1 not between", value1, value2, "offerId1");
            return (Criteria) this;
        }

        public Criteria andOfferId2IsNull() {
            addCriterion("OFFER_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andOfferId2IsNotNull() {
            addCriterion("OFFER_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferId2EqualTo(Long value) {
            addCriterion("OFFER_ID2 =", value, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2NotEqualTo(Long value) {
            addCriterion("OFFER_ID2 <>", value, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2GreaterThan(Long value) {
            addCriterion("OFFER_ID2 >", value, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2GreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID2 >=", value, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2LessThan(Long value) {
            addCriterion("OFFER_ID2 <", value, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2LessThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID2 <=", value, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2In(List<Long> values) {
            addCriterion("OFFER_ID2 in", values, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2NotIn(List<Long> values) {
            addCriterion("OFFER_ID2 not in", values, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2Between(Long value1, Long value2) {
            addCriterion("OFFER_ID2 between", value1, value2, "offerId2");
            return (Criteria) this;
        }

        public Criteria andOfferId2NotBetween(Long value1, Long value2) {
            addCriterion("OFFER_ID2 not between", value1, value2, "offerId2");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeIsNull() {
            addCriterion("BILLING_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeIsNotNull() {
            addCriterion("BILLING_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeEqualTo(String value) {
            addCriterion("BILLING_AREA_CODE =", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeNotEqualTo(String value) {
            addCriterion("BILLING_AREA_CODE <>", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeGreaterThan(String value) {
            addCriterion("BILLING_AREA_CODE >", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_AREA_CODE >=", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeLessThan(String value) {
            addCriterion("BILLING_AREA_CODE <", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("BILLING_AREA_CODE <=", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeLike(String value) {
            addCriterion("BILLING_AREA_CODE like", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeNotLike(String value) {
            addCriterion("BILLING_AREA_CODE not like", value, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeIn(List<String> values) {
            addCriterion("BILLING_AREA_CODE in", values, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeNotIn(List<String> values) {
            addCriterion("BILLING_AREA_CODE not in", values, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeBetween(String value1, String value2) {
            addCriterion("BILLING_AREA_CODE between", value1, value2, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingAreaCodeNotBetween(String value1, String value2) {
            addCriterion("BILLING_AREA_CODE not between", value1, value2, "billingAreaCode");
            return (Criteria) this;
        }

        public Criteria andBillingNbrIsNull() {
            addCriterion("BILLING_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBillingNbrIsNotNull() {
            addCriterion("BILLING_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBillingNbrEqualTo(String value) {
            addCriterion("BILLING_NBR =", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrNotEqualTo(String value) {
            addCriterion("BILLING_NBR <>", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrGreaterThan(String value) {
            addCriterion("BILLING_NBR >", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_NBR >=", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrLessThan(String value) {
            addCriterion("BILLING_NBR <", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrLessThanOrEqualTo(String value) {
            addCriterion("BILLING_NBR <=", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrLike(String value) {
            addCriterion("BILLING_NBR like", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrNotLike(String value) {
            addCriterion("BILLING_NBR not like", value, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrIn(List<String> values) {
            addCriterion("BILLING_NBR in", values, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrNotIn(List<String> values) {
            addCriterion("BILLING_NBR not in", values, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrBetween(String value1, String value2) {
            addCriterion("BILLING_NBR between", value1, value2, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingNbrNotBetween(String value1, String value2) {
            addCriterion("BILLING_NBR not between", value1, value2, "billingNbr");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdIsNull() {
            addCriterion("BILLING_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdIsNotNull() {
            addCriterion("BILLING_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdEqualTo(Integer value) {
            addCriterion("BILLING_ORG_ID =", value, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdNotEqualTo(Integer value) {
            addCriterion("BILLING_ORG_ID <>", value, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdGreaterThan(Integer value) {
            addCriterion("BILLING_ORG_ID >", value, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILLING_ORG_ID >=", value, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdLessThan(Integer value) {
            addCriterion("BILLING_ORG_ID <", value, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILLING_ORG_ID <=", value, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdIn(List<Integer> values) {
            addCriterion("BILLING_ORG_ID in", values, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdNotIn(List<Integer> values) {
            addCriterion("BILLING_ORG_ID not in", values, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("BILLING_ORG_ID between", value1, value2, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andBillingOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILLING_ORG_ID not between", value1, value2, "billingOrgId");
            return (Criteria) this;
        }

        public Criteria andOfferId4IsNull() {
            addCriterion("OFFER_ID4 is null");
            return (Criteria) this;
        }

        public Criteria andOfferId4IsNotNull() {
            addCriterion("OFFER_ID4 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferId4EqualTo(Long value) {
            addCriterion("OFFER_ID4 =", value, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4NotEqualTo(Long value) {
            addCriterion("OFFER_ID4 <>", value, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4GreaterThan(Long value) {
            addCriterion("OFFER_ID4 >", value, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4GreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID4 >=", value, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4LessThan(Long value) {
            addCriterion("OFFER_ID4 <", value, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4LessThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID4 <=", value, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4In(List<Long> values) {
            addCriterion("OFFER_ID4 in", values, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4NotIn(List<Long> values) {
            addCriterion("OFFER_ID4 not in", values, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4Between(Long value1, Long value2) {
            addCriterion("OFFER_ID4 between", value1, value2, "offerId4");
            return (Criteria) this;
        }

        public Criteria andOfferId4NotBetween(Long value1, Long value2) {
            addCriterion("OFFER_ID4 not between", value1, value2, "offerId4");
            return (Criteria) this;
        }

        public Criteria andCharge1IsNull() {
            addCriterion("CHARGE1 is null");
            return (Criteria) this;
        }

        public Criteria andCharge1IsNotNull() {
            addCriterion("CHARGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCharge1EqualTo(Integer value) {
            addCriterion("CHARGE1 =", value, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1NotEqualTo(Integer value) {
            addCriterion("CHARGE1 <>", value, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1GreaterThan(Integer value) {
            addCriterion("CHARGE1 >", value, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1GreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE1 >=", value, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1LessThan(Integer value) {
            addCriterion("CHARGE1 <", value, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1LessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE1 <=", value, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1In(List<Integer> values) {
            addCriterion("CHARGE1 in", values, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1NotIn(List<Integer> values) {
            addCriterion("CHARGE1 not in", values, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1Between(Integer value1, Integer value2) {
            addCriterion("CHARGE1 between", value1, value2, "charge1");
            return (Criteria) this;
        }

        public Criteria andCharge1NotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE1 not between", value1, value2, "charge1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1IsNull() {
            addCriterion("ACCT_ITEM_TYPE_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1IsNotNull() {
            addCriterion("ACCT_ITEM_TYPE_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1EqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID1 =", value, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1NotEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID1 <>", value, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1GreaterThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID1 >", value, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID1 >=", value, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1LessThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID1 <", value, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1LessThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID1 <=", value, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1In(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID1 in", values, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1NotIn(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID1 not in", values, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1Between(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID1 between", value1, value2, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId1NotBetween(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID1 not between", value1, value2, "acctItemTypeId1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1IsNull() {
            addCriterion("BILL_MEASURE1 is null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1IsNotNull() {
            addCriterion("BILL_MEASURE1 is not null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1EqualTo(Long value) {
            addCriterion("BILL_MEASURE1 =", value, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1NotEqualTo(Long value) {
            addCriterion("BILL_MEASURE1 <>", value, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1GreaterThan(Long value) {
            addCriterion("BILL_MEASURE1 >", value, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1GreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE1 >=", value, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1LessThan(Long value) {
            addCriterion("BILL_MEASURE1 <", value, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1LessThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE1 <=", value, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1In(List<Long> values) {
            addCriterion("BILL_MEASURE1 in", values, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1NotIn(List<Long> values) {
            addCriterion("BILL_MEASURE1 not in", values, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1Between(Long value1, Long value2) {
            addCriterion("BILL_MEASURE1 between", value1, value2, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andBillMeasure1NotBetween(Long value1, Long value2) {
            addCriterion("BILL_MEASURE1 not between", value1, value2, "billMeasure1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1IsNull() {
            addCriterion("MEASURE_TYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andMeasureType1IsNotNull() {
            addCriterion("MEASURE_TYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureType1EqualTo(Short value) {
            addCriterion("MEASURE_TYPE1 =", value, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1NotEqualTo(Short value) {
            addCriterion("MEASURE_TYPE1 <>", value, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1GreaterThan(Short value) {
            addCriterion("MEASURE_TYPE1 >", value, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1GreaterThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE1 >=", value, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1LessThan(Short value) {
            addCriterion("MEASURE_TYPE1 <", value, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1LessThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE1 <=", value, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1In(List<Short> values) {
            addCriterion("MEASURE_TYPE1 in", values, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1NotIn(List<Short> values) {
            addCriterion("MEASURE_TYPE1 not in", values, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1Between(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE1 between", value1, value2, "measureType1");
            return (Criteria) this;
        }

        public Criteria andMeasureType1NotBetween(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE1 not between", value1, value2, "measureType1");
            return (Criteria) this;
        }

        public Criteria andAcctId1IsNull() {
            addCriterion("ACCT_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andAcctId1IsNotNull() {
            addCriterion("ACCT_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctId1EqualTo(Long value) {
            addCriterion("ACCT_ID1 =", value, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1NotEqualTo(Long value) {
            addCriterion("ACCT_ID1 <>", value, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1GreaterThan(Long value) {
            addCriterion("ACCT_ID1 >", value, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1GreaterThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID1 >=", value, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1LessThan(Long value) {
            addCriterion("ACCT_ID1 <", value, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1LessThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID1 <=", value, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1In(List<Long> values) {
            addCriterion("ACCT_ID1 in", values, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1NotIn(List<Long> values) {
            addCriterion("ACCT_ID1 not in", values, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1Between(Long value1, Long value2) {
            addCriterion("ACCT_ID1 between", value1, value2, "acctId1");
            return (Criteria) this;
        }

        public Criteria andAcctId1NotBetween(Long value1, Long value2) {
            addCriterion("ACCT_ID1 not between", value1, value2, "acctId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1IsNull() {
            addCriterion("OFFER_INSTANCE_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1IsNotNull() {
            addCriterion("OFFER_INSTANCE_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1EqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID1 =", value, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1NotEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID1 <>", value, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1GreaterThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID1 >", value, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1GreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID1 >=", value, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1LessThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID1 <", value, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1LessThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID1 <=", value, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1In(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID1 in", values, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1NotIn(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID1 not in", values, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1Between(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID1 between", value1, value2, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId1NotBetween(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID1 not between", value1, value2, "offerInstanceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1IsNull() {
            addCriterion("ITEM_SOURCE_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1IsNotNull() {
            addCriterion("ITEM_SOURCE_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1EqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID1 =", value, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1NotEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID1 <>", value, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1GreaterThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID1 >", value, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID1 >=", value, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1LessThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID1 <", value, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1LessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID1 <=", value, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1In(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID1 in", values, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1NotIn(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID1 not in", values, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1Between(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID1 between", value1, value2, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andItemSourceId1NotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID1 not between", value1, value2, "itemSourceId1");
            return (Criteria) this;
        }

        public Criteria andCharge2IsNull() {
            addCriterion("CHARGE2 is null");
            return (Criteria) this;
        }

        public Criteria andCharge2IsNotNull() {
            addCriterion("CHARGE2 is not null");
            return (Criteria) this;
        }

        public Criteria andCharge2EqualTo(Integer value) {
            addCriterion("CHARGE2 =", value, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2NotEqualTo(Integer value) {
            addCriterion("CHARGE2 <>", value, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2GreaterThan(Integer value) {
            addCriterion("CHARGE2 >", value, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2GreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE2 >=", value, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2LessThan(Integer value) {
            addCriterion("CHARGE2 <", value, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2LessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE2 <=", value, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2In(List<Integer> values) {
            addCriterion("CHARGE2 in", values, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2NotIn(List<Integer> values) {
            addCriterion("CHARGE2 not in", values, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2Between(Integer value1, Integer value2) {
            addCriterion("CHARGE2 between", value1, value2, "charge2");
            return (Criteria) this;
        }

        public Criteria andCharge2NotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE2 not between", value1, value2, "charge2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2IsNull() {
            addCriterion("ACCT_ITEM_TYPE_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2IsNotNull() {
            addCriterion("ACCT_ITEM_TYPE_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2EqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID2 =", value, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2NotEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID2 <>", value, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2GreaterThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID2 >", value, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID2 >=", value, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2LessThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID2 <", value, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2LessThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID2 <=", value, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2In(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID2 in", values, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2NotIn(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID2 not in", values, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2Between(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID2 between", value1, value2, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId2NotBetween(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID2 not between", value1, value2, "acctItemTypeId2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2IsNull() {
            addCriterion("BILL_MEASURE2 is null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2IsNotNull() {
            addCriterion("BILL_MEASURE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2EqualTo(Long value) {
            addCriterion("BILL_MEASURE2 =", value, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2NotEqualTo(Long value) {
            addCriterion("BILL_MEASURE2 <>", value, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2GreaterThan(Long value) {
            addCriterion("BILL_MEASURE2 >", value, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2GreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE2 >=", value, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2LessThan(Long value) {
            addCriterion("BILL_MEASURE2 <", value, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2LessThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE2 <=", value, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2In(List<Long> values) {
            addCriterion("BILL_MEASURE2 in", values, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2NotIn(List<Long> values) {
            addCriterion("BILL_MEASURE2 not in", values, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2Between(Long value1, Long value2) {
            addCriterion("BILL_MEASURE2 between", value1, value2, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andBillMeasure2NotBetween(Long value1, Long value2) {
            addCriterion("BILL_MEASURE2 not between", value1, value2, "billMeasure2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2IsNull() {
            addCriterion("MEASURE_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andMeasureType2IsNotNull() {
            addCriterion("MEASURE_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureType2EqualTo(Short value) {
            addCriterion("MEASURE_TYPE2 =", value, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2NotEqualTo(Short value) {
            addCriterion("MEASURE_TYPE2 <>", value, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2GreaterThan(Short value) {
            addCriterion("MEASURE_TYPE2 >", value, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2GreaterThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE2 >=", value, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2LessThan(Short value) {
            addCriterion("MEASURE_TYPE2 <", value, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2LessThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE2 <=", value, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2In(List<Short> values) {
            addCriterion("MEASURE_TYPE2 in", values, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2NotIn(List<Short> values) {
            addCriterion("MEASURE_TYPE2 not in", values, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2Between(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE2 between", value1, value2, "measureType2");
            return (Criteria) this;
        }

        public Criteria andMeasureType2NotBetween(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE2 not between", value1, value2, "measureType2");
            return (Criteria) this;
        }

        public Criteria andAcctId2IsNull() {
            addCriterion("ACCT_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andAcctId2IsNotNull() {
            addCriterion("ACCT_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctId2EqualTo(Long value) {
            addCriterion("ACCT_ID2 =", value, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2NotEqualTo(Long value) {
            addCriterion("ACCT_ID2 <>", value, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2GreaterThan(Long value) {
            addCriterion("ACCT_ID2 >", value, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2GreaterThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID2 >=", value, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2LessThan(Long value) {
            addCriterion("ACCT_ID2 <", value, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2LessThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID2 <=", value, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2In(List<Long> values) {
            addCriterion("ACCT_ID2 in", values, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2NotIn(List<Long> values) {
            addCriterion("ACCT_ID2 not in", values, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2Between(Long value1, Long value2) {
            addCriterion("ACCT_ID2 between", value1, value2, "acctId2");
            return (Criteria) this;
        }

        public Criteria andAcctId2NotBetween(Long value1, Long value2) {
            addCriterion("ACCT_ID2 not between", value1, value2, "acctId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2IsNull() {
            addCriterion("OFFER_INSTANCE_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2IsNotNull() {
            addCriterion("OFFER_INSTANCE_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2EqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID2 =", value, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2NotEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID2 <>", value, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2GreaterThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID2 >", value, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2GreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID2 >=", value, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2LessThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID2 <", value, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2LessThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID2 <=", value, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2In(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID2 in", values, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2NotIn(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID2 not in", values, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2Between(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID2 between", value1, value2, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId2NotBetween(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID2 not between", value1, value2, "offerInstanceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2IsNull() {
            addCriterion("ITEM_SOURCE_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2IsNotNull() {
            addCriterion("ITEM_SOURCE_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2EqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID2 =", value, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2NotEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID2 <>", value, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2GreaterThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID2 >", value, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID2 >=", value, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2LessThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID2 <", value, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2LessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID2 <=", value, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2In(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID2 in", values, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2NotIn(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID2 not in", values, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2Between(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID2 between", value1, value2, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andItemSourceId2NotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID2 not between", value1, value2, "itemSourceId2");
            return (Criteria) this;
        }

        public Criteria andCharge3IsNull() {
            addCriterion("CHARGE3 is null");
            return (Criteria) this;
        }

        public Criteria andCharge3IsNotNull() {
            addCriterion("CHARGE3 is not null");
            return (Criteria) this;
        }

        public Criteria andCharge3EqualTo(Integer value) {
            addCriterion("CHARGE3 =", value, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3NotEqualTo(Integer value) {
            addCriterion("CHARGE3 <>", value, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3GreaterThan(Integer value) {
            addCriterion("CHARGE3 >", value, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3GreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE3 >=", value, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3LessThan(Integer value) {
            addCriterion("CHARGE3 <", value, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3LessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE3 <=", value, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3In(List<Integer> values) {
            addCriterion("CHARGE3 in", values, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3NotIn(List<Integer> values) {
            addCriterion("CHARGE3 not in", values, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3Between(Integer value1, Integer value2) {
            addCriterion("CHARGE3 between", value1, value2, "charge3");
            return (Criteria) this;
        }

        public Criteria andCharge3NotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE3 not between", value1, value2, "charge3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3IsNull() {
            addCriterion("ACCT_ITEM_TYPE_ID3 is null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3IsNotNull() {
            addCriterion("ACCT_ITEM_TYPE_ID3 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3EqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID3 =", value, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3NotEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID3 <>", value, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3GreaterThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID3 >", value, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID3 >=", value, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3LessThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID3 <", value, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3LessThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID3 <=", value, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3In(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID3 in", values, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3NotIn(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID3 not in", values, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3Between(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID3 between", value1, value2, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId3NotBetween(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID3 not between", value1, value2, "acctItemTypeId3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3IsNull() {
            addCriterion("BILL_MEASURE3 is null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3IsNotNull() {
            addCriterion("BILL_MEASURE3 is not null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3EqualTo(Long value) {
            addCriterion("BILL_MEASURE3 =", value, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3NotEqualTo(Long value) {
            addCriterion("BILL_MEASURE3 <>", value, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3GreaterThan(Long value) {
            addCriterion("BILL_MEASURE3 >", value, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3GreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE3 >=", value, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3LessThan(Long value) {
            addCriterion("BILL_MEASURE3 <", value, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3LessThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE3 <=", value, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3In(List<Long> values) {
            addCriterion("BILL_MEASURE3 in", values, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3NotIn(List<Long> values) {
            addCriterion("BILL_MEASURE3 not in", values, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3Between(Long value1, Long value2) {
            addCriterion("BILL_MEASURE3 between", value1, value2, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andBillMeasure3NotBetween(Long value1, Long value2) {
            addCriterion("BILL_MEASURE3 not between", value1, value2, "billMeasure3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3IsNull() {
            addCriterion("MEASURE_TYPE3 is null");
            return (Criteria) this;
        }

        public Criteria andMeasureType3IsNotNull() {
            addCriterion("MEASURE_TYPE3 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureType3EqualTo(Short value) {
            addCriterion("MEASURE_TYPE3 =", value, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3NotEqualTo(Short value) {
            addCriterion("MEASURE_TYPE3 <>", value, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3GreaterThan(Short value) {
            addCriterion("MEASURE_TYPE3 >", value, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3GreaterThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE3 >=", value, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3LessThan(Short value) {
            addCriterion("MEASURE_TYPE3 <", value, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3LessThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE3 <=", value, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3In(List<Short> values) {
            addCriterion("MEASURE_TYPE3 in", values, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3NotIn(List<Short> values) {
            addCriterion("MEASURE_TYPE3 not in", values, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3Between(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE3 between", value1, value2, "measureType3");
            return (Criteria) this;
        }

        public Criteria andMeasureType3NotBetween(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE3 not between", value1, value2, "measureType3");
            return (Criteria) this;
        }

        public Criteria andAcctId3IsNull() {
            addCriterion("ACCT_ID3 is null");
            return (Criteria) this;
        }

        public Criteria andAcctId3IsNotNull() {
            addCriterion("ACCT_ID3 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctId3EqualTo(Long value) {
            addCriterion("ACCT_ID3 =", value, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3NotEqualTo(Long value) {
            addCriterion("ACCT_ID3 <>", value, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3GreaterThan(Long value) {
            addCriterion("ACCT_ID3 >", value, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3GreaterThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID3 >=", value, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3LessThan(Long value) {
            addCriterion("ACCT_ID3 <", value, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3LessThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID3 <=", value, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3In(List<Long> values) {
            addCriterion("ACCT_ID3 in", values, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3NotIn(List<Long> values) {
            addCriterion("ACCT_ID3 not in", values, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3Between(Long value1, Long value2) {
            addCriterion("ACCT_ID3 between", value1, value2, "acctId3");
            return (Criteria) this;
        }

        public Criteria andAcctId3NotBetween(Long value1, Long value2) {
            addCriterion("ACCT_ID3 not between", value1, value2, "acctId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3IsNull() {
            addCriterion("OFFER_INSTANCE_ID3 is null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3IsNotNull() {
            addCriterion("OFFER_INSTANCE_ID3 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3EqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID3 =", value, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3NotEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID3 <>", value, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3GreaterThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID3 >", value, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3GreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID3 >=", value, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3LessThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID3 <", value, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3LessThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID3 <=", value, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3In(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID3 in", values, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3NotIn(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID3 not in", values, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3Between(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID3 between", value1, value2, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId3NotBetween(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID3 not between", value1, value2, "offerInstanceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3IsNull() {
            addCriterion("ITEM_SOURCE_ID3 is null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3IsNotNull() {
            addCriterion("ITEM_SOURCE_ID3 is not null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3EqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID3 =", value, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3NotEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID3 <>", value, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3GreaterThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID3 >", value, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID3 >=", value, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3LessThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID3 <", value, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3LessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID3 <=", value, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3In(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID3 in", values, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3NotIn(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID3 not in", values, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3Between(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID3 between", value1, value2, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andItemSourceId3NotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID3 not between", value1, value2, "itemSourceId3");
            return (Criteria) this;
        }

        public Criteria andCharge4IsNull() {
            addCriterion("CHARGE4 is null");
            return (Criteria) this;
        }

        public Criteria andCharge4IsNotNull() {
            addCriterion("CHARGE4 is not null");
            return (Criteria) this;
        }

        public Criteria andCharge4EqualTo(Integer value) {
            addCriterion("CHARGE4 =", value, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4NotEqualTo(Integer value) {
            addCriterion("CHARGE4 <>", value, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4GreaterThan(Integer value) {
            addCriterion("CHARGE4 >", value, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4GreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE4 >=", value, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4LessThan(Integer value) {
            addCriterion("CHARGE4 <", value, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4LessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE4 <=", value, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4In(List<Integer> values) {
            addCriterion("CHARGE4 in", values, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4NotIn(List<Integer> values) {
            addCriterion("CHARGE4 not in", values, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4Between(Integer value1, Integer value2) {
            addCriterion("CHARGE4 between", value1, value2, "charge4");
            return (Criteria) this;
        }

        public Criteria andCharge4NotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE4 not between", value1, value2, "charge4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4IsNull() {
            addCriterion("ACCT_ITEM_TYPE_ID4 is null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4IsNotNull() {
            addCriterion("ACCT_ITEM_TYPE_ID4 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4EqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID4 =", value, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4NotEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID4 <>", value, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4GreaterThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID4 >", value, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID4 >=", value, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4LessThan(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID4 <", value, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4LessThanOrEqualTo(Integer value) {
            addCriterion("ACCT_ITEM_TYPE_ID4 <=", value, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4In(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID4 in", values, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4NotIn(List<Integer> values) {
            addCriterion("ACCT_ITEM_TYPE_ID4 not in", values, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4Between(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID4 between", value1, value2, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andAcctItemTypeId4NotBetween(Integer value1, Integer value2) {
            addCriterion("ACCT_ITEM_TYPE_ID4 not between", value1, value2, "acctItemTypeId4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4IsNull() {
            addCriterion("BILL_MEASURE4 is null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4IsNotNull() {
            addCriterion("BILL_MEASURE4 is not null");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4EqualTo(Long value) {
            addCriterion("BILL_MEASURE4 =", value, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4NotEqualTo(Long value) {
            addCriterion("BILL_MEASURE4 <>", value, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4GreaterThan(Long value) {
            addCriterion("BILL_MEASURE4 >", value, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4GreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE4 >=", value, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4LessThan(Long value) {
            addCriterion("BILL_MEASURE4 <", value, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4LessThanOrEqualTo(Long value) {
            addCriterion("BILL_MEASURE4 <=", value, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4In(List<Long> values) {
            addCriterion("BILL_MEASURE4 in", values, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4NotIn(List<Long> values) {
            addCriterion("BILL_MEASURE4 not in", values, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4Between(Long value1, Long value2) {
            addCriterion("BILL_MEASURE4 between", value1, value2, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andBillMeasure4NotBetween(Long value1, Long value2) {
            addCriterion("BILL_MEASURE4 not between", value1, value2, "billMeasure4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4IsNull() {
            addCriterion("MEASURE_TYPE4 is null");
            return (Criteria) this;
        }

        public Criteria andMeasureType4IsNotNull() {
            addCriterion("MEASURE_TYPE4 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureType4EqualTo(Short value) {
            addCriterion("MEASURE_TYPE4 =", value, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4NotEqualTo(Short value) {
            addCriterion("MEASURE_TYPE4 <>", value, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4GreaterThan(Short value) {
            addCriterion("MEASURE_TYPE4 >", value, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4GreaterThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE4 >=", value, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4LessThan(Short value) {
            addCriterion("MEASURE_TYPE4 <", value, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4LessThanOrEqualTo(Short value) {
            addCriterion("MEASURE_TYPE4 <=", value, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4In(List<Short> values) {
            addCriterion("MEASURE_TYPE4 in", values, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4NotIn(List<Short> values) {
            addCriterion("MEASURE_TYPE4 not in", values, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4Between(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE4 between", value1, value2, "measureType4");
            return (Criteria) this;
        }

        public Criteria andMeasureType4NotBetween(Short value1, Short value2) {
            addCriterion("MEASURE_TYPE4 not between", value1, value2, "measureType4");
            return (Criteria) this;
        }

        public Criteria andAcctId4IsNull() {
            addCriterion("ACCT_ID4 is null");
            return (Criteria) this;
        }

        public Criteria andAcctId4IsNotNull() {
            addCriterion("ACCT_ID4 is not null");
            return (Criteria) this;
        }

        public Criteria andAcctId4EqualTo(Long value) {
            addCriterion("ACCT_ID4 =", value, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4NotEqualTo(Long value) {
            addCriterion("ACCT_ID4 <>", value, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4GreaterThan(Long value) {
            addCriterion("ACCT_ID4 >", value, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4GreaterThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID4 >=", value, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4LessThan(Long value) {
            addCriterion("ACCT_ID4 <", value, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4LessThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID4 <=", value, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4In(List<Long> values) {
            addCriterion("ACCT_ID4 in", values, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4NotIn(List<Long> values) {
            addCriterion("ACCT_ID4 not in", values, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4Between(Long value1, Long value2) {
            addCriterion("ACCT_ID4 between", value1, value2, "acctId4");
            return (Criteria) this;
        }

        public Criteria andAcctId4NotBetween(Long value1, Long value2) {
            addCriterion("ACCT_ID4 not between", value1, value2, "acctId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4IsNull() {
            addCriterion("OFFER_INSTANCE_ID4 is null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4IsNotNull() {
            addCriterion("OFFER_INSTANCE_ID4 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4EqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID4 =", value, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4NotEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID4 <>", value, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4GreaterThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID4 >", value, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4GreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID4 >=", value, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4LessThan(Long value) {
            addCriterion("OFFER_INSTANCE_ID4 <", value, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4LessThanOrEqualTo(Long value) {
            addCriterion("OFFER_INSTANCE_ID4 <=", value, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4In(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID4 in", values, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4NotIn(List<Long> values) {
            addCriterion("OFFER_INSTANCE_ID4 not in", values, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4Between(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID4 between", value1, value2, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andOfferInstanceId4NotBetween(Long value1, Long value2) {
            addCriterion("OFFER_INSTANCE_ID4 not between", value1, value2, "offerInstanceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4IsNull() {
            addCriterion("ITEM_SOURCE_ID4 is null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4IsNotNull() {
            addCriterion("ITEM_SOURCE_ID4 is not null");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4EqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID4 =", value, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4NotEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID4 <>", value, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4GreaterThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID4 >", value, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID4 >=", value, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4LessThan(Integer value) {
            addCriterion("ITEM_SOURCE_ID4 <", value, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4LessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SOURCE_ID4 <=", value, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4In(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID4 in", values, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4NotIn(List<Integer> values) {
            addCriterion("ITEM_SOURCE_ID4 not in", values, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4Between(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID4 between", value1, value2, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andItemSourceId4NotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_SOURCE_ID4 not between", value1, value2, "itemSourceId4");
            return (Criteria) this;
        }

        public Criteria andBillingRecordIsNull() {
            addCriterion("BILLING_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andBillingRecordIsNotNull() {
            addCriterion("BILLING_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andBillingRecordEqualTo(String value) {
            addCriterion("BILLING_RECORD =", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordNotEqualTo(String value) {
            addCriterion("BILLING_RECORD <>", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordGreaterThan(String value) {
            addCriterion("BILLING_RECORD >", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_RECORD >=", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordLessThan(String value) {
            addCriterion("BILLING_RECORD <", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordLessThanOrEqualTo(String value) {
            addCriterion("BILLING_RECORD <=", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordLike(String value) {
            addCriterion("BILLING_RECORD like", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordNotLike(String value) {
            addCriterion("BILLING_RECORD not like", value, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordIn(List<String> values) {
            addCriterion("BILLING_RECORD in", values, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordNotIn(List<String> values) {
            addCriterion("BILLING_RECORD not in", values, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordBetween(String value1, String value2) {
            addCriterion("BILLING_RECORD between", value1, value2, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andBillingRecordNotBetween(String value1, String value2) {
            addCriterion("BILLING_RECORD not between", value1, value2, "billingRecord");
            return (Criteria) this;
        }

        public Criteria andRoamFlagIsNull() {
            addCriterion("ROAM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRoamFlagIsNotNull() {
            addCriterion("ROAM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRoamFlagEqualTo(Short value) {
            addCriterion("ROAM_FLAG =", value, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagNotEqualTo(Short value) {
            addCriterion("ROAM_FLAG <>", value, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagGreaterThan(Short value) {
            addCriterion("ROAM_FLAG >", value, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("ROAM_FLAG >=", value, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagLessThan(Short value) {
            addCriterion("ROAM_FLAG <", value, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagLessThanOrEqualTo(Short value) {
            addCriterion("ROAM_FLAG <=", value, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagIn(List<Short> values) {
            addCriterion("ROAM_FLAG in", values, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagNotIn(List<Short> values) {
            addCriterion("ROAM_FLAG not in", values, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagBetween(Short value1, Short value2) {
            addCriterion("ROAM_FLAG between", value1, value2, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRoamFlagNotBetween(Short value1, Short value2) {
            addCriterion("ROAM_FLAG not between", value1, value2, "roamFlag");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdIsNull() {
            addCriterion("RP_SESSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdIsNotNull() {
            addCriterion("RP_SESSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdEqualTo(String value) {
            addCriterion("RP_SESSION_ID =", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdNotEqualTo(String value) {
            addCriterion("RP_SESSION_ID <>", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdGreaterThan(String value) {
            addCriterion("RP_SESSION_ID >", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("RP_SESSION_ID >=", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdLessThan(String value) {
            addCriterion("RP_SESSION_ID <", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdLessThanOrEqualTo(String value) {
            addCriterion("RP_SESSION_ID <=", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdLike(String value) {
            addCriterion("RP_SESSION_ID like", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdNotLike(String value) {
            addCriterion("RP_SESSION_ID not like", value, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdIn(List<String> values) {
            addCriterion("RP_SESSION_ID in", values, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdNotIn(List<String> values) {
            addCriterion("RP_SESSION_ID not in", values, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdBetween(String value1, String value2) {
            addCriterion("RP_SESSION_ID between", value1, value2, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andRpSessionIdNotBetween(String value1, String value2) {
            addCriterion("RP_SESSION_ID not between", value1, value2, "rpSessionId");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeIsNull() {
            addCriterion("SOURCE_EVENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeIsNotNull() {
            addCriterion("SOURCE_EVENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeEqualTo(Short value) {
            addCriterion("SOURCE_EVENT_TYPE =", value, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeNotEqualTo(Short value) {
            addCriterion("SOURCE_EVENT_TYPE <>", value, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeGreaterThan(Short value) {
            addCriterion("SOURCE_EVENT_TYPE >", value, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SOURCE_EVENT_TYPE >=", value, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeLessThan(Short value) {
            addCriterion("SOURCE_EVENT_TYPE <", value, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeLessThanOrEqualTo(Short value) {
            addCriterion("SOURCE_EVENT_TYPE <=", value, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeIn(List<Short> values) {
            addCriterion("SOURCE_EVENT_TYPE in", values, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeNotIn(List<Short> values) {
            addCriterion("SOURCE_EVENT_TYPE not in", values, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeBetween(Short value1, Short value2) {
            addCriterion("SOURCE_EVENT_TYPE between", value1, value2, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andSourceEventTypeNotBetween(Short value1, Short value2) {
            addCriterion("SOURCE_EVENT_TYPE not between", value1, value2, "sourceEventType");
            return (Criteria) this;
        }

        public Criteria andReservedField1IsNull() {
            addCriterion("RESERVED_FIELD1 is null");
            return (Criteria) this;
        }

        public Criteria andReservedField1IsNotNull() {
            addCriterion("RESERVED_FIELD1 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedField1EqualTo(String value) {
            addCriterion("RESERVED_FIELD1 =", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1NotEqualTo(String value) {
            addCriterion("RESERVED_FIELD1 <>", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1GreaterThan(String value) {
            addCriterion("RESERVED_FIELD1 >", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD1 >=", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1LessThan(String value) {
            addCriterion("RESERVED_FIELD1 <", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD1 <=", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1Like(String value) {
            addCriterion("RESERVED_FIELD1 like", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1NotLike(String value) {
            addCriterion("RESERVED_FIELD1 not like", value, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1In(List<String> values) {
            addCriterion("RESERVED_FIELD1 in", values, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1NotIn(List<String> values) {
            addCriterion("RESERVED_FIELD1 not in", values, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1Between(String value1, String value2) {
            addCriterion("RESERVED_FIELD1 between", value1, value2, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField1NotBetween(String value1, String value2) {
            addCriterion("RESERVED_FIELD1 not between", value1, value2, "reservedField1");
            return (Criteria) this;
        }

        public Criteria andReservedField2IsNull() {
            addCriterion("RESERVED_FIELD2 is null");
            return (Criteria) this;
        }

        public Criteria andReservedField2IsNotNull() {
            addCriterion("RESERVED_FIELD2 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedField2EqualTo(String value) {
            addCriterion("RESERVED_FIELD2 =", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2NotEqualTo(String value) {
            addCriterion("RESERVED_FIELD2 <>", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2GreaterThan(String value) {
            addCriterion("RESERVED_FIELD2 >", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD2 >=", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2LessThan(String value) {
            addCriterion("RESERVED_FIELD2 <", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD2 <=", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2Like(String value) {
            addCriterion("RESERVED_FIELD2 like", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2NotLike(String value) {
            addCriterion("RESERVED_FIELD2 not like", value, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2In(List<String> values) {
            addCriterion("RESERVED_FIELD2 in", values, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2NotIn(List<String> values) {
            addCriterion("RESERVED_FIELD2 not in", values, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2Between(String value1, String value2) {
            addCriterion("RESERVED_FIELD2 between", value1, value2, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField2NotBetween(String value1, String value2) {
            addCriterion("RESERVED_FIELD2 not between", value1, value2, "reservedField2");
            return (Criteria) this;
        }

        public Criteria andReservedField3IsNull() {
            addCriterion("RESERVED_FIELD3 is null");
            return (Criteria) this;
        }

        public Criteria andReservedField3IsNotNull() {
            addCriterion("RESERVED_FIELD3 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedField3EqualTo(String value) {
            addCriterion("RESERVED_FIELD3 =", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3NotEqualTo(String value) {
            addCriterion("RESERVED_FIELD3 <>", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3GreaterThan(String value) {
            addCriterion("RESERVED_FIELD3 >", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD3 >=", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3LessThan(String value) {
            addCriterion("RESERVED_FIELD3 <", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD3 <=", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3Like(String value) {
            addCriterion("RESERVED_FIELD3 like", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3NotLike(String value) {
            addCriterion("RESERVED_FIELD3 not like", value, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3In(List<String> values) {
            addCriterion("RESERVED_FIELD3 in", values, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3NotIn(List<String> values) {
            addCriterion("RESERVED_FIELD3 not in", values, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3Between(String value1, String value2) {
            addCriterion("RESERVED_FIELD3 between", value1, value2, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField3NotBetween(String value1, String value2) {
            addCriterion("RESERVED_FIELD3 not between", value1, value2, "reservedField3");
            return (Criteria) this;
        }

        public Criteria andReservedField4IsNull() {
            addCriterion("RESERVED_FIELD4 is null");
            return (Criteria) this;
        }

        public Criteria andReservedField4IsNotNull() {
            addCriterion("RESERVED_FIELD4 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedField4EqualTo(String value) {
            addCriterion("RESERVED_FIELD4 =", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4NotEqualTo(String value) {
            addCriterion("RESERVED_FIELD4 <>", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4GreaterThan(String value) {
            addCriterion("RESERVED_FIELD4 >", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD4 >=", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4LessThan(String value) {
            addCriterion("RESERVED_FIELD4 <", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD4 <=", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4Like(String value) {
            addCriterion("RESERVED_FIELD4 like", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4NotLike(String value) {
            addCriterion("RESERVED_FIELD4 not like", value, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4In(List<String> values) {
            addCriterion("RESERVED_FIELD4 in", values, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4NotIn(List<String> values) {
            addCriterion("RESERVED_FIELD4 not in", values, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4Between(String value1, String value2) {
            addCriterion("RESERVED_FIELD4 between", value1, value2, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField4NotBetween(String value1, String value2) {
            addCriterion("RESERVED_FIELD4 not between", value1, value2, "reservedField4");
            return (Criteria) this;
        }

        public Criteria andReservedField5IsNull() {
            addCriterion("RESERVED_FIELD5 is null");
            return (Criteria) this;
        }

        public Criteria andReservedField5IsNotNull() {
            addCriterion("RESERVED_FIELD5 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedField5EqualTo(String value) {
            addCriterion("RESERVED_FIELD5 =", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5NotEqualTo(String value) {
            addCriterion("RESERVED_FIELD5 <>", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5GreaterThan(String value) {
            addCriterion("RESERVED_FIELD5 >", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD5 >=", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5LessThan(String value) {
            addCriterion("RESERVED_FIELD5 <", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_FIELD5 <=", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5Like(String value) {
            addCriterion("RESERVED_FIELD5 like", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5NotLike(String value) {
            addCriterion("RESERVED_FIELD5 not like", value, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5In(List<String> values) {
            addCriterion("RESERVED_FIELD5 in", values, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5NotIn(List<String> values) {
            addCriterion("RESERVED_FIELD5 not in", values, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5Between(String value1, String value2) {
            addCriterion("RESERVED_FIELD5 between", value1, value2, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andReservedField5NotBetween(String value1, String value2) {
            addCriterion("RESERVED_FIELD5 not between", value1, value2, "reservedField5");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andExtendValue1IsNull() {
            addCriterion("EXTEND_VALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue1IsNotNull() {
            addCriterion("EXTEND_VALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue1EqualTo(String value) {
            addCriterion("EXTEND_VALUE1 =", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE1 <>", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1GreaterThan(String value) {
            addCriterion("EXTEND_VALUE1 >", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE1 >=", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1LessThan(String value) {
            addCriterion("EXTEND_VALUE1 <", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE1 <=", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1Like(String value) {
            addCriterion("EXTEND_VALUE1 like", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1NotLike(String value) {
            addCriterion("EXTEND_VALUE1 not like", value, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1In(List<String> values) {
            addCriterion("EXTEND_VALUE1 in", values, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE1 not in", values, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE1 between", value1, value2, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andExtendValue1NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE1 not between", value1, value2, "extendValue1");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyIsNull() {
            addCriterion("BUSINESS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyIsNotNull() {
            addCriterion("BUSINESS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyEqualTo(Long value) {
            addCriterion("BUSINESS_KEY =", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyNotEqualTo(Long value) {
            addCriterion("BUSINESS_KEY <>", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyGreaterThan(Long value) {
            addCriterion("BUSINESS_KEY >", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_KEY >=", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyLessThan(Long value) {
            addCriterion("BUSINESS_KEY <", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_KEY <=", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyIn(List<Long> values) {
            addCriterion("BUSINESS_KEY in", values, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyNotIn(List<Long> values) {
            addCriterion("BUSINESS_KEY not in", values, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_KEY between", value1, value2, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_KEY not between", value1, value2, "businessKey");
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

        public Criteria andExtendEventValue01IsNull() {
            addCriterion("EXTEND_EVENT_VALUE01 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE01 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 =", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 <>", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 >", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 >=", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 <", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 <=", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 like", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE01 not like", value, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE01 in", values, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE01 not in", values, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE01 between", value1, value2, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue01NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE01 not between", value1, value2, "extendEventValue01");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02IsNull() {
            addCriterion("EXTEND_EVENT_VALUE02 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE02 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 =", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 <>", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 >", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 >=", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 <", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 <=", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 like", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE02 not like", value, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE02 in", values, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE02 not in", values, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE02 between", value1, value2, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue02NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE02 not between", value1, value2, "extendEventValue02");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03IsNull() {
            addCriterion("EXTEND_EVENT_VALUE03 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE03 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 =", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 <>", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 >", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 >=", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 <", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 <=", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 like", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE03 not like", value, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE03 in", values, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE03 not in", values, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE03 between", value1, value2, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue03NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE03 not between", value1, value2, "extendEventValue03");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04IsNull() {
            addCriterion("EXTEND_EVENT_VALUE04 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE04 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 =", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 <>", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 >", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 >=", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 <", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 <=", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 like", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE04 not like", value, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE04 in", values, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE04 not in", values, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE04 between", value1, value2, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue04NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE04 not between", value1, value2, "extendEventValue04");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05IsNull() {
            addCriterion("EXTEND_EVENT_VALUE05 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE05 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 =", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 <>", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 >", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 >=", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 <", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 <=", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 like", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE05 not like", value, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE05 in", values, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE05 not in", values, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE05 between", value1, value2, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue05NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE05 not between", value1, value2, "extendEventValue05");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06IsNull() {
            addCriterion("EXTEND_EVENT_VALUE06 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE06 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 =", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 <>", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 >", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 >=", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 <", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 <=", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 like", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE06 not like", value, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE06 in", values, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE06 not in", values, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE06 between", value1, value2, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue06NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE06 not between", value1, value2, "extendEventValue06");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07IsNull() {
            addCriterion("EXTEND_EVENT_VALUE07 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE07 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 =", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 <>", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 >", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 >=", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 <", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 <=", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 like", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE07 not like", value, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE07 in", values, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE07 not in", values, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE07 between", value1, value2, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue07NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE07 not between", value1, value2, "extendEventValue07");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08IsNull() {
            addCriterion("EXTEND_EVENT_VALUE08 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE08 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 =", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 <>", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 >", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 >=", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 <", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 <=", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 like", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE08 not like", value, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE08 in", values, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE08 not in", values, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE08 between", value1, value2, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue08NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE08 not between", value1, value2, "extendEventValue08");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09IsNull() {
            addCriterion("EXTEND_EVENT_VALUE09 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE09 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 =", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 <>", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 >", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 >=", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 <", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 <=", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 like", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE09 not like", value, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE09 in", values, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE09 not in", values, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE09 between", value1, value2, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue09NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE09 not between", value1, value2, "extendEventValue09");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10IsNull() {
            addCriterion("EXTEND_EVENT_VALUE10 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10IsNotNull() {
            addCriterion("EXTEND_EVENT_VALUE10 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10EqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 =", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 <>", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 >", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 >=", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10LessThan(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 <", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 <=", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10Like(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 like", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10NotLike(String value) {
            addCriterion("EXTEND_EVENT_VALUE10 not like", value, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10In(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE10 in", values, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_VALUE10 not in", values, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE10 between", value1, value2, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andExtendEventValue10NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_VALUE10 not between", value1, value2, "extendEventValue10");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagIsNull() {
            addCriterion("NO_BILL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagIsNotNull() {
            addCriterion("NO_BILL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagEqualTo(BigDecimal value) {
            addCriterion("NO_BILL_FLAG =", value, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagNotEqualTo(BigDecimal value) {
            addCriterion("NO_BILL_FLAG <>", value, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagGreaterThan(BigDecimal value) {
            addCriterion("NO_BILL_FLAG >", value, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_BILL_FLAG >=", value, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagLessThan(BigDecimal value) {
            addCriterion("NO_BILL_FLAG <", value, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_BILL_FLAG <=", value, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagIn(List<BigDecimal> values) {
            addCriterion("NO_BILL_FLAG in", values, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagNotIn(List<BigDecimal> values) {
            addCriterion("NO_BILL_FLAG not in", values, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_BILL_FLAG between", value1, value2, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andNoBillFlagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_BILL_FLAG not between", value1, value2, "noBillFlag");
            return (Criteria) this;
        }

        public Criteria andExtendValue2IsNull() {
            addCriterion("EXTEND_VALUE2 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue2IsNotNull() {
            addCriterion("EXTEND_VALUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue2EqualTo(String value) {
            addCriterion("EXTEND_VALUE2 =", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE2 <>", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2GreaterThan(String value) {
            addCriterion("EXTEND_VALUE2 >", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE2 >=", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2LessThan(String value) {
            addCriterion("EXTEND_VALUE2 <", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE2 <=", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2Like(String value) {
            addCriterion("EXTEND_VALUE2 like", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2NotLike(String value) {
            addCriterion("EXTEND_VALUE2 not like", value, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2In(List<String> values) {
            addCriterion("EXTEND_VALUE2 in", values, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE2 not in", values, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE2 between", value1, value2, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue2NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE2 not between", value1, value2, "extendValue2");
            return (Criteria) this;
        }

        public Criteria andExtendValue3IsNull() {
            addCriterion("EXTEND_VALUE3 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue3IsNotNull() {
            addCriterion("EXTEND_VALUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue3EqualTo(String value) {
            addCriterion("EXTEND_VALUE3 =", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE3 <>", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3GreaterThan(String value) {
            addCriterion("EXTEND_VALUE3 >", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE3 >=", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3LessThan(String value) {
            addCriterion("EXTEND_VALUE3 <", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE3 <=", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3Like(String value) {
            addCriterion("EXTEND_VALUE3 like", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3NotLike(String value) {
            addCriterion("EXTEND_VALUE3 not like", value, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3In(List<String> values) {
            addCriterion("EXTEND_VALUE3 in", values, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE3 not in", values, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE3 between", value1, value2, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue3NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE3 not between", value1, value2, "extendValue3");
            return (Criteria) this;
        }

        public Criteria andExtendValue4IsNull() {
            addCriterion("EXTEND_VALUE4 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue4IsNotNull() {
            addCriterion("EXTEND_VALUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue4EqualTo(String value) {
            addCriterion("EXTEND_VALUE4 =", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE4 <>", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4GreaterThan(String value) {
            addCriterion("EXTEND_VALUE4 >", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE4 >=", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4LessThan(String value) {
            addCriterion("EXTEND_VALUE4 <", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE4 <=", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4Like(String value) {
            addCriterion("EXTEND_VALUE4 like", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4NotLike(String value) {
            addCriterion("EXTEND_VALUE4 not like", value, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4In(List<String> values) {
            addCriterion("EXTEND_VALUE4 in", values, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE4 not in", values, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE4 between", value1, value2, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue4NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE4 not between", value1, value2, "extendValue4");
            return (Criteria) this;
        }

        public Criteria andExtendValue5IsNull() {
            addCriterion("EXTEND_VALUE5 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue5IsNotNull() {
            addCriterion("EXTEND_VALUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue5EqualTo(String value) {
            addCriterion("EXTEND_VALUE5 =", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE5 <>", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5GreaterThan(String value) {
            addCriterion("EXTEND_VALUE5 >", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE5 >=", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5LessThan(String value) {
            addCriterion("EXTEND_VALUE5 <", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE5 <=", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5Like(String value) {
            addCriterion("EXTEND_VALUE5 like", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5NotLike(String value) {
            addCriterion("EXTEND_VALUE5 not like", value, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5In(List<String> values) {
            addCriterion("EXTEND_VALUE5 in", values, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE5 not in", values, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE5 between", value1, value2, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue5NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE5 not between", value1, value2, "extendValue5");
            return (Criteria) this;
        }

        public Criteria andExtendValue6IsNull() {
            addCriterion("EXTEND_VALUE6 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue6IsNotNull() {
            addCriterion("EXTEND_VALUE6 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue6EqualTo(String value) {
            addCriterion("EXTEND_VALUE6 =", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE6 <>", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6GreaterThan(String value) {
            addCriterion("EXTEND_VALUE6 >", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE6 >=", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6LessThan(String value) {
            addCriterion("EXTEND_VALUE6 <", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE6 <=", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6Like(String value) {
            addCriterion("EXTEND_VALUE6 like", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6NotLike(String value) {
            addCriterion("EXTEND_VALUE6 not like", value, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6In(List<String> values) {
            addCriterion("EXTEND_VALUE6 in", values, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE6 not in", values, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE6 between", value1, value2, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue6NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE6 not between", value1, value2, "extendValue6");
            return (Criteria) this;
        }

        public Criteria andExtendValue7IsNull() {
            addCriterion("EXTEND_VALUE7 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue7IsNotNull() {
            addCriterion("EXTEND_VALUE7 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue7EqualTo(String value) {
            addCriterion("EXTEND_VALUE7 =", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE7 <>", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7GreaterThan(String value) {
            addCriterion("EXTEND_VALUE7 >", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE7 >=", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7LessThan(String value) {
            addCriterion("EXTEND_VALUE7 <", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE7 <=", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7Like(String value) {
            addCriterion("EXTEND_VALUE7 like", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7NotLike(String value) {
            addCriterion("EXTEND_VALUE7 not like", value, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7In(List<String> values) {
            addCriterion("EXTEND_VALUE7 in", values, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE7 not in", values, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE7 between", value1, value2, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue7NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE7 not between", value1, value2, "extendValue7");
            return (Criteria) this;
        }

        public Criteria andExtendValue8IsNull() {
            addCriterion("EXTEND_VALUE8 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue8IsNotNull() {
            addCriterion("EXTEND_VALUE8 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue8EqualTo(String value) {
            addCriterion("EXTEND_VALUE8 =", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE8 <>", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8GreaterThan(String value) {
            addCriterion("EXTEND_VALUE8 >", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE8 >=", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8LessThan(String value) {
            addCriterion("EXTEND_VALUE8 <", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE8 <=", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8Like(String value) {
            addCriterion("EXTEND_VALUE8 like", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8NotLike(String value) {
            addCriterion("EXTEND_VALUE8 not like", value, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8In(List<String> values) {
            addCriterion("EXTEND_VALUE8 in", values, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE8 not in", values, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE8 between", value1, value2, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue8NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE8 not between", value1, value2, "extendValue8");
            return (Criteria) this;
        }

        public Criteria andExtendValue9IsNull() {
            addCriterion("EXTEND_VALUE9 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue9IsNotNull() {
            addCriterion("EXTEND_VALUE9 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue9EqualTo(String value) {
            addCriterion("EXTEND_VALUE9 =", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE9 <>", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9GreaterThan(String value) {
            addCriterion("EXTEND_VALUE9 >", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE9 >=", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9LessThan(String value) {
            addCriterion("EXTEND_VALUE9 <", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE9 <=", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9Like(String value) {
            addCriterion("EXTEND_VALUE9 like", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9NotLike(String value) {
            addCriterion("EXTEND_VALUE9 not like", value, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9In(List<String> values) {
            addCriterion("EXTEND_VALUE9 in", values, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE9 not in", values, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE9 between", value1, value2, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue9NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE9 not between", value1, value2, "extendValue9");
            return (Criteria) this;
        }

        public Criteria andExtendValue10IsNull() {
            addCriterion("EXTEND_VALUE10 is null");
            return (Criteria) this;
        }

        public Criteria andExtendValue10IsNotNull() {
            addCriterion("EXTEND_VALUE10 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValue10EqualTo(String value) {
            addCriterion("EXTEND_VALUE10 =", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10NotEqualTo(String value) {
            addCriterion("EXTEND_VALUE10 <>", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10GreaterThan(String value) {
            addCriterion("EXTEND_VALUE10 >", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE10 >=", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10LessThan(String value) {
            addCriterion("EXTEND_VALUE10 <", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE10 <=", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10Like(String value) {
            addCriterion("EXTEND_VALUE10 like", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10NotLike(String value) {
            addCriterion("EXTEND_VALUE10 not like", value, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10In(List<String> values) {
            addCriterion("EXTEND_VALUE10 in", values, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10NotIn(List<String> values) {
            addCriterion("EXTEND_VALUE10 not in", values, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10Between(String value1, String value2) {
            addCriterion("EXTEND_VALUE10 between", value1, value2, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andExtendValue10NotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE10 not between", value1, value2, "extendValue10");
            return (Criteria) this;
        }

        public Criteria andEventSeqIsNull() {
            addCriterion("EVENT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andEventSeqIsNotNull() {
            addCriterion("EVENT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andEventSeqEqualTo(Long value) {
            addCriterion("EVENT_SEQ =", value, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqNotEqualTo(Long value) {
            addCriterion("EVENT_SEQ <>", value, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqGreaterThan(Long value) {
            addCriterion("EVENT_SEQ >", value, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENT_SEQ >=", value, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqLessThan(Long value) {
            addCriterion("EVENT_SEQ <", value, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqLessThanOrEqualTo(Long value) {
            addCriterion("EVENT_SEQ <=", value, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqIn(List<Long> values) {
            addCriterion("EVENT_SEQ in", values, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqNotIn(List<Long> values) {
            addCriterion("EVENT_SEQ not in", values, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqBetween(Long value1, Long value2) {
            addCriterion("EVENT_SEQ between", value1, value2, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andEventSeqNotBetween(Long value1, Long value2) {
            addCriterion("EVENT_SEQ not between", value1, value2, "eventSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceIsNull() {
            addCriterion("ORG_SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceIsNotNull() {
            addCriterion("ORG_SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceEqualTo(String value) {
            addCriterion("ORG_SEQUENCE =", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceNotEqualTo(String value) {
            addCriterion("ORG_SEQUENCE <>", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceGreaterThan(String value) {
            addCriterion("ORG_SEQUENCE >", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SEQUENCE >=", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceLessThan(String value) {
            addCriterion("ORG_SEQUENCE <", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceLessThanOrEqualTo(String value) {
            addCriterion("ORG_SEQUENCE <=", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceLike(String value) {
            addCriterion("ORG_SEQUENCE like", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceNotLike(String value) {
            addCriterion("ORG_SEQUENCE not like", value, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceIn(List<String> values) {
            addCriterion("ORG_SEQUENCE in", values, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceNotIn(List<String> values) {
            addCriterion("ORG_SEQUENCE not in", values, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceBetween(String value1, String value2) {
            addCriterion("ORG_SEQUENCE between", value1, value2, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andOrgSequenceNotBetween(String value1, String value2) {
            addCriterion("ORG_SEQUENCE not between", value1, value2, "orgSequence");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNull() {
            addCriterion("DOMAIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNotNull() {
            addCriterion("DOMAIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("DOMAIN_NAME =", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("DOMAIN_NAME <>", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("DOMAIN_NAME >", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOMAIN_NAME >=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThan(String value) {
            addCriterion("DOMAIN_NAME <", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("DOMAIN_NAME <=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLike(String value) {
            addCriterion("DOMAIN_NAME like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotLike(String value) {
            addCriterion("DOMAIN_NAME not like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIn(List<String> values) {
            addCriterion("DOMAIN_NAME in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotIn(List<String> values) {
            addCriterion("DOMAIN_NAME not in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("DOMAIN_NAME between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("DOMAIN_NAME not between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeIsNull() {
            addCriterion("ACCOUNT_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeIsNotNull() {
            addCriterion("ACCOUNT_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeEqualTo(String value) {
            addCriterion("ACCOUNT_AREA_CODE =", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeNotEqualTo(String value) {
            addCriterion("ACCOUNT_AREA_CODE <>", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeGreaterThan(String value) {
            addCriterion("ACCOUNT_AREA_CODE >", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_AREA_CODE >=", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeLessThan(String value) {
            addCriterion("ACCOUNT_AREA_CODE <", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_AREA_CODE <=", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeLike(String value) {
            addCriterion("ACCOUNT_AREA_CODE like", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeNotLike(String value) {
            addCriterion("ACCOUNT_AREA_CODE not like", value, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeIn(List<String> values) {
            addCriterion("ACCOUNT_AREA_CODE in", values, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeNotIn(List<String> values) {
            addCriterion("ACCOUNT_AREA_CODE not in", values, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeBetween(String value1, String value2) {
            addCriterion("ACCOUNT_AREA_CODE between", value1, value2, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andAccountAreaCodeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_AREA_CODE not between", value1, value2, "accountAreaCode");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureIsNull() {
            addCriterion("FIRST_PRICING_MEASURE is null");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureIsNotNull() {
            addCriterion("FIRST_PRICING_MEASURE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureEqualTo(Integer value) {
            addCriterion("FIRST_PRICING_MEASURE =", value, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureNotEqualTo(Integer value) {
            addCriterion("FIRST_PRICING_MEASURE <>", value, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureGreaterThan(Integer value) {
            addCriterion("FIRST_PRICING_MEASURE >", value, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIRST_PRICING_MEASURE >=", value, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureLessThan(Integer value) {
            addCriterion("FIRST_PRICING_MEASURE <", value, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureLessThanOrEqualTo(Integer value) {
            addCriterion("FIRST_PRICING_MEASURE <=", value, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureIn(List<Integer> values) {
            addCriterion("FIRST_PRICING_MEASURE in", values, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureNotIn(List<Integer> values) {
            addCriterion("FIRST_PRICING_MEASURE not in", values, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureBetween(Integer value1, Integer value2) {
            addCriterion("FIRST_PRICING_MEASURE between", value1, value2, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andFirstPricingMeasureNotBetween(Integer value1, Integer value2) {
            addCriterion("FIRST_PRICING_MEASURE not between", value1, value2, "firstPricingMeasure");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("IMEI is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("IMEI =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("IMEI <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("IMEI >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("IMEI >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("IMEI <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("IMEI <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("IMEI like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("IMEI not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("IMEI in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("IMEI not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("IMEI between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("IMEI not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01IsNull() {
            addCriterion("EXTEND_EVENT_ID01 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01IsNotNull() {
            addCriterion("EXTEND_EVENT_ID01 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01EqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID01 =", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID01 <>", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_ID01 >", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID01 >=", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01LessThan(String value) {
            addCriterion("EXTEND_EVENT_ID01 <", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID01 <=", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01Like(String value) {
            addCriterion("EXTEND_EVENT_ID01 like", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01NotLike(String value) {
            addCriterion("EXTEND_EVENT_ID01 not like", value, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01In(List<String> values) {
            addCriterion("EXTEND_EVENT_ID01 in", values, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_ID01 not in", values, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_ID01 between", value1, value2, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId01NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_ID01 not between", value1, value2, "extendEventId01");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10IsNull() {
            addCriterion("EXTEND_EVENT_ID10 is null");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10IsNotNull() {
            addCriterion("EXTEND_EVENT_ID10 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10EqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID10 =", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10NotEqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID10 <>", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10GreaterThan(String value) {
            addCriterion("EXTEND_EVENT_ID10 >", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID10 >=", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10LessThan(String value) {
            addCriterion("EXTEND_EVENT_ID10 <", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10LessThanOrEqualTo(String value) {
            addCriterion("EXTEND_EVENT_ID10 <=", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10Like(String value) {
            addCriterion("EXTEND_EVENT_ID10 like", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10NotLike(String value) {
            addCriterion("EXTEND_EVENT_ID10 not like", value, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10In(List<String> values) {
            addCriterion("EXTEND_EVENT_ID10 in", values, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10NotIn(List<String> values) {
            addCriterion("EXTEND_EVENT_ID10 not in", values, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10Between(String value1, String value2) {
            addCriterion("EXTEND_EVENT_ID10 between", value1, value2, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andExtendEventId10NotBetween(String value1, String value2) {
            addCriterion("EXTEND_EVENT_ID10 not between", value1, value2, "extendEventId10");
            return (Criteria) this;
        }

        public Criteria andBindAttrIsNull() {
            addCriterion("BIND_ATTR is null");
            return (Criteria) this;
        }

        public Criteria andBindAttrIsNotNull() {
            addCriterion("BIND_ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andBindAttrEqualTo(String value) {
            addCriterion("BIND_ATTR =", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrNotEqualTo(String value) {
            addCriterion("BIND_ATTR <>", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrGreaterThan(String value) {
            addCriterion("BIND_ATTR >", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_ATTR >=", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrLessThan(String value) {
            addCriterion("BIND_ATTR <", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrLessThanOrEqualTo(String value) {
            addCriterion("BIND_ATTR <=", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrLike(String value) {
            addCriterion("BIND_ATTR like", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrNotLike(String value) {
            addCriterion("BIND_ATTR not like", value, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrIn(List<String> values) {
            addCriterion("BIND_ATTR in", values, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrNotIn(List<String> values) {
            addCriterion("BIND_ATTR not in", values, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrBetween(String value1, String value2) {
            addCriterion("BIND_ATTR between", value1, value2, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andBindAttrNotBetween(String value1, String value2) {
            addCriterion("BIND_ATTR not between", value1, value2, "bindAttr");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdIsNull() {
            addCriterion("LONG_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdIsNotNull() {
            addCriterion("LONG_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdEqualTo(Integer value) {
            addCriterion("LONG_TYPE_ID =", value, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdNotEqualTo(Integer value) {
            addCriterion("LONG_TYPE_ID <>", value, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdGreaterThan(Integer value) {
            addCriterion("LONG_TYPE_ID >", value, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LONG_TYPE_ID >=", value, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdLessThan(Integer value) {
            addCriterion("LONG_TYPE_ID <", value, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("LONG_TYPE_ID <=", value, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdIn(List<Integer> values) {
            addCriterion("LONG_TYPE_ID in", values, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdNotIn(List<Integer> values) {
            addCriterion("LONG_TYPE_ID not in", values, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("LONG_TYPE_ID between", value1, value2, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andLongTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LONG_TYPE_ID not between", value1, value2, "longTypeId");
            return (Criteria) this;
        }

        public Criteria andErrorIdIsNull() {
            addCriterion("ERROR_ID is null");
            return (Criteria) this;
        }

        public Criteria andErrorIdIsNotNull() {
            addCriterion("ERROR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andErrorIdEqualTo(Integer value) {
            addCriterion("ERROR_ID =", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdNotEqualTo(Integer value) {
            addCriterion("ERROR_ID <>", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdGreaterThan(Integer value) {
            addCriterion("ERROR_ID >", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERROR_ID >=", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdLessThan(Integer value) {
            addCriterion("ERROR_ID <", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdLessThanOrEqualTo(Integer value) {
            addCriterion("ERROR_ID <=", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdIn(List<Integer> values) {
            addCriterion("ERROR_ID in", values, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdNotIn(List<Integer> values) {
            addCriterion("ERROR_ID not in", values, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_ID between", value1, value2, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_ID not between", value1, value2, "errorId");
            return (Criteria) this;
        }

        public Criteria andUsageAmountIsNull() {
            addCriterion("USAGE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsageAmountIsNotNull() {
            addCriterion("USAGE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsageAmountEqualTo(Long value) {
            addCriterion("USAGE_AMOUNT =", value, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountNotEqualTo(Long value) {
            addCriterion("USAGE_AMOUNT <>", value, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountGreaterThan(Long value) {
            addCriterion("USAGE_AMOUNT >", value, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("USAGE_AMOUNT >=", value, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountLessThan(Long value) {
            addCriterion("USAGE_AMOUNT <", value, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountLessThanOrEqualTo(Long value) {
            addCriterion("USAGE_AMOUNT <=", value, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountIn(List<Long> values) {
            addCriterion("USAGE_AMOUNT in", values, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountNotIn(List<Long> values) {
            addCriterion("USAGE_AMOUNT not in", values, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountBetween(Long value1, Long value2) {
            addCriterion("USAGE_AMOUNT between", value1, value2, "usageAmount");
            return (Criteria) this;
        }

        public Criteria andUsageAmountNotBetween(Long value1, Long value2) {
            addCriterion("USAGE_AMOUNT not between", value1, value2, "usageAmount");
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