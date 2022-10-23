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
    private String playerName;
    @Column(name = "gender")
    private String playerGender;
    @Column(name = "main_hand")
    private String playerMainHand;

    public Player() {}

    public Player(Player player) {
        this.playerName = player.getPlayerName();
        this.playerGender = player.getPlayerGender();
        this.playerMainHand = player.getPlayerMainHand();
    }

    public Player(Long playerId, String playerName, String playerGender, String playerMainHand) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerGender = playerGender;
        this.playerMainHand = playerMainHand;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerGender() {
        return playerGender;
    }

    public void setPlayerGender(String playerGender) {
        this.playerGender = playerGender;
    }

    public String getPlayerMainHand() {
        return playerMainHand;
    }

    public void setPlayerMainHand(String playerMainHand) {
        this.playerMainHand = playerMainHand;
    }
}

