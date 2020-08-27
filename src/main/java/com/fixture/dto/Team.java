
package com.fixture.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String association;
    private String name;
    private String teamId;

    public String getAssociation() {
        return association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }


    public static List<Team> getTeam(){
        Team team_1 = new Team();
        team_1.setAssociation("HOME");
        team_1.setName("Dagenham-&-Redbridge");
        team_1.setTeamId("HOME");

        Team team_2 = new Team();
        team_2.setAssociation("AWAY");
        team_2.setName("Osterreich");
        team_2.setTeamId("AWAY");

        List<Team> teamList = new ArrayList<>();
        teamList.add(team_1);
        teamList.add(team_2);
        return teamList;
    }
}
