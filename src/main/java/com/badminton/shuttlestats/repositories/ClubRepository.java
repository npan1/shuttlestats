package com.badminton.shuttlestats.repositories;

import com.badminton.shuttlestats.model.Club;
import org.springframework.data.repository.CrudRepository;

public interface ClubRepository extends CrudRepository<Club, Long> {
}
