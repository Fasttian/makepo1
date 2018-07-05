package com.catikco.makepo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FilestorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilestorageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("fileSize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("fileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Long value) {
            addCriterion("fileSize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Long value) {
            addCriterion("fileSize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Long value) {
            addCriterion("fileSize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Long value) {
            addCriterion("fileSize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Long value) {
            addCriterion("fileSize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Long value) {
            addCriterion("fileSize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Long> values) {
            addCriterion("fileSize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Long> values) {
            addCriterion("fileSize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Long value1, Long value2) {
            addCriterion("fileSize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Long value1, Long value2) {
            addCriterion("fileSize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFileprefixIsNull() {
            addCriterion("filePrefix is null");
            return (Criteria) this;
        }

        public Criteria andFileprefixIsNotNull() {
            addCriterion("filePrefix is not null");
            return (Criteria) this;
        }

        public Criteria andFileprefixEqualTo(String value) {
            addCriterion("filePrefix =", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixNotEqualTo(String value) {
            addCriterion("filePrefix <>", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixGreaterThan(String value) {
            addCriterion("filePrefix >", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixGreaterThanOrEqualTo(String value) {
            addCriterion("filePrefix >=", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixLessThan(String value) {
            addCriterion("filePrefix <", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixLessThanOrEqualTo(String value) {
            addCriterion("filePrefix <=", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixLike(String value) {
            addCriterion("filePrefix like", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixNotLike(String value) {
            addCriterion("filePrefix not like", value, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixIn(List<String> values) {
            addCriterion("filePrefix in", values, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixNotIn(List<String> values) {
            addCriterion("filePrefix not in", values, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixBetween(String value1, String value2) {
            addCriterion("filePrefix between", value1, value2, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFileprefixNotBetween(String value1, String value2) {
            addCriterion("filePrefix not between", value1, value2, "fileprefix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixIsNull() {
            addCriterion("fileSuffix is null");
            return (Criteria) this;
        }

        public Criteria andFilesuffixIsNotNull() {
            addCriterion("fileSuffix is not null");
            return (Criteria) this;
        }

        public Criteria andFilesuffixEqualTo(String value) {
            addCriterion("fileSuffix =", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotEqualTo(String value) {
            addCriterion("fileSuffix <>", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixGreaterThan(String value) {
            addCriterion("fileSuffix >", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixGreaterThanOrEqualTo(String value) {
            addCriterion("fileSuffix >=", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixLessThan(String value) {
            addCriterion("fileSuffix <", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixLessThanOrEqualTo(String value) {
            addCriterion("fileSuffix <=", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixLike(String value) {
            addCriterion("fileSuffix like", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotLike(String value) {
            addCriterion("fileSuffix not like", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixIn(List<String> values) {
            addCriterion("fileSuffix in", values, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotIn(List<String> values) {
            addCriterion("fileSuffix not in", values, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixBetween(String value1, String value2) {
            addCriterion("fileSuffix between", value1, value2, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotBetween(String value1, String value2) {
            addCriterion("fileSuffix not between", value1, value2, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFiledescIsNull() {
            addCriterion("fileDesc is null");
            return (Criteria) this;
        }

        public Criteria andFiledescIsNotNull() {
            addCriterion("fileDesc is not null");
            return (Criteria) this;
        }

        public Criteria andFiledescEqualTo(String value) {
            addCriterion("fileDesc =", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescNotEqualTo(String value) {
            addCriterion("fileDesc <>", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescGreaterThan(String value) {
            addCriterion("fileDesc >", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescGreaterThanOrEqualTo(String value) {
            addCriterion("fileDesc >=", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescLessThan(String value) {
            addCriterion("fileDesc <", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescLessThanOrEqualTo(String value) {
            addCriterion("fileDesc <=", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescLike(String value) {
            addCriterion("fileDesc like", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescNotLike(String value) {
            addCriterion("fileDesc not like", value, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescIn(List<String> values) {
            addCriterion("fileDesc in", values, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescNotIn(List<String> values) {
            addCriterion("fileDesc not in", values, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescBetween(String value1, String value2) {
            addCriterion("fileDesc between", value1, value2, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFiledescNotBetween(String value1, String value2) {
            addCriterion("fileDesc not between", value1, value2, "filedesc");
            return (Criteria) this;
        }

        public Criteria andFilestatusIsNull() {
            addCriterion("fileStatus is null");
            return (Criteria) this;
        }

        public Criteria andFilestatusIsNotNull() {
            addCriterion("fileStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFilestatusEqualTo(String value) {
            addCriterion("fileStatus =", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotEqualTo(String value) {
            addCriterion("fileStatus <>", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusGreaterThan(String value) {
            addCriterion("fileStatus >", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusGreaterThanOrEqualTo(String value) {
            addCriterion("fileStatus >=", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusLessThan(String value) {
            addCriterion("fileStatus <", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusLessThanOrEqualTo(String value) {
            addCriterion("fileStatus <=", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusLike(String value) {
            addCriterion("fileStatus like", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotLike(String value) {
            addCriterion("fileStatus not like", value, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusIn(List<String> values) {
            addCriterion("fileStatus in", values, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotIn(List<String> values) {
            addCriterion("fileStatus not in", values, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusBetween(String value1, String value2) {
            addCriterion("fileStatus between", value1, value2, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilestatusNotBetween(String value1, String value2) {
            addCriterion("fileStatus not between", value1, value2, "filestatus");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filePath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filePath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filePath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filePath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filePath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filePath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filePath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filePath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filePath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filePath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filePath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filePath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filePath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andCretetimeIsNull() {
            addCriterion("creteTime is null");
            return (Criteria) this;
        }

        public Criteria andCretetimeIsNotNull() {
            addCriterion("creteTime is not null");
            return (Criteria) this;
        }

        public Criteria andCretetimeEqualTo(Date value) {
            addCriterionForJDBCDate("creteTime =", value, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creteTime <>", value, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creteTime >", value, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creteTime >=", value, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeLessThan(Date value) {
            addCriterionForJDBCDate("creteTime <", value, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creteTime <=", value, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeIn(List<Date> values) {
            addCriterionForJDBCDate("creteTime in", values, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creteTime not in", values, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creteTime between", value1, value2, "cretetime");
            return (Criteria) this;
        }

        public Criteria andCretetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creteTime not between", value1, value2, "cretetime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeIsNull() {
            addCriterion("upDataTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeIsNotNull() {
            addCriterion("upDataTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime =", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime <>", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeGreaterThan(Date value) {
            addCriterionForJDBCDate("upDataTime >", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime >=", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeLessThan(Date value) {
            addCriterionForJDBCDate("upDataTime <", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime <=", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeIn(List<Date> values) {
            addCriterionForJDBCDate("upDataTime in", values, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("upDataTime not in", values, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upDataTime between", value1, value2, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upDataTime not between", value1, value2, "updatatime");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(Integer value) {
            addCriterion("createBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(Integer value) {
            addCriterion("createBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(Integer value) {
            addCriterion("createBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(Integer value) {
            addCriterion("createBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(Integer value) {
            addCriterion("createBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(Integer value) {
            addCriterion("createBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<Integer> values) {
            addCriterion("createBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<Integer> values) {
            addCriterion("createBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(Integer value1, Integer value2) {
            addCriterion("createBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(Integer value1, Integer value2) {
            addCriterion("createBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyIsNull() {
            addCriterion("upDataBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatabyIsNotNull() {
            addCriterion("upDataBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatabyEqualTo(Integer value) {
            addCriterion("upDataBy =", value, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyNotEqualTo(Integer value) {
            addCriterion("upDataBy <>", value, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyGreaterThan(Integer value) {
            addCriterion("upDataBy >", value, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyGreaterThanOrEqualTo(Integer value) {
            addCriterion("upDataBy >=", value, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyLessThan(Integer value) {
            addCriterion("upDataBy <", value, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyLessThanOrEqualTo(Integer value) {
            addCriterion("upDataBy <=", value, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyIn(List<Integer> values) {
            addCriterion("upDataBy in", values, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyNotIn(List<Integer> values) {
            addCriterion("upDataBy not in", values, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyBetween(Integer value1, Integer value2) {
            addCriterion("upDataBy between", value1, value2, "updataby");
            return (Criteria) this;
        }

        public Criteria andUpdatabyNotBetween(Integer value1, Integer value2) {
            addCriterion("upDataBy not between", value1, value2, "updataby");
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

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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