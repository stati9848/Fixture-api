
package com.fixture.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Goal {
    private Integer clockTime;
    private Boolean confirmed;
    private Integer id;
    private Boolean ownGoal;
    private Boolean penalty;
    private String period;
    private Integer playerId;
    private String teamId;

    public Integer getClockTime() {
        return clockTime;
    }

    public void setClockTime(Integer clockTime) {
        this.clockTime = clockTime;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getOwnGoal() {
        return ownGoal;
    }

    public void setOwnGoal(Boolean ownGoal) {
        this.ownGoal = ownGoal;
    }

    public Boolean getPenalty() {
        return penalty;
    }

    public void setPenalty(Boolean penalty) {
        this.penalty = penalty;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public static List<Goal> getGoal(){
        Goal goal_1 = new Goal();
        goal_1.setClockTime(650);
        goal_1.setConfirmed(true);
        goal_1.setId(6547);
        goal_1.setOwnGoal(false);
        goal_1.setPenalty(false);
        goal_1.setPeriod("FIRST_HALF");
        goal_1.setPlayerId(560618);
        goal_1.setTeamId("2");

        Goal goal_2 = new Goal();
        goal_2.setClockTime(750);
        goal_2.setConfirmed(true);
        goal_2.setId(6549);
        goal_2.setOwnGoal(false);
        goal_2.setPenalty(false);
        goal_2.setPeriod("FIRST_HALF");
        goal_2.setPlayerId(560628);
        goal_2.setTeamId("2");

        List<Goal> goalList = new ArrayList<>();
        goalList.add(goal_1);
        goalList.add(goal_2);
        return goalList;
    }

}
