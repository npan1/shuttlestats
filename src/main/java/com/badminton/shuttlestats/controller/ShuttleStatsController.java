package com.badminton.shuttlestats.controller;


import com.badminton.shuttlestats.model.Player;
import com.badminton.shuttlestats.repositories.ClubRepository;
import com.badminton.shuttlestats.repositories.MatchRepository;
import com.badminton.shuttlestats.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shuttlestats/")
public class ShuttleStatsController {
    private ClubRepository clubRepository;
    private PlayerRepository playerRepository;
    private MatchRepository matchRepository;

    public ShuttleStatsController(ClubRepository clubRepository, PlayerRepository playerRepository, MatchRepository matchRepository) {
        this.clubRepository = clubRepository;
        this.playerRepository = playerRepository;
        this.matchRepository = matchRepository;
    }

    @GetMapping("players")
    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @PostMapping("players")
    public Player addPlayer(@RequestBody Player player) {
        this.playerRepository.save(player);
        return player;
    }

}
