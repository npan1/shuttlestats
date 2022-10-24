package com.badminton.shuttlestats.repositories;

import com.badminton.shuttlestats.model.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findByName(String Name);
    List<Player> findByGender(String Gender);
    List<Player> findByMainHand(String mainHand);
    List<Player> findBymainHandAndGender(String mainHand, String Gender);
}
