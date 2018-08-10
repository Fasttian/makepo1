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

        public Criteria andNewsTitleImageFileidIsNull() {
            addCriterion("newsTitleImageFileid is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidIsNotNull() {
            addCriterion("newsTitleImageFileid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid =", value, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidNotEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid <>", value, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidGreaterThan(Integer value) {
            addCriterion("newsTitleImageFileid >", value, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid >=", value, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidLessThan(Integer value) {
            addCriterion("newsTitleImageFileid <", value, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidLessThanOrEqualTo(Integer value) {
            addCriterion("newsTitleImageFileid <=", value, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidIn(List<Integer> values) {
            addCriterion("newsTitleImageFileid in", values, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidNotIn(List<Integer> values) {
            addCriterion("newsTitleImageFileid not in", values, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidBetween(Integer value1, Integer value2) {
            addCriterion("newsTitleImageFileid between", value1, value2, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleImageFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsTitleImageFileid not between", value1, value2, "newsTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidIsNull() {
            addCriterion("newsContentImagesFileid is null");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidIsNotNull() {
            addCriterion("newsContentImagesFileid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidEqualTo(String value) {
            addCriterion("newsContentImagesFileid =", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidNotEqualTo(String value) {
            addCriterion("newsContentImagesFileid <>", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidGreaterThan(String value) {
            addCriterion("newsContentImagesFileid >", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidGreaterThanOrEqualTo(String value) {
            addCriterion("newsContentImagesFileid >=", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidLessThan(String value) {
            addCriterion("newsContentImagesFileid <", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidLessThanOrEqualTo(String value) {
            addCriterion("newsContentImagesFileid <=", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidLike(String value) {
            addCriterion("newsContentImagesFileid like", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidNotLike(String value) {
            addCriterion("newsContentImagesFileid not like", value, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidIn(List<String> values) {
            addCriterion("newsContentImagesFileid in", values, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidNotIn(List<String> values) {
            addCriterion("newsContentImagesFileid not in", values, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidBetween(String value1, String value2) {
            addCriterion("newsContentImagesFileid between", value1, value2, "newsContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andNewsContentImagesFileidNotBetween(String value1, String value2) {
            addCriterion("newsContentImagesFileid not between", value1, value2, "newsContentImagesFileid");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesIsNull() {
            addCriterion("newsResources is null");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesIsNotNull() {
            addCriterion("newsResources is not null");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesEqualTo(String value) {
            addCriterion("newsResources =", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesNotEqualTo(String value) {
            addCriterion("newsResources <>", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesGreaterThan(String value) {
            addCriterion("newsResources >", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesGreaterThanOrEqualTo(String value) {
            addCriterion("newsResources >=", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesLessThan(String value) {
            addCriterion("newsResources <", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesLessThanOrEqualTo(String value) {
            addCriterion("newsResources <=", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesLike(String value) {
            addCriterion("newsResources like", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesNotLike(String value) {
            addCriterion("newsResources not like", value, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesIn(List<String> values) {
            addCriterion("newsResources in", values, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesNotIn(List<String> values) {
            addCriterion("newsResources not in", values, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesBetween(String value1, String value2) {
            addCriterion("newsResources between", value1, value2, "newsResources");
            return (Criteria) this;
        }

        public Criteria andNewsResourcesNotBetween(String value1, String value2) {
            addCriterion("newsResources not between", value1, value2, "newsResources");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNull() {
            addCriterion("newsUrl is null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNotNull() {
            addCriterion("newsUrl is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlEqualTo(String value) {
            addCriterion("newsUrl =", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotEqualTo(String value) {
            addCriterion("newsUrl <>", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThan(String value) {
            addCriterion("newsUrl >", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("newsUrl >=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThan(String value) {
            addCriterion("newsUrl <", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("newsUrl <=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLike(String value) {
            addCriterion("newsUrl like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotLike(String value) {
            addCriterion("newsUrl not like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIn(List<String> values) {
            addCriterion("newsUrl in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotIn(List<String> values) {
            addCriterion("newsUrl not in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlBetween(String value1, String value2) {
            addCriterion("newsUrl between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotBetween(String value1, String value2) {
            addCriterion("newsUrl not between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeIsNull() {
            addCriterion("newsCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeIsNotNull() {
            addCriterion("newsCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("newsCreateTime =", value, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("newsCreateTime <>", value, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("newsCreateTime >", value, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newsCreateTime >=", value, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("newsCreateTime <", value, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newsCreateTime <=", value, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("newsCreateTime in", values, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("newsCreateTime not in", values, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newsCreateTime between", value1, value2, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newsCreateTime not between", value1, value2, "newsCreateTime");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNull() {
            addCriterion("newsType is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNotNull() {
            addCriterion("newsType is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeEqualTo(Byte value) {
            addCriterion("newsType =", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotEqualTo(Byte value) {
            addCriterion("newsType <>", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThan(Byte value) {
            addCriterion("newsType >", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("newsType >=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThan(Byte value) {
            addCriterion("newsType <", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("newsType <=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIn(List<Byte> values) {
            addCriterion("newsType in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotIn(List<Byte> values) {
            addCriterion("newsType not in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeBetween(Byte value1, Byte value2) {
            addCriterion("newsType between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("newsType not between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeIsNull() {
            addCriterion("upDataTime is null");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeIsNotNull() {
            addCriterion("upDataTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime =", value, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime <>", value, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("upDataTime >", value, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime >=", value, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeLessThan(Date value) {
            addCriterionForJDBCDate("upDataTime <", value, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upDataTime <=", value, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeIn(List<Date> values) {
            addCriterionForJDBCDate("upDataTime in", values, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("upDataTime not in", values, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upDataTime between", value1, value2, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andUpDataTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upDataTime not between", value1, value2, "upDataTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("createBy =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("createBy <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("createBy >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("createBy >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("createBy <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("createBy <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("createBy in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("createBy not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("createBy between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("createBy not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByIsNull() {
            addCriterion("upDataBy is null");
            return (Criteria) this;
        }

        public Criteria andUpDataByIsNotNull() {
            addCriterion("upDataBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpDataByEqualTo(Integer value) {
            addCriterion("upDataBy =", value, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByNotEqualTo(Integer value) {
            addCriterion("upDataBy <>", value, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByGreaterThan(Integer value) {
            addCriterion("upDataBy >", value, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByGreaterThanOrEqualTo(Integer value) {
            addCriterion("upDataBy >=", value, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByLessThan(Integer value) {
            addCriterion("upDataBy <", value, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByLessThanOrEqualTo(Integer value) {
            addCriterion("upDataBy <=", value, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByIn(List<Integer> values) {
            addCriterion("upDataBy in", values, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByNotIn(List<Integer> values) {
            addCriterion("upDataBy not in", values, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByBetween(Integer value1, Integer value2) {
            addCriterion("upDataBy between", value1, value2, "upDataBy");
            return (Criteria) this;
        }

        public Criteria andUpDataByNotBetween(Integer value1, Integer value2) {
            addCriterion("upDataBy not between", value1, value2, "upDataBy");
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