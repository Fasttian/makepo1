package com.catikco.makepo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewstitleimagefileidIsNull() {
            addCriterion("newsTitleImageFileid is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidIsNotNull() {
            addCriterion("newsTitleImageFileid is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid =", value, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidNotEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid <>", value, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidGreaterThan(Integer value) {
            addCriterion("newsTitleImageFileid >", value, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid >=", value, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidLessThan(Integer value) {
            addCriterion("newsTitleImageFileid <", value, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidLessThanOrEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid <=", value, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidIn(List<Integer> values) {
            addCriterion("newsTitleImageFileid in", values, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidNotIn(List<Integer> values) {
            addCriterion("newsTitleImageFileid not in", values, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidBetween(Integer value1, Integer value2) {
            addCriterion("newsTitleImageFileid between", value1, value2, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewstitleimagefileidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsTitleImageFileid not between", value1, value2, "newstitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidIsNull() {
            addCriterion("newsContentImagesFileid is null");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidIsNotNull() {
            addCriterion("newsContentImagesFileid is not null");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidEqualTo(String value) {
            addCriterion("newsContentImagesFileid =", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidNotEqualTo(String value) {
            addCriterion("newsContentImagesFileid <>", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidGreaterThan(String value) {
            addCriterion("newsContentImagesFileid >", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidGreaterThanOrEqualTo(String value) {
            addCriterion("newsContentImagesFileid >=", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidLessThan(String value) {
            addCriterion("newsContentImagesFileid <", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidLessThanOrEqualTo(String value) {
            addCriterion("newsContentImagesFileid <=", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidLike(String value) {
            addCriterion("newsContentImagesFileid like", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidNotLike(String value) {
            addCriterion("newsContentImagesFileid not like", value, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidIn(List<String> values) {
            addCriterion("newsContentImagesFileid in", values, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidNotIn(List<String> values) {
            addCriterion("newsContentImagesFileid not in", values, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidBetween(String value1, String value2) {
            addCriterion("newsContentImagesFileid between", value1, value2, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andNewscontentimagesfileidNotBetween(String value1, String value2) {
            addCriterion("newsContentImagesFileid not between", value1, value2, "newscontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andDecriptionIsNull() {
            addCriterion("decription is null");
            return (Criteria) this;
        }

        public Criteria andDecriptionIsNotNull() {
            addCriterion("decription is not null");
            return (Criteria) this;
        }

        public Criteria andDecriptionEqualTo(String value) {
            addCriterion("decription =", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotEqualTo(String value) {
            addCriterion("decription <>", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionGreaterThan(String value) {
            addCriterion("decription >", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionGreaterThanOrEqualTo(String value) {
            addCriterion("decription >=", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionLessThan(String value) {
            addCriterion("decription <", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionLessThanOrEqualTo(String value) {
            addCriterion("decription <=", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionLike(String value) {
            addCriterion("decription like", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotLike(String value) {
            addCriterion("decription not like", value, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionIn(List<String> values) {
            addCriterion("decription in", values, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotIn(List<String> values) {
            addCriterion("decription not in", values, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionBetween(String value1, String value2) {
            addCriterion("decription between", value1, value2, "decription");
            return (Criteria) this;
        }

        public Criteria andDecriptionNotBetween(String value1, String value2) {
            addCriterion("decription not between", value1, value2, "decription");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesIsNull() {
            addCriterion("newsResources is null");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesIsNotNull() {
            addCriterion("newsResources is not null");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesEqualTo(String value) {
            addCriterion("newsResources =", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesNotEqualTo(String value) {
            addCriterion("newsResources <>", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesGreaterThan(String value) {
            addCriterion("newsResources >", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesGreaterThanOrEqualTo(String value) {
            addCriterion("newsResources >=", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesLessThan(String value) {
            addCriterion("newsResources <", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesLessThanOrEqualTo(String value) {
            addCriterion("newsResources <=", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesLike(String value) {
            addCriterion("newsResources like", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesNotLike(String value) {
            addCriterion("newsResources not like", value, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesIn(List<String> values) {
            addCriterion("newsResources in", values, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesNotIn(List<String> values) {
            addCriterion("newsResources not in", values, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesBetween(String value1, String value2) {
            addCriterion("newsResources between", value1, value2, "newsresources");
            return (Criteria) this;
        }

        public Criteria andNewsresourcesNotBetween(String value1, String value2) {
            addCriterion("newsResources not between", value1, value2, "newsresources");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
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