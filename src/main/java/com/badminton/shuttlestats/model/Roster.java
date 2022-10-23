package com.badminton.shuttlestats.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "roster")
public class Roster implements Serializable {

    @Id
    @Column(name = "club_id")
    private Long clubId;

    @Id
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "join_date")
    private Date joinDate;
}
