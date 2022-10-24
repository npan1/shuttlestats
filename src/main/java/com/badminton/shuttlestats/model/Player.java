package com.badminton.shuttlestats.model;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "main_hand")
    private String mainHand;

    public Player() {}

    public Player(Player player) {
        this.name = player.getPlayerName();
        this.gender = player.getPlayerGender();
        this.mainHand = player.getPlayerMainHand();
    }

    public Player(Long playerId, String playerName, String playerGender, String playerMainHand) {
        this.playerId = playerId;
        this.name = playerName;
        this.gender = playerGender;
        this.mainHand = playerMainHand;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String playerName) {
        this.name = playerName;
    }

    public String getPlayerGender() {
        return gender;
    }

    public void setPlayerGender(String playerGender) {
        this.gender = playerGender;
    }

    public String getPlayerMainHand() {
        return mainHand;
    }

    public void setPlayerMainHand(String playerMainHand) {
        this.mainHand = playerMainHand;
    }
}

