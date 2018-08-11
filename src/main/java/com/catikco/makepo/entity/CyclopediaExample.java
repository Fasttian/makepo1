package com.catikco.makepo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CyclopediaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CyclopediaExample() {
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

        public Criteria andCyclopediaTitleImageFileidIsNull() {
            addCriterion("cyclopediaTitleImageFileid is null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidIsNotNull() {
            addCriterion("cyclopediaTitleImageFileid is not null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidEqualTo(Integer value) {
            addCriterion("cyclopediaTitleImageFileid =", value, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidNotEqualTo(Integer value) {
            addCriterion("cyclopediaTitleImageFileid <>", value, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidGreaterThan(Integer value) {
            addCriterion("cyclopediaTitleImageFileid >", value, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cyclopediaTitleImageFileid >=", value, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidLessThan(Integer value) {
            addCriterion("cyclopediaTitleImageFileid <", value, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidLessThanOrEqualTo(Integer value) {
            addCriterion("cyclopediaTitleImageFileid <=", value, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidIn(List<Integer> values) {
            addCriterion("cyclopediaTitleImageFileid in", values, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidNotIn(List<Integer> values) {
            addCriterion("cyclopediaTitleImageFileid not in", values, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidBetween(Integer value1, Integer value2) {
            addCriterion("cyclopediaTitleImageFileid between", value1, value2, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTitleImageFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("cyclopediaTitleImageFileid not between", value1, value2, "cyclopediaTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidIsNull() {
            addCriterion("cyclopediaContentImagesFileid is null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidIsNotNull() {
            addCriterion("cyclopediaContentImagesFileid is not null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidEqualTo(String value) {
            addCriterion("cyclopediaContentImagesFileid =", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidNotEqualTo(String value) {
            addCriterion("cyclopediaContentImagesFileid <>", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidGreaterThan(String value) {
            addCriterion("cyclopediaContentImagesFileid >", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidGreaterThanOrEqualTo(String value) {
            addCriterion("cyclopediaContentImagesFileid >=", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidLessThan(String value) {
            addCriterion("cyclopediaContentImagesFileid <", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidLessThanOrEqualTo(String value) {
            addCriterion("cyclopediaContentImagesFileid <=", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidLike(String value) {
            addCriterion("cyclopediaContentImagesFileid like", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidNotLike(String value) {
            addCriterion("cyclopediaContentImagesFileid not like", value, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidIn(List<String> values) {
            addCriterion("cyclopediaContentImagesFileid in", values, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidNotIn(List<String> values) {
            addCriterion("cyclopediaContentImagesFileid not in", values, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidBetween(String value1, String value2) {
            addCriterion("cyclopediaContentImagesFileid between", value1, value2, "cyclopediaContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andCyclopediaContentImagesFileidNotBetween(String value1, String value2) {
            addCriterion("cyclopediaContentImagesFileid not between", value1, value2, "cyclopediaContentImagesFileid");
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

        public Criteria andCyclopediaResourcesIsNull() {
            addCriterion("cyclopediaResources is null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesIsNotNull() {
            addCriterion("cyclopediaResources is not null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesEqualTo(String value) {
            addCriterion("cyclopediaResources =", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesNotEqualTo(String value) {
            addCriterion("cyclopediaResources <>", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesGreaterThan(String value) {
            addCriterion("cyclopediaResources >", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesGreaterThanOrEqualTo(String value) {
            addCriterion("cyclopediaResources >=", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesLessThan(String value) {
            addCriterion("cyclopediaResources <", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesLessThanOrEqualTo(String value) {
            addCriterion("cyclopediaResources <=", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesLike(String value) {
            addCriterion("cyclopediaResources like", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesNotLike(String value) {
            addCriterion("cyclopediaResources not like", value, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesIn(List<String> values) {
            addCriterion("cyclopediaResources in", values, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesNotIn(List<String> values) {
            addCriterion("cyclopediaResources not in", values, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesBetween(String value1, String value2) {
            addCriterion("cyclopediaResources between", value1, value2, "cyclopediaResources");
            return (Criteria) this;
        }

        public Criteria andCyclopediaResourcesNotBetween(String value1, String value2) {
            addCriterion("cyclopediaResources not between", value1, value2, "cyclopediaResources");
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

        public Criteria andCyclopediaUrlIsNull() {
            addCriterion("cyclopediaUrl is null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlIsNotNull() {
            addCriterion("cyclopediaUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlEqualTo(String value) {
            addCriterion("cyclopediaUrl =", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlNotEqualTo(String value) {
            addCriterion("cyclopediaUrl <>", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlGreaterThan(String value) {
            addCriterion("cyclopediaUrl >", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cyclopediaUrl >=", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlLessThan(String value) {
            addCriterion("cyclopediaUrl <", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlLessThanOrEqualTo(String value) {
            addCriterion("cyclopediaUrl <=", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlLike(String value) {
            addCriterion("cyclopediaUrl like", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlNotLike(String value) {
            addCriterion("cyclopediaUrl not like", value, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlIn(List<String> values) {
            addCriterion("cyclopediaUrl in", values, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlNotIn(List<String> values) {
            addCriterion("cyclopediaUrl not in", values, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlBetween(String value1, String value2) {
            addCriterion("cyclopediaUrl between", value1, value2, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaUrlNotBetween(String value1, String value2) {
            addCriterion("cyclopediaUrl not between", value1, value2, "cyclopediaUrl");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeIsNull() {
            addCriterion("cyclopediaCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeIsNotNull() {
            addCriterion("cyclopediaCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("cyclopediaCreateTime =", value, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cyclopediaCreateTime <>", value, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cyclopediaCreateTime >", value, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cyclopediaCreateTime >=", value, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("cyclopediaCreateTime <", value, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cyclopediaCreateTime <=", value, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("cyclopediaCreateTime in", values, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cyclopediaCreateTime not in", values, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cyclopediaCreateTime between", value1, value2, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cyclopediaCreateTime not between", value1, value2, "cyclopediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeIsNull() {
            addCriterion("cyclopediaType is null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeIsNotNull() {
            addCriterion("cyclopediaType is not null");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeEqualTo(Byte value) {
            addCriterion("cyclopediaType =", value, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeNotEqualTo(Byte value) {
            addCriterion("cyclopediaType <>", value, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeGreaterThan(Byte value) {
            addCriterion("cyclopediaType >", value, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("cyclopediaType >=", value, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeLessThan(Byte value) {
            addCriterion("cyclopediaType <", value, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeLessThanOrEqualTo(Byte value) {
            addCriterion("cyclopediaType <=", value, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeIn(List<Byte> values) {
            addCriterion("cyclopediaType in", values, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeNotIn(List<Byte> values) {
            addCriterion("cyclopediaType not in", values, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeBetween(Byte value1, Byte value2) {
            addCriterion("cyclopediaType between", value1, value2, "cyclopediaType");
            return (Criteria) this;
        }

        public Criteria andCyclopediaTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("cyclopediaType not between", value1, value2, "cyclopediaType");
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