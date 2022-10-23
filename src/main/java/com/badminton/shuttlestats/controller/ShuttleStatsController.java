package com.badminton.shuttlestats.controller;


import com.badminton.shuttlestats.model.Player;
import com.badminton.shuttlestats.repositories.ClubRepository;
import com.badminton.shuttlestats.repositories.MatchRepository;
import com.badminton.shuttlestats.repositories.PlayerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shuttlestats")
public class ShuttleStatsController {
    private ClubRepository clubRepository;
    private PlayerRepository playerRepository;
    private MatchRepository matchRepository;

    public ShuttleStatsController(ClubRepository clubRepository, PlayerRepository playerRepository, MatchRepository matchRepository) {
        this.clubRepository = clubRepository;
        this.playerRepository = playerRepository;
        this.matchRepository = matchRepository;
    }

    @GetMapping(path = "/players")
    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping(path = "/players/mainhand={mainhand}")
    public List<Player> getPlayersByMainHand(@PathVariable String mainhand) {
        List<Player> playerList;
        if (mainhand == "right") {
            playerList = playerRepository.findByplayerMainHand("R");
        } else if (mainhand == "left") {
            playerList = playerRepository.findByplayerMainHand("L");
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unable to find players by hand input");
        }
        return playerList;

    }

    @PostMapping("players")
    public Player addPlayer(@RequestBody Player player) {
        this.playerRepository.save(player);
        return player;
    }

}
