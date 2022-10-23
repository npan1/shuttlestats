package com.badminton.shuttlestats.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Match {

    @Id
    @GeneratedValue
    private Long matchId;

    private Long clubId;

    private Date matchDate;

    private String matchType;

    /*
    Need to figure out how to divide up players into two different teams.
    Is possible to have the following configurations

    (Team1 vs Team2) Player1 vs Player2
    OR
    (Team1 vs Team2) Player1+Player2 vs Player3+Player4

    What would be the optimal way of storing how players are divided in teams,
    would it affect how the data is stored in the database?

    private String playerOne;
    private String playerTwo;
    private String playerThree;
    private String playerFour;
    */

    private Long playerOneId;

    private Long playerTwoId;

    private Long playerThreeId;

    private Long playerFourId;

    private Integer winningTeam;

    private Integer teamOneScore;
    private Integer teamTwoScore;

    public Match() {}

    public Match(Match match) {
        this.matchId = match.getMatchId();
        this.clubId = match.getClubId();
        this.matchDate = match.getMatchDate();
        this.matchType = match.getMatchType();
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public Long getPlayerOneId() {
        return playerOneId;
    }

    public void setPlayerOneId(Long playerOneId) {
        this.playerOneId = playerOneId;
    }

    public Long getPlayerTwoId() {
        return playerTwoId;
    }

    public void setPlayerTwoId(Long playerTwoId) {
        this.playerTwoId = playerTwoId;
    }

    public Long getPlayerThreeId() {
        return playerThreeId;
    }

    public void setPlayerThreeId(Long playerThreeId) {
        this.playerThreeId = playerThreeId;
    }

    public Long getPlayerFourId() {
        return playerFourId;
    }

    public void setPlayerFourId(Long playerFourId) {
        this.playerFourId = playerFourId;
    }

    public Integer getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(Integer winningTeam) {
        this.winningTeam = winningTeam;
    }

    public Integer getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(Integer teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public Integer getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(Integer teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }
}
