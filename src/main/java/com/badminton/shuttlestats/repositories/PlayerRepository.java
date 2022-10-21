package com.badminton.shuttlestats.repositories;

import com.badminton.shuttlestats.model.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findByplayerName(String Name);
    List<Player> findByplayerGender(String Gender);
    List<Player> findByplayerMainHand(String mainHand);
}
