package com.catikco.makepo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LampExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LampExample() {
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

        public Criteria andProductTitleImageFileidIsNull() {
            addCriterion("productTitleImageFileid is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidIsNotNull() {
            addCriterion("productTitleImageFileid is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidEqualTo(Integer value) {
            addCriterion("productTitleImageFileid =", value, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidNotEqualTo(Integer value) {
            addCriterion("productTitleImageFileid <>", value, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidGreaterThan(Integer value) {
            addCriterion("productTitleImageFileid >", value, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productTitleImageFileid >=", value, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidLessThan(Integer value) {
            addCriterion("productTitleImageFileid <", value, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidLessThanOrEqualTo(Integer value) {
            addCriterion("productTitleImageFileid <=", value, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidIn(List<Integer> values) {
            addCriterion("productTitleImageFileid in", values, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidNotIn(List<Integer> values) {
            addCriterion("productTitleImageFileid not in", values, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidBetween(Integer value1, Integer value2) {
            addCriterion("productTitleImageFileid between", value1, value2, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductTitleImageFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("productTitleImageFileid not between", value1, value2, "productTitleImageFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidIsNull() {
            addCriterion("productContentImagesFileid is null");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidIsNotNull() {
            addCriterion("productContentImagesFileid is not null");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidEqualTo(String value) {
            addCriterion("productContentImagesFileid =", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidNotEqualTo(String value) {
            addCriterion("productContentImagesFileid <>", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidGreaterThan(String value) {
            addCriterion("productContentImagesFileid >", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidGreaterThanOrEqualTo(String value) {
            addCriterion("productContentImagesFileid >=", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidLessThan(String value) {
            addCriterion("productContentImagesFileid <", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidLessThanOrEqualTo(String value) {
            addCriterion("productContentImagesFileid <=", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidLike(String value) {
            addCriterion("productContentImagesFileid like", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidNotLike(String value) {
            addCriterion("productContentImagesFileid not like", value, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidIn(List<String> values) {
            addCriterion("productContentImagesFileid in", values, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidNotIn(List<String> values) {
            addCriterion("productContentImagesFileid not in", values, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidBetween(String value1, String value2) {
            addCriterion("productContentImagesFileid between", value1, value2, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andProductContentImagesFileidNotBetween(String value1, String value2) {
            addCriterion("productContentImagesFileid not between", value1, value2, "productContentImagesFileid");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNull() {
            addCriterion("voltage is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("voltage is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(Double value) {
            addCriterion("voltage =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(Double value) {
            addCriterion("voltage <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(Double value) {
            addCriterion("voltage >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(Double value) {
            addCriterion("voltage >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(Double value) {
            addCriterion("voltage <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(Double value) {
            addCriterion("voltage <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<Double> values) {
            addCriterion("voltage in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<Double> values) {
            addCriterion("voltage not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(Double value1, Double value2) {
            addCriterion("voltage between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(Double value1, Double value2) {
            addCriterion("voltage not between", value1, value2, "voltage");
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

        public Criteria andLumenIsNull() {
            addCriterion("lumen is null");
            return (Criteria) this;
        }

        public Criteria andLumenIsNotNull() {
            addCriterion("lumen is not null");
            return (Criteria) this;
        }

        public Criteria andLumenEqualTo(Double value) {
            addCriterion("lumen =", value, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenNotEqualTo(Double value) {
            addCriterion("lumen <>", value, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenGreaterThan(Double value) {
            addCriterion("lumen >", value, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenGreaterThanOrEqualTo(Double value) {
            addCriterion("lumen >=", value, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenLessThan(Double value) {
            addCriterion("lumen <", value, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenLessThanOrEqualTo(Double value) {
            addCriterion("lumen <=", value, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenIn(List<Double> values) {
            addCriterion("lumen in", values, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenNotIn(List<Double> values) {
            addCriterion("lumen not in", values, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenBetween(Double value1, Double value2) {
            addCriterion("lumen between", value1, value2, "lumen");
            return (Criteria) this;
        }

        public Criteria andLumenNotBetween(Double value1, Double value2) {
            addCriterion("lumen not between", value1, value2, "lumen");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIsNull() {
            addCriterion("powerFactor is null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIsNotNull() {
            addCriterion("powerFactor is not null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorEqualTo(String value) {
            addCriterion("powerFactor =", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotEqualTo(String value) {
            addCriterion("powerFactor <>", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorGreaterThan(String value) {
            addCriterion("powerFactor >", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorGreaterThanOrEqualTo(String value) {
            addCriterion("powerFactor >=", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorLessThan(String value) {
            addCriterion("powerFactor <", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorLessThanOrEqualTo(String value) {
            addCriterion("powerFactor <=", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorLike(String value) {
            addCriterion("powerFactor like", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotLike(String value) {
            addCriterion("powerFactor not like", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIn(List<String> values) {
            addCriterion("powerFactor in", values, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotIn(List<String> values) {
            addCriterion("powerFactor not in", values, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBetween(String value1, String value2) {
            addCriterion("powerFactor between", value1, value2, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotBetween(String value1, String value2) {
            addCriterion("powerFactor not between", value1, value2, "powerFactor");
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

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
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

        public Criteria andProductUrlIsNull() {
            addCriterion("productUrl is null");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNotNull() {
            addCriterion("productUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProductUrlEqualTo(String value) {
            addCriterion("productUrl =", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotEqualTo(String value) {
            addCriterion("productUrl <>", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThan(String value) {
            addCriterion("productUrl >", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThanOrEqualTo(String value) {
            addCriterion("productUrl >=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThan(String value) {
            addCriterion("productUrl <", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThanOrEqualTo(String value) {
            addCriterion("productUrl <=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLike(String value) {
            addCriterion("productUrl like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotLike(String value) {
            addCriterion("productUrl not like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlIn(List<String> values) {
            addCriterion("productUrl in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotIn(List<String> values) {
            addCriterion("productUrl not in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlBetween(String value1, String value2) {
            addCriterion("productUrl between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotBetween(String value1, String value2) {
            addCriterion("productUrl not between", value1, value2, "productUrl");
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

        public Criteria andProductCreateTimeIsNull() {
            addCriterion("productCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeIsNotNull() {
            addCriterion("productCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("productCreateTime =", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("productCreateTime <>", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("productCreateTime >", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("productCreateTime >=", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("productCreateTime <", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("productCreateTime <=", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("productCreateTime in", values, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("productCreateTime not in", values, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("productCreateTime between", value1, value2, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("productCreateTime not between", value1, value2, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("productType is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("productType is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Byte value) {
            addCriterion("productType =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Byte value) {
            addCriterion("productType <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Byte value) {
            addCriterion("productType >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("productType >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Byte value) {
            addCriterion("productType <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Byte value) {
            addCriterion("productType <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Byte> values) {
            addCriterion("productType in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Byte> values) {
            addCriterion("productType not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Byte value1, Byte value2) {
            addCriterion("productType between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("productType not between", value1, value2, "productType");
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