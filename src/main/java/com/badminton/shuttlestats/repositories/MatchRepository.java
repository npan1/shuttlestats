package com.badminton.shuttlestats.repositories;

import com.badminton.shuttlestats.model.Match;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository <Match, Long> {
}
