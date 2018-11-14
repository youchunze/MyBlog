package cn.ycz.myblog.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUalaisIsNull() {
            addCriterion("Ualais is null");
            return (Criteria) this;
        }

        public Criteria andUalaisIsNotNull() {
            addCriterion("Ualais is not null");
            return (Criteria) this;
        }

        public Criteria andUalaisEqualTo(String value) {
            addCriterion("Ualais =", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisNotEqualTo(String value) {
            addCriterion("Ualais <>", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisGreaterThan(String value) {
            addCriterion("Ualais >", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisGreaterThanOrEqualTo(String value) {
            addCriterion("Ualais >=", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisLessThan(String value) {
            addCriterion("Ualais <", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisLessThanOrEqualTo(String value) {
            addCriterion("Ualais <=", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisLike(String value) {
            addCriterion("Ualais like", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisNotLike(String value) {
            addCriterion("Ualais not like", value, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisIn(List<String> values) {
            addCriterion("Ualais in", values, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisNotIn(List<String> values) {
            addCriterion("Ualais not in", values, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisBetween(String value1, String value2) {
            addCriterion("Ualais between", value1, value2, "ualais");
            return (Criteria) this;
        }

        public Criteria andUalaisNotBetween(String value1, String value2) {
            addCriterion("Ualais not between", value1, value2, "ualais");
            return (Criteria) this;
        }

        public Criteria andUimageIsNull() {
            addCriterion("Uimage is null");
            return (Criteria) this;
        }

        public Criteria andUimageIsNotNull() {
            addCriterion("Uimage is not null");
            return (Criteria) this;
        }

        public Criteria andUimageEqualTo(String value) {
            addCriterion("Uimage =", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotEqualTo(String value) {
            addCriterion("Uimage <>", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageGreaterThan(String value) {
            addCriterion("Uimage >", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageGreaterThanOrEqualTo(String value) {
            addCriterion("Uimage >=", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageLessThan(String value) {
            addCriterion("Uimage <", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageLessThanOrEqualTo(String value) {
            addCriterion("Uimage <=", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageLike(String value) {
            addCriterion("Uimage like", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotLike(String value) {
            addCriterion("Uimage not like", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageIn(List<String> values) {
            addCriterion("Uimage in", values, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotIn(List<String> values) {
            addCriterion("Uimage not in", values, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageBetween(String value1, String value2) {
            addCriterion("Uimage between", value1, value2, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotBetween(String value1, String value2) {
            addCriterion("Uimage not between", value1, value2, "uimage");
            return (Criteria) this;
        }

        public Criteria andUlogonIsNull() {
            addCriterion("Ulogon is null");
            return (Criteria) this;
        }

        public Criteria andUlogonIsNotNull() {
            addCriterion("Ulogon is not null");
            return (Criteria) this;
        }

        public Criteria andUlogonEqualTo(String value) {
            addCriterion("Ulogon =", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonNotEqualTo(String value) {
            addCriterion("Ulogon <>", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonGreaterThan(String value) {
            addCriterion("Ulogon >", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonGreaterThanOrEqualTo(String value) {
            addCriterion("Ulogon >=", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonLessThan(String value) {
            addCriterion("Ulogon <", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonLessThanOrEqualTo(String value) {
            addCriterion("Ulogon <=", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonLike(String value) {
            addCriterion("Ulogon like", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonNotLike(String value) {
            addCriterion("Ulogon not like", value, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonIn(List<String> values) {
            addCriterion("Ulogon in", values, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonNotIn(List<String> values) {
            addCriterion("Ulogon not in", values, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonBetween(String value1, String value2) {
            addCriterion("Ulogon between", value1, value2, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUlogonNotBetween(String value1, String value2) {
            addCriterion("Ulogon not between", value1, value2, "ulogon");
            return (Criteria) this;
        }

        public Criteria andUpassswdIsNull() {
            addCriterion("Upassswd is null");
            return (Criteria) this;
        }

        public Criteria andUpassswdIsNotNull() {
            addCriterion("Upassswd is not null");
            return (Criteria) this;
        }

        public Criteria andUpassswdEqualTo(String value) {
            addCriterion("Upassswd =", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdNotEqualTo(String value) {
            addCriterion("Upassswd <>", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdGreaterThan(String value) {
            addCriterion("Upassswd >", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdGreaterThanOrEqualTo(String value) {
            addCriterion("Upassswd >=", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdLessThan(String value) {
            addCriterion("Upassswd <", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdLessThanOrEqualTo(String value) {
            addCriterion("Upassswd <=", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdLike(String value) {
            addCriterion("Upassswd like", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdNotLike(String value) {
            addCriterion("Upassswd not like", value, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdIn(List<String> values) {
            addCriterion("Upassswd in", values, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdNotIn(List<String> values) {
            addCriterion("Upassswd not in", values, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdBetween(String value1, String value2) {
            addCriterion("Upassswd between", value1, value2, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUpassswdNotBetween(String value1, String value2) {
            addCriterion("Upassswd not between", value1, value2, "upassswd");
            return (Criteria) this;
        }

        public Criteria andUsexIsNull() {
            addCriterion("Usex is null");
            return (Criteria) this;
        }

        public Criteria andUsexIsNotNull() {
            addCriterion("Usex is not null");
            return (Criteria) this;
        }

        public Criteria andUsexEqualTo(String value) {
            addCriterion("Usex =", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotEqualTo(String value) {
            addCriterion("Usex <>", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThan(String value) {
            addCriterion("Usex >", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThanOrEqualTo(String value) {
            addCriterion("Usex >=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThan(String value) {
            addCriterion("Usex <", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThanOrEqualTo(String value) {
            addCriterion("Usex <=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLike(String value) {
            addCriterion("Usex like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotLike(String value) {
            addCriterion("Usex not like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexIn(List<String> values) {
            addCriterion("Usex in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotIn(List<String> values) {
            addCriterion("Usex not in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexBetween(String value1, String value2) {
            addCriterion("Usex between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotBetween(String value1, String value2) {
            addCriterion("Usex not between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("Uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("Uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("Uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("Uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("Uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("Uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("Uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("Uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("Uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("Uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("Uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("Uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("Uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("Uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUskinIsNull() {
            addCriterion("Uskin is null");
            return (Criteria) this;
        }

        public Criteria andUskinIsNotNull() {
            addCriterion("Uskin is not null");
            return (Criteria) this;
        }

        public Criteria andUskinEqualTo(String value) {
            addCriterion("Uskin =", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinNotEqualTo(String value) {
            addCriterion("Uskin <>", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinGreaterThan(String value) {
            addCriterion("Uskin >", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinGreaterThanOrEqualTo(String value) {
            addCriterion("Uskin >=", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinLessThan(String value) {
            addCriterion("Uskin <", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinLessThanOrEqualTo(String value) {
            addCriterion("Uskin <=", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinLike(String value) {
            addCriterion("Uskin like", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinNotLike(String value) {
            addCriterion("Uskin not like", value, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinIn(List<String> values) {
            addCriterion("Uskin in", values, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinNotIn(List<String> values) {
            addCriterion("Uskin not in", values, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinBetween(String value1, String value2) {
            addCriterion("Uskin between", value1, value2, "uskin");
            return (Criteria) this;
        }

        public Criteria andUskinNotBetween(String value1, String value2) {
            addCriterion("Uskin not between", value1, value2, "uskin");
            return (Criteria) this;
        }

        public Criteria andUqqIsNull() {
            addCriterion("Uqq is null");
            return (Criteria) this;
        }

        public Criteria andUqqIsNotNull() {
            addCriterion("Uqq is not null");
            return (Criteria) this;
        }

        public Criteria andUqqEqualTo(String value) {
            addCriterion("Uqq =", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotEqualTo(String value) {
            addCriterion("Uqq <>", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqGreaterThan(String value) {
            addCriterion("Uqq >", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqGreaterThanOrEqualTo(String value) {
            addCriterion("Uqq >=", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLessThan(String value) {
            addCriterion("Uqq <", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLessThanOrEqualTo(String value) {
            addCriterion("Uqq <=", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLike(String value) {
            addCriterion("Uqq like", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotLike(String value) {
            addCriterion("Uqq not like", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqIn(List<String> values) {
            addCriterion("Uqq in", values, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotIn(List<String> values) {
            addCriterion("Uqq not in", values, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqBetween(String value1, String value2) {
            addCriterion("Uqq between", value1, value2, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotBetween(String value1, String value2) {
            addCriterion("Uqq not between", value1, value2, "uqq");
            return (Criteria) this;
        }

        public Criteria andUschoolIsNull() {
            addCriterion("Uschool is null");
            return (Criteria) this;
        }

        public Criteria andUschoolIsNotNull() {
            addCriterion("Uschool is not null");
            return (Criteria) this;
        }

        public Criteria andUschoolEqualTo(String value) {
            addCriterion("Uschool =", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolNotEqualTo(String value) {
            addCriterion("Uschool <>", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolGreaterThan(String value) {
            addCriterion("Uschool >", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolGreaterThanOrEqualTo(String value) {
            addCriterion("Uschool >=", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolLessThan(String value) {
            addCriterion("Uschool <", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolLessThanOrEqualTo(String value) {
            addCriterion("Uschool <=", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolLike(String value) {
            addCriterion("Uschool like", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolNotLike(String value) {
            addCriterion("Uschool not like", value, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolIn(List<String> values) {
            addCriterion("Uschool in", values, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolNotIn(List<String> values) {
            addCriterion("Uschool not in", values, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolBetween(String value1, String value2) {
            addCriterion("Uschool between", value1, value2, "uschool");
            return (Criteria) this;
        }

        public Criteria andUschoolNotBetween(String value1, String value2) {
            addCriterion("Uschool not between", value1, value2, "uschool");
            return (Criteria) this;
        }

        public Criteria andUworkIsNull() {
            addCriterion("Uwork is null");
            return (Criteria) this;
        }

        public Criteria andUworkIsNotNull() {
            addCriterion("Uwork is not null");
            return (Criteria) this;
        }

        public Criteria andUworkEqualTo(String value) {
            addCriterion("Uwork =", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkNotEqualTo(String value) {
            addCriterion("Uwork <>", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkGreaterThan(String value) {
            addCriterion("Uwork >", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkGreaterThanOrEqualTo(String value) {
            addCriterion("Uwork >=", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkLessThan(String value) {
            addCriterion("Uwork <", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkLessThanOrEqualTo(String value) {
            addCriterion("Uwork <=", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkLike(String value) {
            addCriterion("Uwork like", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkNotLike(String value) {
            addCriterion("Uwork not like", value, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkIn(List<String> values) {
            addCriterion("Uwork in", values, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkNotIn(List<String> values) {
            addCriterion("Uwork not in", values, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkBetween(String value1, String value2) {
            addCriterion("Uwork between", value1, value2, "uwork");
            return (Criteria) this;
        }

        public Criteria andUworkNotBetween(String value1, String value2) {
            addCriterion("Uwork not between", value1, value2, "uwork");
            return (Criteria) this;
        }

        public Criteria andUtelIsNull() {
            addCriterion("Utel is null");
            return (Criteria) this;
        }

        public Criteria andUtelIsNotNull() {
            addCriterion("Utel is not null");
            return (Criteria) this;
        }

        public Criteria andUtelEqualTo(String value) {
            addCriterion("Utel =", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotEqualTo(String value) {
            addCriterion("Utel <>", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelGreaterThan(String value) {
            addCriterion("Utel >", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelGreaterThanOrEqualTo(String value) {
            addCriterion("Utel >=", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLessThan(String value) {
            addCriterion("Utel <", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLessThanOrEqualTo(String value) {
            addCriterion("Utel <=", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLike(String value) {
            addCriterion("Utel like", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotLike(String value) {
            addCriterion("Utel not like", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelIn(List<String> values) {
            addCriterion("Utel in", values, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotIn(List<String> values) {
            addCriterion("Utel not in", values, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelBetween(String value1, String value2) {
            addCriterion("Utel between", value1, value2, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotBetween(String value1, String value2) {
            addCriterion("Utel not between", value1, value2, "utel");
            return (Criteria) this;
        }

        public Criteria andUinfoIsNull() {
            addCriterion("Uinfo is null");
            return (Criteria) this;
        }

        public Criteria andUinfoIsNotNull() {
            addCriterion("Uinfo is not null");
            return (Criteria) this;
        }

        public Criteria andUinfoEqualTo(String value) {
            addCriterion("Uinfo =", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoNotEqualTo(String value) {
            addCriterion("Uinfo <>", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoGreaterThan(String value) {
            addCriterion("Uinfo >", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoGreaterThanOrEqualTo(String value) {
            addCriterion("Uinfo >=", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoLessThan(String value) {
            addCriterion("Uinfo <", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoLessThanOrEqualTo(String value) {
            addCriterion("Uinfo <=", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoLike(String value) {
            addCriterion("Uinfo like", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoNotLike(String value) {
            addCriterion("Uinfo not like", value, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoIn(List<String> values) {
            addCriterion("Uinfo in", values, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoNotIn(List<String> values) {
            addCriterion("Uinfo not in", values, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoBetween(String value1, String value2) {
            addCriterion("Uinfo between", value1, value2, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUinfoNotBetween(String value1, String value2) {
            addCriterion("Uinfo not between", value1, value2, "uinfo");
            return (Criteria) this;
        }

        public Criteria andUdatetimeIsNull() {
            addCriterion("Udatetime is null");
            return (Criteria) this;
        }

        public Criteria andUdatetimeIsNotNull() {
            addCriterion("Udatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUdatetimeEqualTo(Date value) {
            addCriterion("Udatetime =", value, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeNotEqualTo(Date value) {
            addCriterion("Udatetime <>", value, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeGreaterThan(Date value) {
            addCriterion("Udatetime >", value, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Udatetime >=", value, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeLessThan(Date value) {
            addCriterion("Udatetime <", value, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Udatetime <=", value, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeIn(List<Date> values) {
            addCriterion("Udatetime in", values, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeNotIn(List<Date> values) {
            addCriterion("Udatetime not in", values, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeBetween(Date value1, Date value2) {
            addCriterion("Udatetime between", value1, value2, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Udatetime not between", value1, value2, "udatetime");
            return (Criteria) this;
        }

        public Criteria andUblogIsNull() {
            addCriterion("Ublog is null");
            return (Criteria) this;
        }

        public Criteria andUblogIsNotNull() {
            addCriterion("Ublog is not null");
            return (Criteria) this;
        }

        public Criteria andUblogEqualTo(String value) {
            addCriterion("Ublog =", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogNotEqualTo(String value) {
            addCriterion("Ublog <>", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogGreaterThan(String value) {
            addCriterion("Ublog >", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogGreaterThanOrEqualTo(String value) {
            addCriterion("Ublog >=", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogLessThan(String value) {
            addCriterion("Ublog <", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogLessThanOrEqualTo(String value) {
            addCriterion("Ublog <=", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogLike(String value) {
            addCriterion("Ublog like", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogNotLike(String value) {
            addCriterion("Ublog not like", value, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogIn(List<String> values) {
            addCriterion("Ublog in", values, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogNotIn(List<String> values) {
            addCriterion("Ublog not in", values, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogBetween(String value1, String value2) {
            addCriterion("Ublog between", value1, value2, "ublog");
            return (Criteria) this;
        }

        public Criteria andUblogNotBetween(String value1, String value2) {
            addCriterion("Ublog not between", value1, value2, "ublog");
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