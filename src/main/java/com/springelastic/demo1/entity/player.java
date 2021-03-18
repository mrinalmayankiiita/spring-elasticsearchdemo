package com.springelastic.demo1.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "player")
public class player {

    @Id
    private Integer playerId;
    @Field(type = FieldType.Text, name = "firstname")
    private String firstName;
    @Field(type = FieldType.Text, name = "lastname")
    private String lastName;
    @Field(type = FieldType.Text, name = "type")
    private String type;
    @Field(type = FieldType.Integer, name = "age")
    private Integer age;
    @Field(type = FieldType.Integer, name = "totalRuns")
    private Integer totalRuns;
    @Field(type = FieldType.Integer, name = "tbatAverage")
    private Integer batAverage;
    @Field(type = FieldType.Integer, name = "totalWickets")
    private Integer totalWicktets;
    @Field(type = FieldType.Integer, name = "bowlAverage")
    private Integer bowlAverage;
    @Field(type = FieldType.Integer, name = "noofmatch")
    private Integer totalNumberOfMatches;

    public player(Integer playerId, String firstName, String lastName, String type, Integer age, Integer totalRuns, Integer batAverage, Integer totalWicktets, Integer bowlAverage, Integer totalNumberOfMatches) {
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.age = age;
        this.totalRuns = totalRuns;
        this.batAverage = batAverage;
        this.totalWicktets = totalWicktets;
        this.bowlAverage = bowlAverage;
        this.totalNumberOfMatches = totalNumberOfMatches;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Integer totalRuns) {
        this.totalRuns = totalRuns;
    }

    public Integer getBatAverage() {
        return batAverage;
    }

    public void setBatAverage(Integer batAverage) {
        this.batAverage = batAverage;
    }

    public Integer getTotalWicktets() {
        return totalWicktets;
    }

    public void setTotalWicktets(Integer totalWicktets) {
        this.totalWicktets = totalWicktets;
    }

    public Integer getBowlAverage() {
        return bowlAverage;
    }

    public void setBowlAverage(Integer bowlAverage) {
        this.bowlAverage = bowlAverage;
    }

    public Integer getTotalNumberOfMatches() {
        return totalNumberOfMatches;
    }

    public void setTotalNumberOfMatches(Integer totalNumberOfMatches) {
        this.totalNumberOfMatches = totalNumberOfMatches;
    }
}
