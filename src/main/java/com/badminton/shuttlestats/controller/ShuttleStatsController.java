package com.badminton.shuttlestats.controller;


import com.badminton.shuttlestats.model.Player;
import com.badminton.shuttlestats.repositories.ClubRepository;
import com.badminton.shuttlestats.repositories.MatchRepository;
import com.badminton.shuttlestats.repositories.PlayerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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


    /*
    @GetMapping(path = "/players")
    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
    */

    @GetMapping(path = {"/players" ,"/players/hand={mainhand}&gender={gender}"})
    public List<Player> getPlayers(@PathVariable (required=false) Optional<String> mainhand, @PathVariable(required = false) Optional<String> gender) {

        if (mainhand.isPresent() && gender.isPresent()) {
            return playerRepository.findBymainHandAndGender(mainhand.get(), gender.get());
        } else if (mainhand.isPresent() && gender.isEmpty()) {
            return playerRepository.findByMainHand(mainhand.get());
        } else if (mainhand.isEmpty() && gender.isPresent()) {
            return playerRepository.findByGender(gender.get());
        } else {
            return (List<Player>) playerRepository.findAll();
        }
    }

    @PostMapping("players")
    public Player addPlayer(@RequestBody Player player) {
        this.playerRepository.save(player);
        return player;
    }

}
