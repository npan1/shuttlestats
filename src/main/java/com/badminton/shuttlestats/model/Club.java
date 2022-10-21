package com.badminton.shuttlestats.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Club {

    @Id
    @GeneratedValue
    private Long clubId;

    private String clubName;
    private Date creationDate;
    private Long organizerId;

    public Club() {}

    public Club(Club club) {
        this.clubId = club.getClubId();
        this.clubName = club.getClubName();
        this.creationDate = club.getCreationDate();
        this.organizerId = club.getOrganizerId();
    }

    public Club(Long clubId, String clubName, Date creationDate, Long organizerId) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.creationDate = creationDate;
        this.organizerId = organizerId;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(Long organizerId) {
        this.organizerId = organizerId;
    }


}
