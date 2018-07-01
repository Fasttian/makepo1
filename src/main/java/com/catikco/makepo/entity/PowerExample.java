package com.catikco.makepo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerExample() {
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

        public Criteria andProducttitleimagefileidIsNull() {
            addCriterion("productTitleImageFileid is null");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidIsNotNull() {
            addCriterion("productTitleImageFileid is not null");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidEqualTo(Integer value) {
            addCriterion("productTitleImageFileid =", value, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidNotEqualTo(Integer value) {
            addCriterion("productTitleImageFileid <>", value, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidGreaterThan(Integer value) {
            addCriterion("productTitleImageFileid >", value, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productTitleImageFileid >=", value, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidLessThan(Integer value) {
            addCriterion("productTitleImageFileid <", value, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidLessThanOrEqualTo(Integer value) {
            addCriterion("productTitleImageFileid <=", value, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidIn(List<Integer> values) {
            addCriterion("productTitleImageFileid in", values, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidNotIn(List<Integer> values) {
            addCriterion("productTitleImageFileid not in", values, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidBetween(Integer value1, Integer value2) {
            addCriterion("productTitleImageFileid between", value1, value2, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProducttitleimagefileidNotBetween(Integer value1, Integer value2) {
            addCriterion("productTitleImageFileid not between", value1, value2, "producttitleimagefileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidIsNull() {
            addCriterion("productContentImagesFileid is null");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidIsNotNull() {
            addCriterion("productContentImagesFileid is not null");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidEqualTo(String value) {
            addCriterion("productContentImagesFileid =", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidNotEqualTo(String value) {
            addCriterion("productContentImagesFileid <>", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidGreaterThan(String value) {
            addCriterion("productContentImagesFileid >", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidGreaterThanOrEqualTo(String value) {
            addCriterion("productContentImagesFileid >=", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidLessThan(String value) {
            addCriterion("productContentImagesFileid <", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidLessThanOrEqualTo(String value) {
            addCriterion("productContentImagesFileid <=", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidLike(String value) {
            addCriterion("productContentImagesFileid like", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidNotLike(String value) {
            addCriterion("productContentImagesFileid not like", value, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidIn(List<String> values) {
            addCriterion("productContentImagesFileid in", values, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidNotIn(List<String> values) {
            addCriterion("productContentImagesFileid not in", values, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidBetween(String value1, String value2) {
            addCriterion("productContentImagesFileid between", value1, value2, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andProductcontentimagesfileidNotBetween(String value1, String value2) {
            addCriterion("productContentImagesFileid not between", value1, value2, "productcontentimagesfileid");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Double value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Double value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Double value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Double value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Double value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Double value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Double> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Double> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Double value1, Double value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Double value1, Double value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andInputIsNull() {
            addCriterion("input is null");
            return (Criteria) this;
        }

        public Criteria andInputIsNotNull() {
            addCriterion("input is not null");
            return (Criteria) this;
        }

        public Criteria andInputEqualTo(Double value) {
            addCriterion("input =", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputNotEqualTo(Double value) {
            addCriterion("input <>", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputGreaterThan(Double value) {
            addCriterion("input >", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputGreaterThanOrEqualTo(Double value) {
            addCriterion("input >=", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputLessThan(Double value) {
            addCriterion("input <", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputLessThanOrEqualTo(Double value) {
            addCriterion("input <=", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputIn(List<Double> values) {
            addCriterion("input in", values, "input");
            return (Criteria) this;
        }

        public Criteria andInputNotIn(List<Double> values) {
            addCriterion("input not in", values, "input");
            return (Criteria) this;
        }

        public Criteria andInputBetween(Double value1, Double value2) {
            addCriterion("input between", value1, value2, "input");
            return (Criteria) this;
        }

        public Criteria andInputNotBetween(Double value1, Double value2) {
            addCriterion("input not between", value1, value2, "input");
            return (Criteria) this;
        }

        public Criteria andOutputIsNull() {
            addCriterion("output is null");
            return (Criteria) this;
        }

        public Criteria andOutputIsNotNull() {
            addCriterion("output is not null");
            return (Criteria) this;
        }

        public Criteria andOutputEqualTo(Double value) {
            addCriterion("output =", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotEqualTo(Double value) {
            addCriterion("output <>", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThan(Double value) {
            addCriterion("output >", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThanOrEqualTo(Double value) {
            addCriterion("output >=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThan(Double value) {
            addCriterion("output <", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThanOrEqualTo(Double value) {
            addCriterion("output <=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputIn(List<Double> values) {
            addCriterion("output in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotIn(List<Double> values) {
            addCriterion("output not in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputBetween(Double value1, Double value2) {
            addCriterion("output between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotBetween(Double value1, Double value2) {
            addCriterion("output not between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
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