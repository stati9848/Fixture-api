
package com.fixture.dto;

public class Fixtures {

    private String fixtureId;
    private FixtureStatus fixtureStatus;
    private FootballFullState footballFullState;
/*
    public Fixtures(){};

    public Fixtures (String fixtureId, FixtureStatus fixtureStatus, FootballFullState footballFullState){
        this.fixtureId = fixtureId;
        this.fixtureStatus = fixtureStatus;
        this.footballFullState = footballFullState;
    }*/

    public String getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(String fixtureId) {
        this.fixtureId = fixtureId;
    }

    public FixtureStatus getFixtureStatus() {
        return fixtureStatus;
    }

    public void setFixtureStatus(FixtureStatus fixtureStatus) {
        this.fixtureStatus = fixtureStatus;
    }

    public FootballFullState getFootballFullState() {
        return footballFullState;
    }

    public void setFootballFullState(FootballFullState footballFullState) {
        this.footballFullState = footballFullState;
    }

    public static Fixtures getFixturePayload(){
        Fixtures fixtures = new Fixtures();
        fixtures.setFixtureId("5");
        fixtures.setFixtureStatus(FixtureStatus.getFixtureStatus());
        fixtures.setFootballFullState(FootballFullState.getFootBallFullState());
        return fixtures;
    }
}
