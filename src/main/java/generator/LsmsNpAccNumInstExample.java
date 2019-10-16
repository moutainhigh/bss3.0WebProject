package generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LsmsNpAccNumInstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LsmsNpAccNumInstExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andNpAccNumInstIdIsNull() {
            addCriterion("np_acc_num_inst_id is null");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdIsNotNull() {
            addCriterion("np_acc_num_inst_id is not null");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdEqualTo(Long value) {
            addCriterion("np_acc_num_inst_id =", value, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdNotEqualTo(Long value) {
            addCriterion("np_acc_num_inst_id <>", value, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdGreaterThan(Long value) {
            addCriterion("np_acc_num_inst_id >", value, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("np_acc_num_inst_id >=", value, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdLessThan(Long value) {
            addCriterion("np_acc_num_inst_id <", value, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdLessThanOrEqualTo(Long value) {
            addCriterion("np_acc_num_inst_id <=", value, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdIn(List<Long> values) {
            addCriterion("np_acc_num_inst_id in", values, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdNotIn(List<Long> values) {
            addCriterion("np_acc_num_inst_id not in", values, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdBetween(Long value1, Long value2) {
            addCriterion("np_acc_num_inst_id between", value1, value2, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andNpAccNumInstIdNotBetween(Long value1, Long value2) {
            addCriterion("np_acc_num_inst_id not between", value1, value2, "npAccNumInstId");
            return (Criteria) this;
        }

        public Criteria andAccNumIsNull() {
            addCriterion("acc_num is null");
            return (Criteria) this;
        }

        public Criteria andAccNumIsNotNull() {
            addCriterion("acc_num is not null");
            return (Criteria) this;
        }

        public Criteria andAccNumEqualTo(String value) {
            addCriterion("acc_num =", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotEqualTo(String value) {
            addCriterion("acc_num <>", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThan(String value) {
            addCriterion("acc_num >", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("acc_num >=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThan(String value) {
            addCriterion("acc_num <", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThanOrEqualTo(String value) {
            addCriterion("acc_num <=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLike(String value) {
            addCriterion("acc_num like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotLike(String value) {
            addCriterion("acc_num not like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumIn(List<String> values) {
            addCriterion("acc_num in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotIn(List<String> values) {
            addCriterion("acc_num not in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumBetween(String value1, String value2) {
            addCriterion("acc_num between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotBetween(String value1, String value2) {
            addCriterion("acc_num not between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andInNetworkIsNull() {
            addCriterion("in_network is null");
            return (Criteria) this;
        }

        public Criteria andInNetworkIsNotNull() {
            addCriterion("in_network is not null");
            return (Criteria) this;
        }

        public Criteria andInNetworkEqualTo(String value) {
            addCriterion("in_network =", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkNotEqualTo(String value) {
            addCriterion("in_network <>", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkGreaterThan(String value) {
            addCriterion("in_network >", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("in_network >=", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkLessThan(String value) {
            addCriterion("in_network <", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkLessThanOrEqualTo(String value) {
            addCriterion("in_network <=", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkLike(String value) {
            addCriterion("in_network like", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkNotLike(String value) {
            addCriterion("in_network not like", value, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkIn(List<String> values) {
            addCriterion("in_network in", values, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkNotIn(List<String> values) {
            addCriterion("in_network not in", values, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkBetween(String value1, String value2) {
            addCriterion("in_network between", value1, value2, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andInNetworkNotBetween(String value1, String value2) {
            addCriterion("in_network not between", value1, value2, "inNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkIsNull() {
            addCriterion("out_network is null");
            return (Criteria) this;
        }

        public Criteria andOutNetworkIsNotNull() {
            addCriterion("out_network is not null");
            return (Criteria) this;
        }

        public Criteria andOutNetworkEqualTo(String value) {
            addCriterion("out_network =", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkNotEqualTo(String value) {
            addCriterion("out_network <>", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkGreaterThan(String value) {
            addCriterion("out_network >", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("out_network >=", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkLessThan(String value) {
            addCriterion("out_network <", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkLessThanOrEqualTo(String value) {
            addCriterion("out_network <=", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkLike(String value) {
            addCriterion("out_network like", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkNotLike(String value) {
            addCriterion("out_network not like", value, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkIn(List<String> values) {
            addCriterion("out_network in", values, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkNotIn(List<String> values) {
            addCriterion("out_network not in", values, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkBetween(String value1, String value2) {
            addCriterion("out_network between", value1, value2, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOutNetworkNotBetween(String value1, String value2) {
            addCriterion("out_network not between", value1, value2, "outNetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkIsNull() {
            addCriterion("own_netnetwork is null");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkIsNotNull() {
            addCriterion("own_netnetwork is not null");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkEqualTo(String value) {
            addCriterion("own_netnetwork =", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkNotEqualTo(String value) {
            addCriterion("own_netnetwork <>", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkGreaterThan(String value) {
            addCriterion("own_netnetwork >", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkGreaterThanOrEqualTo(String value) {
            addCriterion("own_netnetwork >=", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkLessThan(String value) {
            addCriterion("own_netnetwork <", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkLessThanOrEqualTo(String value) {
            addCriterion("own_netnetwork <=", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkLike(String value) {
            addCriterion("own_netnetwork like", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkNotLike(String value) {
            addCriterion("own_netnetwork not like", value, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkIn(List<String> values) {
            addCriterion("own_netnetwork in", values, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkNotIn(List<String> values) {
            addCriterion("own_netnetwork not in", values, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkBetween(String value1, String value2) {
            addCriterion("own_netnetwork between", value1, value2, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andOwnNetnetworkNotBetween(String value1, String value2) {
            addCriterion("own_netnetwork not between", value1, value2, "ownNetnetwork");
            return (Criteria) this;
        }

        public Criteria andEffDateIsNull() {
            addCriterion("eff_date is null");
            return (Criteria) this;
        }

        public Criteria andEffDateIsNotNull() {
            addCriterion("eff_date is not null");
            return (Criteria) this;
        }

        public Criteria andEffDateEqualTo(Date value) {
            addCriterion("eff_date =", value, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateNotEqualTo(Date value) {
            addCriterion("eff_date <>", value, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateGreaterThan(Date value) {
            addCriterion("eff_date >", value, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateGreaterThanOrEqualTo(Date value) {
            addCriterion("eff_date >=", value, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateLessThan(Date value) {
            addCriterion("eff_date <", value, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateLessThanOrEqualTo(Date value) {
            addCriterion("eff_date <=", value, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateIn(List<Date> values) {
            addCriterion("eff_date in", values, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateNotIn(List<Date> values) {
            addCriterion("eff_date not in", values, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateBetween(Date value1, Date value2) {
            addCriterion("eff_date between", value1, value2, "effDate");
            return (Criteria) this;
        }

        public Criteria andEffDateNotBetween(Date value1, Date value2) {
            addCriterion("eff_date not between", value1, value2, "effDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNull() {
            addCriterion("exp_date is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("exp_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(Date value) {
            addCriterion("exp_date =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(Date value) {
            addCriterion("exp_date <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(Date value) {
            addCriterion("exp_date >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_date >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(Date value) {
            addCriterion("exp_date <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(Date value) {
            addCriterion("exp_date <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<Date> values) {
            addCriterion("exp_date in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<Date> values) {
            addCriterion("exp_date not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(Date value1, Date value2) {
            addCriterion("exp_date between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(Date value1, Date value2) {
            addCriterion("exp_date not between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNull() {
            addCriterion("create_staff is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNotNull() {
            addCriterion("create_staff is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffEqualTo(Long value) {
            addCriterion("create_staff =", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotEqualTo(Long value) {
            addCriterion("create_staff <>", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThan(Long value) {
            addCriterion("create_staff >", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("create_staff >=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThan(Long value) {
            addCriterion("create_staff <", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThanOrEqualTo(Long value) {
            addCriterion("create_staff <=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIn(List<Long> values) {
            addCriterion("create_staff in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotIn(List<Long> values) {
            addCriterion("create_staff not in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffBetween(Long value1, Long value2) {
            addCriterion("create_staff between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotBetween(Long value1, Long value2) {
            addCriterion("create_staff not between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNull() {
            addCriterion("update_staff is null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNotNull() {
            addCriterion("update_staff is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffEqualTo(Long value) {
            addCriterion("update_staff =", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotEqualTo(Long value) {
            addCriterion("update_staff <>", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThan(Long value) {
            addCriterion("update_staff >", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("update_staff >=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThan(Long value) {
            addCriterion("update_staff <", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThanOrEqualTo(Long value) {
            addCriterion("update_staff <=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIn(List<Long> values) {
            addCriterion("update_staff in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotIn(List<Long> values) {
            addCriterion("update_staff not in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffBetween(Long value1, Long value2) {
            addCriterion("update_staff between", value1, value2, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotBetween(Long value1, Long value2) {
            addCriterion("update_staff not between", value1, value2, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateIsNull() {
            addCriterion("status_date is null");
            return (Criteria) this;
        }

        public Criteria andStatusDateIsNotNull() {
            addCriterion("status_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDateEqualTo(Date value) {
            addCriterion("status_date =", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotEqualTo(Date value) {
            addCriterion("status_date <>", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateGreaterThan(Date value) {
            addCriterion("status_date >", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateGreaterThanOrEqualTo(Date value) {
            addCriterion("status_date >=", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateLessThan(Date value) {
            addCriterion("status_date <", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateLessThanOrEqualTo(Date value) {
            addCriterion("status_date <=", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateIn(List<Date> values) {
            addCriterion("status_date in", values, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotIn(List<Date> values) {
            addCriterion("status_date not in", values, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateBetween(Date value1, Date value2) {
            addCriterion("status_date between", value1, value2, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotBetween(Date value1, Date value2) {
            addCriterion("status_date not between", value1, value2, "statusDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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