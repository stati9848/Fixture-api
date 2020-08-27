
package com.fixture.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FootballFullState {

    private String homeTeam;
    private String awayTeam;
    private Boolean finished;
    private Integer gameTimeInSeconds;
    private List<Goal> goals = null;
    private String period;
    private List<Object> possibles = null;
    private List<Object> corners = null;
    private List<Object> redCards = null;
    private List<Object> yellowCards = null;
    private String startDateTime;
    private Boolean started;
    private List<Team> teams = null;

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Integer getGameTimeInSeconds() {
        return gameTimeInSeconds;
    }

    public void setGameTimeInSeconds(Integer gameTimeInSeconds) {
        this.gameTimeInSeconds = gameTimeInSeconds;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public List<Object> getPossibles() {
        return possibles;
    }

    public void setPossibles(List<Object> possibles) {
        this.possibles = possibles;
    }

    public List<Object> getCorners() {
        return corners;
    }

    public void setCorners(List<Object> corners) {
        this.corners = corners;
    }

    public List<Object> getRedCards() {
        return redCards;
    }

    public void setRedCards(List<Object> redCards) {
        this.redCards = redCards;
    }

    public List<Object> getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(List<Object> yellowCards) {
        this.yellowCards = yellowCards;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public static FootballFullState getFootBallFullState(){
        FootballFullState fullState = new FootballFullState();
        fullState.setHomeTeam("Dagenham");
        fullState.setAwayTeam("Oterreic");
        fullState.setFinished(false);
        fullState.setGameTimeInSeconds(2657);
        fullState.setPeriod("FIRST_HALF");
        fullState.setStartDateTime("2018-03-20T10:49:38.655Z");
        fullState.setStarted(true);
        fullState.setGoals(Goal.getGoal());
        fullState.setTeams(Team.getTeam());
        return fullState;
    }

}
