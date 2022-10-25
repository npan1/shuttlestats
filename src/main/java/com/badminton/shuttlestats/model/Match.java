package com.badminton.shuttlestats.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Match {

    @Id
    @GeneratedValue
    @Column(name = "match_id")
    private Long matchId;

    @Id
    @Column(name = "session_id")
    private Long sessionId;

    @Id
    @Column(name = "match_type")
    private String matchType;

    @Column(name = "player_one_id")
    private Long playerOneId;

    @Column(name = "player_two_id")
    private Long playerTwoId;

    @Column(name = "player_three_id")
    private Long playerThreeId;

    @Column(name = "player_four_id")
    private Long playerFourId;

    @Column(name = "team_one_score")
    private Integer teamOneScore;

    @Column(name = "team_two_score")
    private Integer teamTwoScore;

    public Match() {}

    public Match(Match match) {
        this.matchId = match.getMatchId();
        this.sessionId = match.getMatchId();
        this.matchType = match.getMatchType();
        this.playerOneId = match.getPlayerOneId();
        this.playerTwoId = match.getPlayerTwoId();
        this.playerThreeId = match.getPlayerThreeId();
        this.playerFourId = match.getPlayerFourId();
        this.teamOneScore = match.getTeamOneScore();
        this.teamTwoScore = match.getTeamTwoScore();
    }

    public Match(Long matchId, Long sessionId, String matchType, Long playerOneId, Long playerTwoId, Long playerThreeId, Long playerFourId, Integer teamOneScore, Integer teamTwoScore) {
        this.matchId = matchId;
        this.sessionId = sessionId;
        this.matchType = matchType;
        this.playerOneId = playerOneId;
        this.playerTwoId = playerTwoId;
        this.playerThreeId = playerThreeId;
        this.playerFourId = playerFourId;
        this.teamOneScore = teamOneScore;
        this.teamTwoScore = teamTwoScore;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
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
