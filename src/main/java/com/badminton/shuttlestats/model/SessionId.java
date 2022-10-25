package com.badminton.shuttlestats.model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;


@Embeddable
public class SessionId implements Serializable {

    @GeneratedValue
    private Long sessionId;
    private Long clubId;

    public SessionId() {};

    public SessionId(SessionId sessionId) {
        this.sessionId = sessionId.getSessionId();
        this.clubId = sessionId.getClubId();
    }

    public SessionId(Long sessionId, Long clubId) {
        this.sessionId = sessionId;
        this.clubId = clubId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SessionId sessionId1 = (SessionId) o;

        if (!sessionId.equals(sessionId1.sessionId)) return false;
        return clubId.equals(sessionId1.clubId);
    }

    @Override
    public int hashCode() {
        int result = sessionId.hashCode();
        result = 31 * result + clubId.hashCode();
        return result;
    }
}
