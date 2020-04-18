package com.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventExample() {
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

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2020-04-17
     */
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

        public Criteria andInvent_nameIsNull() {
            addCriterion("invent_name is null");
            return (Criteria) this;
        }

        public Criteria andInvent_nameIsNotNull() {
            addCriterion("invent_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvent_nameEqualTo(String value) {
            addCriterion("invent_name =", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameNotEqualTo(String value) {
            addCriterion("invent_name <>", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameGreaterThan(String value) {
            addCriterion("invent_name >", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameGreaterThanOrEqualTo(String value) {
            addCriterion("invent_name >=", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameLessThan(String value) {
            addCriterion("invent_name <", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameLessThanOrEqualTo(String value) {
            addCriterion("invent_name <=", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameLike(String value) {
            addCriterion("invent_name like", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameNotLike(String value) {
            addCriterion("invent_name not like", value, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameIn(List<String> values) {
            addCriterion("invent_name in", values, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameNotIn(List<String> values) {
            addCriterion("invent_name not in", values, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameBetween(String value1, String value2) {
            addCriterion("invent_name between", value1, value2, "invent_name");
            return (Criteria) this;
        }

        public Criteria andInvent_nameNotBetween(String value1, String value2) {
            addCriterion("invent_name not between", value1, value2, "invent_name");
            return (Criteria) this;
        }

        public Criteria andCate_typeIsNull() {
            addCriterion("cate_type is null");
            return (Criteria) this;
        }

        public Criteria andCate_typeIsNotNull() {
            addCriterion("cate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCate_typeEqualTo(String value) {
            addCriterion("cate_type =", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeNotEqualTo(String value) {
            addCriterion("cate_type <>", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeGreaterThan(String value) {
            addCriterion("cate_type >", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeGreaterThanOrEqualTo(String value) {
            addCriterion("cate_type >=", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeLessThan(String value) {
            addCriterion("cate_type <", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeLessThanOrEqualTo(String value) {
            addCriterion("cate_type <=", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeLike(String value) {
            addCriterion("cate_type like", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeNotLike(String value) {
            addCriterion("cate_type not like", value, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeIn(List<String> values) {
            addCriterion("cate_type in", values, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeNotIn(List<String> values) {
            addCriterion("cate_type not in", values, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeBetween(String value1, String value2) {
            addCriterion("cate_type between", value1, value2, "cate_type");
            return (Criteria) this;
        }

        public Criteria andCate_typeNotBetween(String value1, String value2) {
            addCriterion("cate_type not between", value1, value2, "cate_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeIsNull() {
            addCriterion("area_type is null");
            return (Criteria) this;
        }

        public Criteria andArea_typeIsNotNull() {
            addCriterion("area_type is not null");
            return (Criteria) this;
        }

        public Criteria andArea_typeEqualTo(String value) {
            addCriterion("area_type =", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotEqualTo(String value) {
            addCriterion("area_type <>", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeGreaterThan(String value) {
            addCriterion("area_type >", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeGreaterThanOrEqualTo(String value) {
            addCriterion("area_type >=", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeLessThan(String value) {
            addCriterion("area_type <", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeLessThanOrEqualTo(String value) {
            addCriterion("area_type <=", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeLike(String value) {
            addCriterion("area_type like", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotLike(String value) {
            addCriterion("area_type not like", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeIn(List<String> values) {
            addCriterion("area_type in", values, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotIn(List<String> values) {
            addCriterion("area_type not in", values, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeBetween(String value1, String value2) {
            addCriterion("area_type between", value1, value2, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotBetween(String value1, String value2) {
            addCriterion("area_type not between", value1, value2, "area_type");
            return (Criteria) this;
        }

        public Criteria andApply_menIsNull() {
            addCriterion("apply_men is null");
            return (Criteria) this;
        }

        public Criteria andApply_menIsNotNull() {
            addCriterion("apply_men is not null");
            return (Criteria) this;
        }

        public Criteria andApply_menEqualTo(String value) {
            addCriterion("apply_men =", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menNotEqualTo(String value) {
            addCriterion("apply_men <>", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menGreaterThan(String value) {
            addCriterion("apply_men >", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menGreaterThanOrEqualTo(String value) {
            addCriterion("apply_men >=", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menLessThan(String value) {
            addCriterion("apply_men <", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menLessThanOrEqualTo(String value) {
            addCriterion("apply_men <=", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menLike(String value) {
            addCriterion("apply_men like", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menNotLike(String value) {
            addCriterion("apply_men not like", value, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menIn(List<String> values) {
            addCriterion("apply_men in", values, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menNotIn(List<String> values) {
            addCriterion("apply_men not in", values, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menBetween(String value1, String value2) {
            addCriterion("apply_men between", value1, value2, "apply_men");
            return (Criteria) this;
        }

        public Criteria andApply_menNotBetween(String value1, String value2) {
            addCriterion("apply_men not between", value1, value2, "apply_men");
            return (Criteria) this;
        }

        public Criteria andCard_noIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCard_noIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCard_noEqualTo(String value) {
            addCriterion("card_no =", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotEqualTo(String value) {
            addCriterion("card_no <>", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noGreaterThan(String value) {
            addCriterion("card_no >", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noLessThan(String value) {
            addCriterion("card_no <", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noLike(String value) {
            addCriterion("card_no like", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotLike(String value) {
            addCriterion("card_no not like", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noIn(List<String> values) {
            addCriterion("card_no in", values, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotIn(List<String> values) {
            addCriterion("card_no not in", values, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "card_no");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrIsNull() {
            addCriterion("acc_nbr is null");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrIsNotNull() {
            addCriterion("acc_nbr is not null");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrEqualTo(String value) {
            addCriterion("acc_nbr =", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrNotEqualTo(String value) {
            addCriterion("acc_nbr <>", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrGreaterThan(String value) {
            addCriterion("acc_nbr >", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrGreaterThanOrEqualTo(String value) {
            addCriterion("acc_nbr >=", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrLessThan(String value) {
            addCriterion("acc_nbr <", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrLessThanOrEqualTo(String value) {
            addCriterion("acc_nbr <=", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrLike(String value) {
            addCriterion("acc_nbr like", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrNotLike(String value) {
            addCriterion("acc_nbr not like", value, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrIn(List<String> values) {
            addCriterion("acc_nbr in", values, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrNotIn(List<String> values) {
            addCriterion("acc_nbr not in", values, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrBetween(String value1, String value2) {
            addCriterion("acc_nbr between", value1, value2, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAcc_nbrNotBetween(String value1, String value2) {
            addCriterion("acc_nbr not between", value1, value2, "acc_nbr");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("adress is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("adress is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("adress =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("adress <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("adress >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("adress >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("adress <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("adress <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("adress like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("adress not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("adress in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("adress not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("adress between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("adress not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andInvent_desIsNull() {
            addCriterion("invent_des is null");
            return (Criteria) this;
        }

        public Criteria andInvent_desIsNotNull() {
            addCriterion("invent_des is not null");
            return (Criteria) this;
        }

        public Criteria andInvent_desEqualTo(String value) {
            addCriterion("invent_des =", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desNotEqualTo(String value) {
            addCriterion("invent_des <>", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desGreaterThan(String value) {
            addCriterion("invent_des >", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desGreaterThanOrEqualTo(String value) {
            addCriterion("invent_des >=", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desLessThan(String value) {
            addCriterion("invent_des <", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desLessThanOrEqualTo(String value) {
            addCriterion("invent_des <=", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desLike(String value) {
            addCriterion("invent_des like", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desNotLike(String value) {
            addCriterion("invent_des not like", value, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desIn(List<String> values) {
            addCriterion("invent_des in", values, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desNotIn(List<String> values) {
            addCriterion("invent_des not in", values, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desBetween(String value1, String value2) {
            addCriterion("invent_des between", value1, value2, "invent_des");
            return (Criteria) this;
        }

        public Criteria andInvent_desNotBetween(String value1, String value2) {
            addCriterion("invent_des not between", value1, value2, "invent_des");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(String value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(String value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(String value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(String value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(String value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(String value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(String value) {
            addCriterion("attach like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(String value) {
            addCriterion("attach not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<String> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<String> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(String value1, String value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(String value1, String value2) {
            addCriterion("attach not between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateIsNull() {
            addCriterion("verify_date is null");
            return (Criteria) this;
        }

        public Criteria andVerify_dateIsNotNull() {
            addCriterion("verify_date is not null");
            return (Criteria) this;
        }

        public Criteria andVerify_dateEqualTo(Date value) {
            addCriterion("verify_date =", value, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateNotEqualTo(Date value) {
            addCriterion("verify_date <>", value, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateGreaterThan(Date value) {
            addCriterion("verify_date >", value, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_date >=", value, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateLessThan(Date value) {
            addCriterion("verify_date <", value, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateLessThanOrEqualTo(Date value) {
            addCriterion("verify_date <=", value, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateIn(List<Date> values) {
            addCriterion("verify_date in", values, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateNotIn(List<Date> values) {
            addCriterion("verify_date not in", values, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateBetween(Date value1, Date value2) {
            addCriterion("verify_date between", value1, value2, "verify_date");
            return (Criteria) this;
        }

        public Criteria andVerify_dateNotBetween(Date value1, Date value2) {
            addCriterion("verify_date not between", value1, value2, "verify_date");
            return (Criteria) this;
        }

        public Criteria andStatus_cdIsNull() {
            addCriterion("status_cd is null");
            return (Criteria) this;
        }

        public Criteria andStatus_cdIsNotNull() {
            addCriterion("status_cd is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_cdEqualTo(String value) {
            addCriterion("status_cd =", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdNotEqualTo(String value) {
            addCriterion("status_cd <>", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdGreaterThan(String value) {
            addCriterion("status_cd >", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdGreaterThanOrEqualTo(String value) {
            addCriterion("status_cd >=", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdLessThan(String value) {
            addCriterion("status_cd <", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdLessThanOrEqualTo(String value) {
            addCriterion("status_cd <=", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdLike(String value) {
            addCriterion("status_cd like", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdNotLike(String value) {
            addCriterion("status_cd not like", value, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdIn(List<String> values) {
            addCriterion("status_cd in", values, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdNotIn(List<String> values) {
            addCriterion("status_cd not in", values, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdBetween(String value1, String value2) {
            addCriterion("status_cd between", value1, value2, "status_cd");
            return (Criteria) this;
        }

        public Criteria andStatus_cdNotBetween(String value1, String value2) {
            addCriterion("status_cd not between", value1, value2, "status_cd");
            return (Criteria) this;
        }

        public Criteria andBak1IsNull() {
            addCriterion("bak1 is null");
            return (Criteria) this;
        }

        public Criteria andBak1IsNotNull() {
            addCriterion("bak1 is not null");
            return (Criteria) this;
        }

        public Criteria andBak1EqualTo(String value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(String value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(String value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(String value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(String value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(String value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Like(String value) {
            addCriterion("bak1 like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotLike(String value) {
            addCriterion("bak1 not like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<String> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<String> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(String value1, String value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(String value1, String value2) {
            addCriterion("bak1 not between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak2IsNull() {
            addCriterion("bak2 is null");
            return (Criteria) this;
        }

        public Criteria andBak2IsNotNull() {
            addCriterion("bak2 is not null");
            return (Criteria) this;
        }

        public Criteria andBak2EqualTo(String value) {
            addCriterion("bak2 =", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotEqualTo(String value) {
            addCriterion("bak2 <>", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThan(String value) {
            addCriterion("bak2 >", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThanOrEqualTo(String value) {
            addCriterion("bak2 >=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThan(String value) {
            addCriterion("bak2 <", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThanOrEqualTo(String value) {
            addCriterion("bak2 <=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Like(String value) {
            addCriterion("bak2 like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotLike(String value) {
            addCriterion("bak2 not like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2In(List<String> values) {
            addCriterion("bak2 in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotIn(List<String> values) {
            addCriterion("bak2 not in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Between(String value1, String value2) {
            addCriterion("bak2 between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotBetween(String value1, String value2) {
            addCriterion("bak2 not between", value1, value2, "bak2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2020-04-17
     */
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