package com.badminton.shuttlestats.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Session {

    @Id
    @GeneratedValue
    private Long sessionId;

    private Long clubId;

    private Date sessionDate;

    private String sessionLocation;

    public Session() {}

    public Session(Session session) {
        this.sessionId = session.sessionId;
        this.clubId = session.clubId;
        this.sessionDate = session.sessionDate;
        this.sessionLocation = session.sessionLocation;
    }

    public Session(Long sessionId, Long clubId, Date sessionDate, String sessionLocation) {
        this.sessionId = sessionId;
        this.clubId = clubId;
        this.sessionDate = sessionDate;
        this.sessionLocation = sessionLocation;
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

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getSessionLocation() {
        return sessionLocation;
    }

    public void setSessionLocation(String sessionLocation) {
        this.sessionLocation = sessionLocation;
    }
}
