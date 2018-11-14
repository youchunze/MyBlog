package cn.ycz.myblog.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("Mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("Mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Long value) {
            addCriterion("Mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Long value) {
            addCriterion("Mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Long value) {
            addCriterion("Mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Long value) {
            addCriterion("Mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Long value) {
            addCriterion("Mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Long value) {
            addCriterion("Mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Long> values) {
            addCriterion("Mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Long> values) {
            addCriterion("Mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Long value1, Long value2) {
            addCriterion("Mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Long value1, Long value2) {
            addCriterion("Mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("Uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("Uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("Uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("Uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("Uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("Uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("Uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("Uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("Uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("Uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("Uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("Uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("Tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("Tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("Tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("Tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("Tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("Tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("Tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("Tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("Tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("Tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("Tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("Tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("Tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("Tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("Cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("Cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("Cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("Cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("Cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("Cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("Cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("Cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("Cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("Cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("Cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("Cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("Cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("Cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andMcontentIsNull() {
            addCriterion("Mcontent is null");
            return (Criteria) this;
        }

        public Criteria andMcontentIsNotNull() {
            addCriterion("Mcontent is not null");
            return (Criteria) this;
        }

        public Criteria andMcontentEqualTo(String value) {
            addCriterion("Mcontent =", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotEqualTo(String value) {
            addCriterion("Mcontent <>", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentGreaterThan(String value) {
            addCriterion("Mcontent >", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentGreaterThanOrEqualTo(String value) {
            addCriterion("Mcontent >=", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentLessThan(String value) {
            addCriterion("Mcontent <", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentLessThanOrEqualTo(String value) {
            addCriterion("Mcontent <=", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentLike(String value) {
            addCriterion("Mcontent like", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotLike(String value) {
            addCriterion("Mcontent not like", value, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentIn(List<String> values) {
            addCriterion("Mcontent in", values, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotIn(List<String> values) {
            addCriterion("Mcontent not in", values, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentBetween(String value1, String value2) {
            addCriterion("Mcontent between", value1, value2, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMcontentNotBetween(String value1, String value2) {
            addCriterion("Mcontent not between", value1, value2, "mcontent");
            return (Criteria) this;
        }

        public Criteria andMhttpIsNull() {
            addCriterion("Mhttp is null");
            return (Criteria) this;
        }

        public Criteria andMhttpIsNotNull() {
            addCriterion("Mhttp is not null");
            return (Criteria) this;
        }

        public Criteria andMhttpEqualTo(String value) {
            addCriterion("Mhttp =", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpNotEqualTo(String value) {
            addCriterion("Mhttp <>", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpGreaterThan(String value) {
            addCriterion("Mhttp >", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpGreaterThanOrEqualTo(String value) {
            addCriterion("Mhttp >=", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpLessThan(String value) {
            addCriterion("Mhttp <", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpLessThanOrEqualTo(String value) {
            addCriterion("Mhttp <=", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpLike(String value) {
            addCriterion("Mhttp like", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpNotLike(String value) {
            addCriterion("Mhttp not like", value, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpIn(List<String> values) {
            addCriterion("Mhttp in", values, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpNotIn(List<String> values) {
            addCriterion("Mhttp not in", values, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpBetween(String value1, String value2) {
            addCriterion("Mhttp between", value1, value2, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMhttpNotBetween(String value1, String value2) {
            addCriterion("Mhttp not between", value1, value2, "mhttp");
            return (Criteria) this;
        }

        public Criteria andMfavIsNull() {
            addCriterion("Mfav is null");
            return (Criteria) this;
        }

        public Criteria andMfavIsNotNull() {
            addCriterion("Mfav is not null");
            return (Criteria) this;
        }

        public Criteria andMfavEqualTo(Integer value) {
            addCriterion("Mfav =", value, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavNotEqualTo(Integer value) {
            addCriterion("Mfav <>", value, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavGreaterThan(Integer value) {
            addCriterion("Mfav >", value, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mfav >=", value, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavLessThan(Integer value) {
            addCriterion("Mfav <", value, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavLessThanOrEqualTo(Integer value) {
            addCriterion("Mfav <=", value, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavIn(List<Integer> values) {
            addCriterion("Mfav in", values, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavNotIn(List<Integer> values) {
            addCriterion("Mfav not in", values, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavBetween(Integer value1, Integer value2) {
            addCriterion("Mfav between", value1, value2, "mfav");
            return (Criteria) this;
        }

        public Criteria andMfavNotBetween(Integer value1, Integer value2) {
            addCriterion("Mfav not between", value1, value2, "mfav");
            return (Criteria) this;
        }

        public Criteria andMreplyIsNull() {
            addCriterion("Mreply is null");
            return (Criteria) this;
        }

        public Criteria andMreplyIsNotNull() {
            addCriterion("Mreply is not null");
            return (Criteria) this;
        }

        public Criteria andMreplyEqualTo(Integer value) {
            addCriterion("Mreply =", value, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyNotEqualTo(Integer value) {
            addCriterion("Mreply <>", value, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyGreaterThan(Integer value) {
            addCriterion("Mreply >", value, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mreply >=", value, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyLessThan(Integer value) {
            addCriterion("Mreply <", value, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyLessThanOrEqualTo(Integer value) {
            addCriterion("Mreply <=", value, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyIn(List<Integer> values) {
            addCriterion("Mreply in", values, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyNotIn(List<Integer> values) {
            addCriterion("Mreply not in", values, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyBetween(Integer value1, Integer value2) {
            addCriterion("Mreply between", value1, value2, "mreply");
            return (Criteria) this;
        }

        public Criteria andMreplyNotBetween(Integer value1, Integer value2) {
            addCriterion("Mreply not between", value1, value2, "mreply");
            return (Criteria) this;
        }

        public Criteria andMcopyIsNull() {
            addCriterion("Mcopy is null");
            return (Criteria) this;
        }

        public Criteria andMcopyIsNotNull() {
            addCriterion("Mcopy is not null");
            return (Criteria) this;
        }

        public Criteria andMcopyEqualTo(Integer value) {
            addCriterion("Mcopy =", value, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyNotEqualTo(Integer value) {
            addCriterion("Mcopy <>", value, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyGreaterThan(Integer value) {
            addCriterion("Mcopy >", value, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mcopy >=", value, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyLessThan(Integer value) {
            addCriterion("Mcopy <", value, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyLessThanOrEqualTo(Integer value) {
            addCriterion("Mcopy <=", value, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyIn(List<Integer> values) {
            addCriterion("Mcopy in", values, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyNotIn(List<Integer> values) {
            addCriterion("Mcopy not in", values, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyBetween(Integer value1, Integer value2) {
            addCriterion("Mcopy between", value1, value2, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMcopyNotBetween(Integer value1, Integer value2) {
            addCriterion("Mcopy not between", value1, value2, "mcopy");
            return (Criteria) this;
        }

        public Criteria andMdatetimeIsNull() {
            addCriterion("Mdatetime is null");
            return (Criteria) this;
        }

        public Criteria andMdatetimeIsNotNull() {
            addCriterion("Mdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMdatetimeEqualTo(Date value) {
            addCriterion("Mdatetime =", value, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeNotEqualTo(Date value) {
            addCriterion("Mdatetime <>", value, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeGreaterThan(Date value) {
            addCriterion("Mdatetime >", value, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Mdatetime >=", value, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeLessThan(Date value) {
            addCriterion("Mdatetime <", value, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Mdatetime <=", value, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeIn(List<Date> values) {
            addCriterion("Mdatetime in", values, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeNotIn(List<Date> values) {
            addCriterion("Mdatetime not in", values, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeBetween(Date value1, Date value2) {
            addCriterion("Mdatetime between", value1, value2, "mdatetime");
            return (Criteria) this;
        }

        public Criteria andMdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Mdatetime not between", value1, value2, "mdatetime");
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