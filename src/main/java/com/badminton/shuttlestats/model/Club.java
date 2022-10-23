package com.badminton.shuttlestats.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue
    @Column(name = "club_id")
    private Long clubId;

    @Column(name = "name")
    private String clubName;
    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "public_visibility")
    private Boolean publicVisibility;

    public Club() {}

    public Club(Club club) {
        this.clubId = club.getClubId();
        this.clubName = club.getClubName();
        this.creationDate = club.getCreationDate();
        this.publicVisibility =club.getPublicVisibility();
    }

    public Club(Long clubId, String clubName, Date creationDate, boolean publicVisibility) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.creationDate = creationDate;
        this.publicVisibility = publicVisibility;
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

    public Boolean getPublicVisibility() {
        return publicVisibility;
    }

    public void setPublicVisibility(Boolean publicVisibility) {
        this.publicVisibility = publicVisibility;
    }
}
