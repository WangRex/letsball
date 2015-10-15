package com.letsball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TTeamFootballExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public TTeamFootballExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
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

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("TEAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("TEAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("TEAM_NAME =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("TEAM_NAME <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("TEAM_NAME >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("TEAM_NAME <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("TEAM_NAME like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("TEAM_NAME not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("TEAM_NAME in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("TEAM_NAME not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("TEAM_NAME between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("TEAM_NAME not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamCityIsNull() {
            addCriterion("TEAM_CITY is null");
            return (Criteria) this;
        }

        public Criteria andTeamCityIsNotNull() {
            addCriterion("TEAM_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCityEqualTo(String value) {
            addCriterion("TEAM_CITY =", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityNotEqualTo(String value) {
            addCriterion("TEAM_CITY <>", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityGreaterThan(String value) {
            addCriterion("TEAM_CITY >", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_CITY >=", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityLessThan(String value) {
            addCriterion("TEAM_CITY <", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityLessThanOrEqualTo(String value) {
            addCriterion("TEAM_CITY <=", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityLike(String value) {
            addCriterion("TEAM_CITY like", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityNotLike(String value) {
            addCriterion("TEAM_CITY not like", value, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityIn(List<String> values) {
            addCriterion("TEAM_CITY in", values, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityNotIn(List<String> values) {
            addCriterion("TEAM_CITY not in", values, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityBetween(String value1, String value2) {
            addCriterion("TEAM_CITY between", value1, value2, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCityNotBetween(String value1, String value2) {
            addCriterion("TEAM_CITY not between", value1, value2, "teamCity");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateIsNull() {
            addCriterion("TEAM_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateIsNotNull() {
            addCriterion("TEAM_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE =", value, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE <>", value, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE >", value, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE >=", value, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE <", value, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE <=", value, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE in", values, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE not in", values, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE between", value1, value2, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEAM_CREATE_DATE not between", value1, value2, "teamCreateDate");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainIsNull() {
            addCriterion("TEAM_CAPTAIN is null");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainIsNotNull() {
            addCriterion("TEAM_CAPTAIN is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainEqualTo(Integer value) {
            addCriterion("TEAM_CAPTAIN =", value, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainNotEqualTo(Integer value) {
            addCriterion("TEAM_CAPTAIN <>", value, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainGreaterThan(Integer value) {
            addCriterion("TEAM_CAPTAIN >", value, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEAM_CAPTAIN >=", value, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainLessThan(Integer value) {
            addCriterion("TEAM_CAPTAIN <", value, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainLessThanOrEqualTo(Integer value) {
            addCriterion("TEAM_CAPTAIN <=", value, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainIn(List<Integer> values) {
            addCriterion("TEAM_CAPTAIN in", values, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainNotIn(List<Integer> values) {
            addCriterion("TEAM_CAPTAIN not in", values, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_CAPTAIN between", value1, value2, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamCaptainNotBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_CAPTAIN not between", value1, value2, "teamCaptain");
            return (Criteria) this;
        }

        public Criteria andTeamPointsIsNull() {
            addCriterion("TEAM_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andTeamPointsIsNotNull() {
            addCriterion("TEAM_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andTeamPointsEqualTo(Integer value) {
            addCriterion("TEAM_POINTS =", value, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsNotEqualTo(Integer value) {
            addCriterion("TEAM_POINTS <>", value, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsGreaterThan(Integer value) {
            addCriterion("TEAM_POINTS >", value, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEAM_POINTS >=", value, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsLessThan(Integer value) {
            addCriterion("TEAM_POINTS <", value, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsLessThanOrEqualTo(Integer value) {
            addCriterion("TEAM_POINTS <=", value, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsIn(List<Integer> values) {
            addCriterion("TEAM_POINTS in", values, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsNotIn(List<Integer> values) {
            addCriterion("TEAM_POINTS not in", values, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_POINTS between", value1, value2, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andTeamPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_POINTS not between", value1, value2, "teamPoints");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInputNameIsNull() {
            addCriterion("INPUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInputNameIsNotNull() {
            addCriterion("INPUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInputNameEqualTo(String value) {
            addCriterion("INPUT_NAME =", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotEqualTo(String value) {
            addCriterion("INPUT_NAME <>", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameGreaterThan(String value) {
            addCriterion("INPUT_NAME >", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_NAME >=", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLessThan(String value) {
            addCriterion("INPUT_NAME <", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLessThanOrEqualTo(String value) {
            addCriterion("INPUT_NAME <=", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLike(String value) {
            addCriterion("INPUT_NAME like", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotLike(String value) {
            addCriterion("INPUT_NAME not like", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameIn(List<String> values) {
            addCriterion("INPUT_NAME in", values, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotIn(List<String> values) {
            addCriterion("INPUT_NAME not in", values, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameBetween(String value1, String value2) {
            addCriterion("INPUT_NAME between", value1, value2, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotBetween(String value1, String value2) {
            addCriterion("INPUT_NAME not between", value1, value2, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("INPUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("INPUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterionForJDBCDate("INPUT_DATE >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterionForJDBCDate("INPUT_DATE <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterionForJDBCDate("INPUT_DATE in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("INPUT_DATE not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPUT_DATE between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPUT_DATE not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("UPDATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("UPDATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("UPDATE_NAME =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("UPDATE_NAME <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("UPDATE_NAME >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAME >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("UPDATE_NAME <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAME <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("UPDATE_NAME like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("UPDATE_NAME not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("UPDATE_NAME in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("UPDATE_NAME not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("UPDATE_NAME between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NAME not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDelsignIsNull() {
            addCriterion("DELSIGN is null");
            return (Criteria) this;
        }

        public Criteria andDelsignIsNotNull() {
            addCriterion("DELSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andDelsignEqualTo(Integer value) {
            addCriterion("DELSIGN =", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignNotEqualTo(Integer value) {
            addCriterion("DELSIGN <>", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignGreaterThan(Integer value) {
            addCriterion("DELSIGN >", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELSIGN >=", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignLessThan(Integer value) {
            addCriterion("DELSIGN <", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignLessThanOrEqualTo(Integer value) {
            addCriterion("DELSIGN <=", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignIn(List<Integer> values) {
            addCriterion("DELSIGN in", values, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignNotIn(List<Integer> values) {
            addCriterion("DELSIGN not in", values, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignBetween(Integer value1, Integer value2) {
            addCriterion("DELSIGN between", value1, value2, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignNotBetween(Integer value1, Integer value2) {
            addCriterion("DELSIGN not between", value1, value2, "delsign");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_team_football
     *
     * @mbggenerated do_not_delete_during_merge Thu Oct 15 17:17:43 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_team_football
     *
     * @mbggenerated Thu Oct 15 17:17:43 CST 2015
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