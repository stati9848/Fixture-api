
package com.fixture.dto;

public class FixtureStatus {


    private Boolean displayed;
    private Boolean suspended;

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public static FixtureStatus getFixtureStatus(){
        FixtureStatus fixtureStatus = new FixtureStatus();
        fixtureStatus.setDisplayed(true);
        fixtureStatus.setDisplayed(false);
        return fixtureStatus;
    }
}
