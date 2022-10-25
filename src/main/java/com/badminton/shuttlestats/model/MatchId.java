package com.badminton.shuttlestats.model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Embeddable
public class MatchId implements Serializable {

    @GeneratedValue
    private Long matchId;

    private Long sessionId;

    public MatchId() {};

    public MatchId(MatchId matchId) {
        this.matchId = matchId.getMatchId();
        this.sessionId = matchId.getSessionId();
    }

    public MatchId(Long matchId, Long sessionId) {
        this.matchId = matchId;
        this.sessionId = sessionId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchId matchId1 = (MatchId) o;

        if (!matchId.equals(matchId1.matchId)) return false;
        return sessionId.equals(matchId1.sessionId);
    }

    @Override
    public int hashCode() {
        int result = matchId.hashCode();
        result = 31 * result + sessionId.hashCode();
        return result;
    }
}
